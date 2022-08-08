package test;

import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.MessageService;
import service.UserService;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest {
    private MessageService messageService;
    private UserService userService;
    @BeforeEach
    void setUp() {
        messageService = new MessageService();
        userService = new UserService();
    }

    @Test
    void sendMessage() {

        userService.signUp("bao", "1");
        userService.signUp("thong", "1");

        User user1 = userService.getUser("bao");
        User user2 = userService.getUser("thong");

        String msg = "Hellloooo";

        messageService.sendMessage(user1, user2, msg);

        String expected = "Hellloooo";
        String actual = user2.getMessageList().get(0).getContent();

        assertEquals(expected, actual);
    }

    //Null user
    @Test
    void sendMessage1() {

        userService.signUp("bao", "1");

        User user1 = userService.getUser("bao");
        User user2 = userService.getUser("thong");

        String msg = "Hellloooo";

        messageService.sendMessage(user1, user2, msg);

        String expected = "Hellloooo";
        String actual = user2.getMessageList().get(0).getContent();

        assertEquals(expected, actual);
    }
}