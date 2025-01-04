package p1;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        // Define the number to check
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
            System.out.println("from bharat");

        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int remender = number % 10;
            sum = sum+ remender*remender*remender;
            number = number/10;
        }
        return sum == originalNumber;
    }
    
}
