// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner s = new Scanner(System.in);
        int num1, num2;

        String op;

        System.out.println("Please give me a number");
        num1 = Integer.valueOf(s.nextLine());

        System.out.println("Please give me another number");
        num2 = Integer.valueOf(s.nextLine());

        System.out.println("Please give me an operator");
        op = s.nextLine();

        switch (op){
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println((float)num1/(float)num2);
                break;
            case "+":
                System.out.println((num1+num2));
                break;
            case "-":
                System.out.println(num1-num2);
            default:
                System.out.println("That is an invalid operation");
                break;
        }
    }
}