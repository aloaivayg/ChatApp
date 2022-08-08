package service;

import model.datastorage.DataStorage;
import model.Group;
import model.Message;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MessageService {
    private final DataStorage dataStorage;

    UserService userService;
    GroupService groupService;

    public MessageService() {
        dataStorage = DataStorage.createStorage();
        userService = new UserService();
        groupService = new GroupService();
    }

    //

    public Message getMessage(String messageId){
        return dataStorage.messageRepository.find(m -> m.getId().equals(messageId));
    }

    public boolean sendMessage(User sender, Object receiver, String text) {
        User tempSender = userService.getUser(sender.getUsername());

        String receiverName;
        Message message = null;

        //If receiver is a user
        if (receiver instanceof User) {
            receiverName = ((User) receiver).getUsername();
            User tempReceiver = userService.getUser(receiverName);
            message = new Message(sender.getUsername(), text,receiverName);
            tempReceiver.getMessageList().add(message);
        }
        //If receiver is a group
        else if (receiver instanceof Group){
            receiverName = ((Group) receiver).getId();
            Group tempGroup = groupService.getGroup(receiverName);
            message = new Message(sender.getUsername(), text,receiverName);
            tempGroup.getMessageList().add(message);
        } else {
            return false;
        }
        tempSender.getMessageList().add(message);

        return true;
    }

    public boolean deleteMessage(String messageId) {
        Message messageToDelete = getMessage(messageId);
        String destination = "";
        if (messageToDelete!=null) {
            dataStorage.messageRepository.delete(messageToDelete);

            //Find if receiver is user or group
            destination = messageToDelete.getUsername();
            if (!Objects.equals(destination, "")) {
                User user = userService.getUser(destination);
                user.getMessageList().remove(messageToDelete);
            } else {
                Group group = groupService.getGroup(destination);
                group.getMessageList().remove(messageToDelete);
            }
            return true;
        }
        return false;
    }

    public List<Message> getTopLatestMessage(User user, int noOfMsg, int exception) {
        List<Message> tempList = user.getMessageList();
        List<Message> result = new ArrayList<>();

        //Find start & end message
        int startFrom = tempList.size() -1 - exception;
        int endAt = startFrom - noOfMsg;

        for (int i = startFrom; i > noOfMsg; i--) {
            if (startFrom >=0 && endAt>=0) {
                result.add(tempList.get(i));
            } else {
                break;
            }
        }
        return tempList;
    }

    public List<Message> findMessageByKeywords(User user, String keyword) {
        List<Message> result = user.getMessageByKeywords(m -> m.getContent().contains(keyword));
        return result;
    }






}
