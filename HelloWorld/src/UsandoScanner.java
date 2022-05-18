import java.util.Scanner;

public class UsandoScanner {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre Com o primeiro número: ");
    String firstNumber = scanner.next();
    System.out.println("Entre com o Segundo número: ");
    String secoundNumber = scanner.next();
    scanner.close();
    int n1 = Integer.parseInt(firstNumber);
    int n2 = Integer.parseInt(secoundNumber);
    int result = n1 + n2;
    System.out.println(firstNumber + " + " + secoundNumber + " = " + result);
  }
}