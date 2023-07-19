import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
  private static int nextPasswordPref = 1;
  private static int nextPasswordCommon = 1;

  private static final LinkedList<String> listCommon = new LinkedList<>();
  private static final LinkedList<String> listPref = new LinkedList<>();

  private static final String PREFERENTIAL = "P";
  private static final String COMMON = "C";

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    //execute scanner em loop infinito
     while (true){
       System.out.println("1- Emitir Senha preferencial");
       System.out.println("2- Emitir Senha normal");
       System.out.println("3- Chamar próxima senha");
       System.out.println("4- Sair");

       System.out.println("Escolha as opções abaixo para retirar um senha:");
       int option = scanner.nextInt();

       // switch?
       if (option == 1) {
         System.out.println("Sua senha preferencial é: " + emitPasswordPref());
       } else if (option == 2) {
         System.out.println("Sua senha comum é: " + emitPasswordCommon());
       } else if (option == 3) {
         System.out.println("A próxima senha é: " + nextPassword());
       } else if (option == 4) {
         scanner.close();
         System.out.println("Encerrando o processo");
       } else {
         System.out.println("Opção inválida");
       }
     }

  }

  public static String emitPasswordCommon(){
    //formatado para 3 decimais
    String passwordCommon = COMMON + String.format("%03d", nextPasswordCommon++);
    listCommon.offer(passwordCommon);
    return passwordCommon;
  }

  private static String emitPasswordPref(){
    //formatado para 3 decimais
    String passwordPref = PREFERENTIAL + String.format("%03d", nextPasswordPref++);
    listPref.offer(passwordPref);
    return passwordPref;
  }

  private static String nextPassword() {
    if (listPref.size() > 0) {
      return listPref.poll();
    } else if (listCommon.size() > 0) {
      return listCommon.poll();
    } else {
      return "Não há senhas";
    }
  }
}
