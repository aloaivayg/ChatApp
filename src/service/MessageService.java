package service;

import model.DataStorage;
import model.Group;
import model.Message;
import model.User;

public class MessageService {
    private final DataStorage dataStorage;

    public MessageService() {
        dataStorage = DataStorage.createStorage();
    }

    public boolean sendMessage(User sender, User receiver, String text, Group groupId) {

        Message message = new Message(sender.getUsername(), text,receiver.getUsername(),groupId.getId());

        return true;
    }


}
