package service;

import java.util.ArrayList;
import java.util.List;

import model.Group;
import model.PrivateGroup;
import model.PublicGroup;
import model.User;
import model.datastorage.DataStorage;

public class GroupService {
    DataStorage dataStorage;
    UserService userService;
    List<String> inviteCodes;

    public GroupService() {
        super();
        dataStorage = DataStorage.createStorage();
        userService = new UserService();
        inviteCodes = new ArrayList<>();
    }

    void createGroup(String groupName, boolean isPrivate) {
        if (isPrivate) {
            PrivateGroup privateGroup = new PrivateGroup(groupName, isPrivate);

            dataStorage.groupRepository.insert(privateGroup);
        } else {
            String inviteCode = getAlphaNumericString();
            PublicGroup publicGroup = new PublicGroup(groupName, isPrivate);
            publicGroup.setInviteCode(checkInviteCode(inviteCode));
            dataStorage.groupRepository.insert(publicGroup);
        }
    }

    public boolean joinPublicGroup(String groupId, String inviteCode) {
        PublicGroup group = (PublicGroup) getGroupById(groupId);
        if (group == null) {
            return false;
        }
        if (group.isPrivate()) {
            return false;
        }
        if (!group.getInviteCode().equalsIgnoreCase(inviteCode)) {
            return false;
        }
        return true;
    }

    public boolean removeUserFromPrivateGroup(User currentUser, String adminUsername, String userUsername, String groupId) {
        var group = getGroupById(groupId);
        if (group == null) {
            return false;
        }
        var user = userService.getUser(userUsername);
        if (user == null) {
            return false;
        }
        if (!currentUser.getUsername().equalsIgnoreCase(adminUsername)) {
            return false;
        }
        if (!group.getUserList().contains(user)) {
            return false;
        }
        group.getUserList().remove(user);
        return true;
    }

    public boolean addUserToPrivateGroup(User currentUser, String adminUsername, String userUsername, String groupId) {
        var group = getGroupById(groupId);
        if (group == null) {
            return false;
        }
        var user = userService.getUser(userUsername);
        if (user == null) {
            return false;
        }
        if (!currentUser.getUsername().equalsIgnoreCase(adminUsername)) {
            return false;
        }
        if (group.getUserList().contains(user)) {
            return false;
        }
        group.getUserList().add(user);
        return true;
    }

    public Group getGroupById(String groupId) {
        return (Group) dataStorage.groupRepository.find(g -> g.getId().equals(groupId));
    }

    public Group getGroupByName(String groupName) {
        return (Group) dataStorage.groupRepository.find(g -> g.getName().equals(groupName));
    }

    public Group getPublicGroup() {
        return (PublicGroup) dataStorage.groupRepository.find(g -> !g.isPrivate());

    }

    public boolean findPrivateGroupAdmin(List<User> users, User admin, boolean isPrivate) {
        if (!isPrivate) {
            return false;
        }
        return users.contains(admin);
    }

    static String getAlphaNumericString() {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    public String checkInviteCode(String input) {
        while (true) {
            if (!inviteCodes.contains(input)) {
                inviteCodes.add(input);
                break;
            }
        }
        return input;
    }

}
