import java.util.Scanner;

public class HelloWord{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String name = scanner.nextLine();
    System.out.println("Bem vindo, " + name + "!!!");
    System.out.printf("Bem vindo, %s!!!", name);
  }
}
