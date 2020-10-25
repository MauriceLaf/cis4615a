import java.util.logging.*;
import java.util.Random;

//IDS03-J. Do not log unsanitized user input Given the non-compliant code below:

public class R00_IDS03_J{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        Random rd = new Random();
        boolean loginSuccessful = rd.nextBoolean();
        String username = "fasd_sdfzxc34";
        if (loginSuccessful) {
    	    logger.severe("User login succeeded for: " + username);
        }
        else {
            logger.severe("User login failed for: " + username);
        }
    }
}