import java.util.logging.*;
import java.util.Random;
import java.util.regex.Pattern;

public class R00_IDS03_J{
	public static void main(String[] args) {
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        Random rd = new Random();
        String username;
        boolean swap = rd.nextBoolean();
        if (swap)
        	username = "fasd_sdfzxc3394";
        else 
        	username = "fasdf_hjw-hjkui";
        boolean loginSuccessful = Pattern.matches("[A-Za-z0-9_]+", username);
        if (loginSuccessful) {
    	    logger.severe("User login succeeded for: " + sanitizeUser(username));
        }
        else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }
	
	//Parse to ensure pattern match and clean user
	public static String sanitizeUser(String username) {
		return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
	}
}