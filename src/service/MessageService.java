package service;

import model.DataStorage;
import model.User;

public class MessageService {
    private final DataStorage dataStorage;

    public MessageService() {
        dataStorage = DataStorage.createStorage();
    }




}
