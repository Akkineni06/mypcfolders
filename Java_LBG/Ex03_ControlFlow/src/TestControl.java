public class TestControl {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            System.out.println("(" + n + ", " + (n + 10) + ")");
            n++;
        }
        System.out.println("---------------------------------------");
        int m = 1;
        int sum = 1;
        while (m < 10) {
            sum = sum * 2;
            System.out.println("(" + m + ", " + sum + ")");
            m++;
        }
        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("(" + i + ", " + (i + 10) + ")");
        }
        int sum1 = 1;
        for (int i = 1; i < 10; i++) {
            sum1 = sum1 * 2;
            System.out.println("(" + i + ", " + sum1 + ")");
        }
        System.out.println("---------------------------------------");
        int dayOfWeek = 6;
        if (dayOfWeek == 1) {
            System.out.println("It's a weekday");
        } else if (dayOfWeek == 2) {
            System.out.println("Its's weekday");
        } else if (dayOfWeek == 3) {
            System.out.println("Its's weekday");
        } else if (dayOfWeek == 4) {
            System.out.println("Its's weekday");
        } else if (dayOfWeek == 5) {
            System.out.println("Its's weekday");
        } else if (dayOfWeek == 6) {
            System.out.println("Its's weekend");
        } else if (dayOfWeek == 7) {
            System.out.println("Its's weekend");
        } else {
            System.out.println("Not sure where you get days from. Use 1 to 7");
        }

    }
}
