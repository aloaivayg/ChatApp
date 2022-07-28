package model.repository;

import model.User;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class MessageRepository implements IRepository{
    String filePath = "UserData";

    FileInputStream fis;

    public MessageRepository() {
        createFolder();
    }

    public void createFolder() {
        File folder = new File(filePath);
        if (folder.exists()) {
            System.out.println("Folder exist");
        } else {
            folder.mkdirs();
            System.out.println("Folder created");
        }
    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public int getId(String id) {
        return 0;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void add(Object obj) {

    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public void remove(int id) {

    }
}
