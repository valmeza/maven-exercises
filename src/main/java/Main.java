import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello from Maven!");
        System.out.println("Enter Something: ");
        String userResponse = input.nextLine();

        if(StringUtils.isNumeric(userResponse)) {
            System.out.println("You Entered: " + "\""+userResponse +"\"" +" is a number.");
        } else {
            System.out.println("You Entered: " + "\""+userResponse +"\"" +" is not a number.");
        }
        System.out.print("FLIPPED CASE: ");
        System.out.println(StringUtils.swapCase(userResponse));
        System.out.print("Reversed: ");
        System.out.println(StringUtils.reverse(userResponse));
    }
}