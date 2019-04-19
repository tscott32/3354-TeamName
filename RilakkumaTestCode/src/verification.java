import java.io.File;
import java.util.Scanner;

public class verification {

    public static String verifyLogin(String username, String password) {
        boolean found = false;
        String tempUsername ;
        String tempPassword ;
        try {

            Scanner x = new Scanner(new File("src/info.txt"));
            x.useDelimiter("[:\n]");

            while (x.hasNext() && !found) {

                tempUsername = x.next();
                tempPassword = x.next();
                if (tempUsername.trim().equals(username) && tempPassword.trim().equals(password.trim())) {
                    found = true;
                }

            }
            x.close();
            if(found){
                return ("access granted");
            } else {
                return ("access denied");
            }
        } catch (Exception e) {
            return("Error");
        }
    }
}
