import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user=new User("Madaminov Suhrob","suhrobjonmadaminov37@gmail.com","+998911421332",
                "!Ss1&*(a");
        UserService userService=new UserService();
        userService.checkUser(user);
    }
}