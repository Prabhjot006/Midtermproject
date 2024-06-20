package status;

import status.Status.UserStatus;

public class StausUser {
    public void statusDetail(UserStatus code) {
        switch (code) {
            case ZERO:
                System.out.println("REJECTED");
                break;
            case ONE:
                System.out.println("PENDING");
                break;
            case TWO:
                System.out.println("PROCESSING");
                break;
            case THREE:
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
}
