package service;

import model.datastorage.DataStorage;
import model.Group;
import model.Message;
import model.User;

public class MessageService {
    private final DataStorage dataStorage;

    UserService userService;

    public MessageService() {
        dataStorage = DataStorage.createStorage();
        userService = new UserService();
    }

    public boolean sendMessage(User sender, User receiver, String text) {

        Message message = new Message(sender.getUsername(), text,receiver.getUsername());
        dataStorage.messageRepository.insert(message);

        User tempSender = userService.getUser(sender.getUsername());
        User tempReceiver = userService.getUser(receiver.getUsername());

        if (tempReceiver!=null) {
            tempSender.getMessageList().add(message);
            tempReceiver.getMessageList().add(message);
        }

        return true;
    }




}
