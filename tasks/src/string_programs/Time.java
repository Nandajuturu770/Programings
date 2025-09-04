
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your you number to find time :: ");
        String timeString = scanner.nextLine();
        System.out.println(findTime(timeString));
    }

    public static String findTime(String timeString) {
        int time = Integer.parseInt(timeString.trim());
        int t = time/60; int m = time%60;
        return t+":"+m;
    }
}
