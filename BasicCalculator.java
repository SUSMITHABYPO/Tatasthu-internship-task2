import java.util.*;
public class BasicCalculator {
    public static void main(String [] args){
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter Value for a : ");
    int a  = sc.nextInt();
    System.out.println("Enter value for  b : ");
    int b = sc.nextInt();
    System.out.println("Addition of a & b : "+(a + b));
    System.out.println("Difference of a & b : "+(a - b));
    System.out.println("Product of a & b : "+(a * b));
    System.out.println("Division of a & b : "+ (a / b));
}
    }
}
