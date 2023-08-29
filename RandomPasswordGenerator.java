import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the length of the password you want : ");
        int passwordLength = scanner.nextInt();
        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
		System.out.print("We are delighted to provide you with our esteemed services: ");
        scanner.close();
    }
    
    public static String generateRandomPassword(int length) 
	{
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charset.length());
            char randomChar = charset.charAt(randomIndex);
            password.append(randomChar);
        }
        
        return password.toString();
    }
}

