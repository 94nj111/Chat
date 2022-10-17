package academy.prog;

import lombok.Data;

@Data
public class User {

    private static final User user = new User();

    private User(){
    }

    private String login;

    public static User getInstance(){
        return user;
    }
}
