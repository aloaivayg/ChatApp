package model;

public class Message {

    private String id;
    private String username;
    private String content;

    private String receiver;
    private String groupId;

    public Message() {

    }

    public Message(String username, String content, String receiver, String groupId) {
        this.username = username;
        this.content = content;

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
                ", receiver='" + receiver + '\'' +
                ", groupId='" + groupId + '\'' +
                '}';
    }
}
