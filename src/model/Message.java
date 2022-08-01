package model;

public class Message {

    private String username;
    private String content;
    private String avatar;
    private String type;
    private String receiver;
    private String groupId;

    public Message() {

    }

    public Message(String username, String content, String type, String receiver, String groupId) {
        this.username = username;
        this.content = content;
        this.type = type;
        this.receiver = receiver;
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Message{" +
                "username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", receiver='" + receiver + '\'' +
                ", groupId='" + groupId + '\'' +
                '}';
    }
}
