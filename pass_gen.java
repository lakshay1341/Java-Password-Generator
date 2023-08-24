public class PasswordGenerator {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generatePassword(int length) {
        String password = "";

        for (int i = 0; i < length; i++) {
            int randomIndex = (int)(Math.random() * ALPHABET.length());
            password += ALPHABET.charAt(randomIndex);
        }

        return password;
    }

    public static void main(String[] args) {
        String password = generatePassword(12);
        System.out.println("The generated password is: " + password);
    }
}
