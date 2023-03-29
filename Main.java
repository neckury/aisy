import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static boolean
    isValidPassword(String password)
    {

        String regex = "^(?=.*[0-9])"
                      + "(?=.*[a-zA-Z])"
                      + "(?=.*[а-яА-Я])"
                      + "(?=\\S+$).{8,20}$";
 
        Pattern p = Pattern.compile(regex);
 
        if (password == null) {
            return false;
        }

        Matcher m = p.matcher(password);

        return m.matches();
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        System.out.println("введите новый пароль:");
        String string = s.nextLine();
        if(isValidPassword(string)==true){
            System.out.println("пароль хороший");
        }
        else System.out.println("пароль слабый");
    }
}
