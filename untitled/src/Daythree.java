import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Daythree{
  //static sempre herda o valor
  public static void main(String[] args) {
    final Daythree daythree = new Daythree();
    daythree.execute();
  }

  public void execute(){
    //responsável pela entrada do input
    final Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Escolha um das opções abaixo:");
    System.out.println("1- Verificar o dia da semana");
    System.out.println("2- Verificar um loop while");
    System.out.println("3- Verificar um loop doWhile");
    System.out.println("4 -Verificar um for");
    System.out.println("5 -Tipos de for");

    int opcao = scanner.nextInt();

    switch(opcao){
      case 1:
        verificarDiaDasemana();
        break;
      case 2:
        executarLoopWhile();
        break;
      case 3:
        doWhile();
        break;
      case 4:
        executarFor();
        break;
      case 5:
        arrayFor();
        break;
      default:
        System.out.println("Opção inválida");
    }
  }

  private void verificarDiaDasemana(){
    System.out.println("Irei verificar dia da semana");
    LocalDate day = LocalDate.now();
    DayOfWeek dayOfWeek = day.getDayOfWeek();
    System.out.println("Hoje é " + dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
  }

  private void executarLoopWhile(){
    System.out.println("Irei verificar Loop While");

    final Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Informe um numero: ");


    int max = scanner.nextInt();
    int contador = 1;

    while (contador <= max) {
      System.out.println(contador);
      contador++;
    }
  }

  private void doWhile(){
    System.out.println("Irei executar do While");

    final Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Informe um numero: ");


    int max = scanner.nextInt();
    int contador = 1;
    do{
      System.out.println("contador: " + contador++);
    }while (contador <= max);
  }

  private void executarFor(){
    System.out.println("Irei executar um for");

    final Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Informe um numero: ");

    int max = scanner.nextInt();

    for(int contador = 1; contador <= max; contador++){
      System.out.println("contador: " + contador);
    }
  }

  public static void arrayFor(){
    int[] meusNumeros =new int[10];

    //Foreach no java
    for(int numero: meusNumeros){
      System.out.println(numero);
    }

    LinkedList<String> filaPalavras = new LinkedList<>();
    //FILA
    filaPalavras.offer("Renara");
    filaPalavras.offer("Camila");
    filaPalavras.offer("Jorge");
    filaPalavras.offer("Kadu");

    while(filaPalavras.size() > 0){
      System.out.println(filaPalavras.poll());
    }

    //PILHA
    filaPalavras.push("Renara");
    filaPalavras.push("Camila");
    filaPalavras.push("Jorge");
    filaPalavras.push("Kadu");

    while(filaPalavras.size() > 0){
      System.out.println(filaPalavras.pop());
    }
  }

}
