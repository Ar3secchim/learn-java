import java.util.Scanner;

public class DayOne{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digit seu nome: ");
    String name = scanner.nextLine();
    System.out.println("Bem vindo, " + name + "!!!");
    System.out.printf("Bem vindo, %s!!!", name);
  }
}
