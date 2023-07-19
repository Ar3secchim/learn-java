import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("Digite numeros que queria realizar as operações:");
      System.out.print("Digite um primeiro numero: ");
      int n1 = scanner.nextInt();

      System.out.print("Digite outro segundo numero: ");
      int n2 = scanner.nextInt();

      System.out.println("Qual operação deseja realizar");
      System.out.println("1- Multiplicação");
      System.out.println("2- Divisão");
      System.out.println("3- As duas operações");
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          multi(n1, n2);
          break;
        case 2:
          division(n1, n2);
          break;
        case 3:
          multi(n1, n2);
          division(n1, n2);
          break;
        default:
          System.out.println("Opção errada");
          break;
      }
    }
  }

  static void multi(int n1, int n2) {
    int multi = 0;

    for(int i = 0; i < n2; i++){
      multi += n1;
    }

    System.out.println("Multiplicação: " + n1 + "x" + n2 + ": " + multi);
  }

  static void division(int n1, int n2){
    int division = 0;

    while(n1 >= n2){
      division++;
      n1 -= n2;
    }

    System.out.println("Divisão: "  + n1 + "/" + n2 + ": " +  + division);
  }
}
