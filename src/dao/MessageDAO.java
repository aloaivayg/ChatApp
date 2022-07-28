package dao;

import object.User;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class MessageDAO implements DAO{


    String filePath = "UserData";

    FileInputStream fis;

    public MessageDAO() {
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
    public void create(User user) {

    }

    @Override
    public void read(String id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String id) {

    }
}
