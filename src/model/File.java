package model;

import java.io.FileOutputStream;

public class File {
    private String filename;
    private String fileType;
    private FileOutputStream fileOutputStream;
    private String sender;
    private String receiver;
    private Long groupId;
    private String url;

    public File(String filename, String fileType, FileOutputStream fileOutputStream, String sender, String receiver,
                Long groupId, String url) {
        this.filename = filename;
        this.fileType = fileType;
        this.fileOutputStream = fileOutputStream;
        this.sender = sender;
        this.receiver = receiver;
        this.groupId = groupId;
        this.url = url;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public FileOutputStream getFileOutputStream() {
        return fileOutputStream;
    }

    public void setFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
