package status;

import java.util.Scanner;

public class Status {
    public enum UserStatus {
        ZERO, ONE, TWO, THREE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (ZERO, ONE, TWO, THREE):");
        String codeStr = in.next().toUpperCase();

        try {
            UserStatus code = UserStatus.valueOf(codeStr);
            StausUser user = new StausUser();
            user.statusDetail(code);
        } catch (IllegalArgumentException e) {
            System.out.println("NOT VALID CODE");
        }
    }
}
