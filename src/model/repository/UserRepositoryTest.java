package model.repository;

import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private UserRepository userRepository;
    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void get() {
        User user1 = new User("bao","1");
        userRepository.userList.add(user1);
        String expected = "bao";
        String actual = userRepository.get("bao").getUsername();

//        User expected = null;
//        User actual = userRepository.get("bao");
        assertEquals(expected, actual);
    }

    @Test
    void getId() {
        User user1 = new User("bao","1");
        userRepository.userList.add(user1);
        int expected = 0;
        int actual = userRepository.getId("bao");

        assertEquals(expected, actual);
    }

    @Test
    void getAll() {
    }

    @Test
    void add() {
        User user1 = new User("bao","1");
        userRepository.add(user1);

        String expected = "bao";
        String actual = userRepository.userList.get(0).getUsername();

        assertEquals(expected, actual);
    }

    @Test
    void saveFriend() {
    }

    @Test
    void removeFriend() {
    }

    @Test
    void update() {
    }

    @Test
    void remove() {
    }

    @Test
    void removeById() {
    }
}