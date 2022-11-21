import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your Annual Income: $");
        int  income= scanner.nextInt();
        // ? and : are ternary operators
        // \ backslash to create an escape sequence
        String className= income>100_000 ?  "\"First Class\"" : "\"Economy Class\"";
        System.out.println("Assigned to : "+className + "! \nYou put annual income: $"+income);



    }

}

