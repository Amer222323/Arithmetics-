
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        n1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        n2 = scanner.nextInt();

        System.out.println("Enter the name of Operation (sum, mult, div, modulo, sub):");
        String operation = scanner.next();

        int answer = 0;
        Arthmitics calculator = new Arthmitics();

        if (operation.equals("sum")) {
            answer = calculator.sum(n1, n2);
        } else if (operation.equals("mult")) {
            answer = calculator.mult(n1, n2);
        } else if (operation.equals("div")) {
            if (n2==0){
                System.out.println("Answer is Undefined");
                System.exit(1);
            }else {
            answer = calculator.div(n1, n2);}
        } else if (operation.equals("modulo")) {
            answer = calculator.modulo(n1, n2);
        } else if (operation.equals("sub")) {
            answer = calculator.sub(n1, n2);
        } else {
            System.out.println("Invalid operation.");
            System.exit(1);
        }

        System.out.println("The Answer: " + answer);
    }
    /*switch (operation) {
        case "sum" -> answer = calculator.sum(n1, n2);
        case "mult" -> answer = calculator.mult(n1, n2);
        case "div" -> answer = calculator.div(n1, n2);
        case "modulo" -> answer = calculator.modulo(n1, n2);
        case "sub" -> answer = calculator.sub(n1, n2);
        default -> {
            System.out.println("Invalid operation.");
            System.exit(1);
        }
    }

        System.out.println("The Answer: " + answer);
}*/
}