package curso;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.TextStyle;

public class manipulacaoStringAndDate {
   public static void main(String[] args) {
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
}
