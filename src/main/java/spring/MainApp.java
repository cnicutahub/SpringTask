package spring;
import java.util.List;

import model.UserEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.service.UserService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        // Add Users
        userService.add(new UserEntity("userneme","password","first name","secondname"));

        // Get Users
        List<UserEntity> users = userService.listUsers();
        for (UserEntity user : users) {
            System.out.println(user);
        }

        context.close();
    }
}