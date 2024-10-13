import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;
    private boolean valid;
    private String errorMessage;

    private static final Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid() {
        return valid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public static void main(String[] args) {
        PasswordValidator validator = login();
        printPasswordRules();

        do {
            String proposedPassword = getProposedPassword();
            validator.changePassword(proposedPassword);

            if (!validator.isValid()) {
                System.out.println(validator.getErrorMessage());
            }

        } while (!validator.isValid());

        System.out.println("The proposed password is valid.");
    }

    public static PasswordValidator login() {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        return new PasswordValidator(username, password);
    }

    public static void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* At least 8 characters long");
        System.out.println("* Contain an uppercase letter");
        System.out.println("* Contain a special character");
        System.out.println("* Not contain the username");
        System.out.println("* Not the same as the old password\n");
    }

    public static String getProposedPassword() {
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }

    public void changePassword(String newPassword) {
        valid = true;
        StringBuilder errors = new StringBuilder();

        if (newPassword.length() < 8) {
            valid = false;
            errors.append("\n Your password must be at least 8 characters.");
        }

        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errors.append("\n Your password must include an uppercase letter.");
        }

        if (newPassword.matches("[a-zA-Z0-9 ]*")) {
            valid = false;
            errors.append("\n Your password must include a special character (e.g. %, $, [:).");
        }

        if (newPassword.toUpperCase().contains(username.toUpperCase())) {
            valid = false;
            errors.append("\n Your password cannot contain your username.");
        }

        if (newPassword.equals(currentPassword)) {
            valid = false;
            errors.append("\n Your password must be different from your current password.");
        }

        errorMessage = errors.toString();
    }
}
