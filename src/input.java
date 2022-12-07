import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something:");
        String something = scan.nextLine();
        System.out.println(something);
    }
}