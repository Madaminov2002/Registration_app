import java.util.regex.Pattern;

public class UserService {
  private User user;

  public void checkUser(User user) {
    int n = 0;
    int n1 = 0;
    if (Pattern.matches("[A-Z][a-z]*\\ [A-Z][a-z]*", user.getFullName())) {
      n += 1;
    } else {
      System.out.println("You entered your fullname incorrectly!");
    }
    if (Pattern.matches("[a-z]*[0-9]{2}\\@[g][m][a][i][l]\\.[c][o][m]", user.getEmail())) {
      n += 1;
    } else {
      System.out.println("You entered your email incorrectly!");
    }
    if (Pattern.matches("\\+[9]{2}[8][9][1]?[3]?[4]?[7]?[0-9]{7}", user.getPhoneNumber())) {
      n += 1;
    } else {
      System.out.println("You entered your phone number incorrectly!");
    }
    int u=0;
    int l=0;
    int d=0;
    if (user.getPassword().length() >= 8) {
      for (int i = 0; i < user.getPassword().length(); i++) {
        if (Character.isUpperCase(user.getPassword().charAt(i))) {
          n1 += 1;
          break;
        }else {
          u++;
        }
      }
      for (int i = 0; i < user.getPassword().length(); i++) {
        if (Character.isLowerCase(user.getPassword().charAt(i))) {
          n1 += 1;
          break;
        }else {
          l++;
        }
      }
      for (int i = 0; i < user.getPassword().length(); i++) {
        if (Character.isDigit(user.getPassword().charAt(i))) {
          n1 += 1;
          break;
        }else {
          d++;
        }
      }
      if(u==user.getPassword().length()){
        System.out.println("Enter at least one uppercase letter in the password!");
      }if(l==user.getPassword().length()){
        System.out.println("Enter at least one lowercase letter in the password!");
      }if(d==user.getPassword().length()){
        System.out.println("Enter at least one number letter in the password!");
      }
      if (n1 == 3) {
        n += 1;
      }
    } else {
      System.out.println("Password must be at least 8 charactres long!");
    }

    if (n == 4) {
      System.out.println("You have successfully registered!");
    } else {
      System.out.println("You have not registered successfully!");
    }

  }

}
