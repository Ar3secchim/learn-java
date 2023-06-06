import java.io.ObjectStreamClass;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.LocalDateTime;
import java.util.Locale;


public class main {

  public static void string(String[] args){
    //string
    String name = "Renara";
    System.out.println("Olá "+ name);
  }

  public static void number(Number[] args) {
    //number
    // number decimal
    double doublNumber = (double) 8; 
    //interval usually
    double intNumber = (double) 9;

    double division = intNumber / doublNumber;
    System.out.println(division);
  }

  public static void logicos(boolean[] args) {
    //boolean operadores logicos
    boolean weekEnd = true;
    boolean makeSun = true;

    System.out.println(weekEnd == makeSun);
  }

  public static void Condicional(String[] args){
    int nota = 90; 

    if(nota >= 70){
      System.out.println("Aluno aprovado");
    }else{
      System.out.println("Aluno reprovado");
    }
  }

  public static void manipulacaoStringAndDate(String[] args) {
    String name = "Renara";

    LocalDate day = LocalDate.now();
    Locale brDate = new Locale("pt", "BR");
    String dayWeek = day.getDayOfWeek().getDisplayName(TextStyle.FULL, brDate);
    String saudaString;
    LocalDateTime now = LocalDateTime.now();

   if(now.getHour() >= 0 && now.getHour() < 12){
    saudaString = "Bom dia";
   }else if(now.getHour() >= 12 && now.getHour() <= 18){
    saudaString = "Boa Tarde";
   }else if(now.getHour() >= 18 && now.getHour() <= 24){
    saudaString = "Boa Noite";
   }else{
    saudaString= "";
   }

    System.out.printf(" Olá, %s. Hoje é %s. %s", name, dayWeek, saudaString.toUpperCase());
  }

  public static void repeat(String[] args) {
    
    for (int i = 0; i < 10; i++) {
      System.out.println(i * 8);
    }
  }

  public static void array(String[] args){
    int[] array ={1,2,3,4,5};

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    System.out.println(array);
  }

  public static void main(String[] args) {
    saudacao("Renara");

  }

  public static void saudacao(String nome) {
    System.out.println("Hellou, " + nome);
  }
}