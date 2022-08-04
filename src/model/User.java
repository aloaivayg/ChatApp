package model;

import java.util.*;

public class User {
    //properties
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String fullName;
    private String hashPassword;
    private String gender;
    private Date dob;

    //status
    private boolean isActive;
    private boolean isAdmin;

    //lists
    private List<User> friendList;
    private Map<User, Boolean> friendRequest;
    private List<Message> messageList;
    
    public User(String username, String hashPassword) {
		this.username = username;
		this.hashPassword = hashPassword;
        friendList = new ArrayList<>();
        messageList = new ArrayList<>();
        friendRequest = new HashMap<>();
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public Map<User, Boolean> getFriendRequest() {
        return friendRequest;
    }

    public void setFriendRequest(User user,  boolean isAccetped) {
        this.friendRequest.put(user, isAccetped);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        fullName = firstName + " " + lastName;
        return fullName;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<User> friendList) {
        this.friendList = friendList;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", hashPassword='" + hashPassword + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}
