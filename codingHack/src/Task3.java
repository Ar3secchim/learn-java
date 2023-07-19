import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
  private static int nextPasswordPref = 1;
  private static int nextPasswordNormal = 1;

  private static final LinkedList<String> listNormal = new LinkedList<>();
  private static final LinkedList<String> listPref = new LinkedList<>();

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
         System.out.println("Sua senha comum é: " + emitPasswordNormal());
       } else if (option == 3) {
         System.out.println("A próxima senha é: " + nextPassword());
       } else if (option == 4) {
         scanner.close();
         System.out.println("Encerrando o processo");
         break;
       } else {
         System.out.println("Opção inválida");
       }
     }

  }

  public static String emitPasswordNormal(){
    //formatado para 3 decimais
    String passwordNorma = "C" + String.format("%03d", nextPasswordNormal++);
    listNormal.offer(passwordNorma);
    return passwordNorma;
  }

  private static String emitPasswordPref(){
    //formatado para 3 decimais
    String passwordPref = "P" + String.format("%03d", nextPasswordPref++);
    listPref.offer(passwordPref);
    return passwordPref;
  }

  private static String nextPassword() {
    String password;
    if (!listPref.isEmpty()) {
      password = listPref.poll();
    } else if (!listNormal.isEmpty()) {
      password = listNormal.poll();
    } else {
      password = "Não há senhas";
    }
    return password;
  }

}
