import org.example.dao.UserDaoImpl;
import org.example.models.User;
import org.example.services.UserServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private User user = new User("Вова");
    private User user1 = new User();

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserDaoImpl userDao;

    @Test
    public void checkUserExistTestTrue() {
        Assertions.assertNotNull(userService);
        Mockito.when(userService.checkUserExist(user)).thenReturn(true);
    }

    @Test
    public void checkUserExistTestIsFalse() {
        Assertions.assertNotNull(userService);
        Mockito.when(userService.checkUserExist(user1)).thenReturn(false);
    }
}
