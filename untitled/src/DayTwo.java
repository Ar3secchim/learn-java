import java.util.Scanner;

public class DayTwo{

  public static void main(String[] args){
    DayTwo dayTwo = new DayTwo();
    dayTwo.executar();
  }

  public void executar(){
    final Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a nota 1º bimestre");
    float nota1 = scanner.nextFloat();
    System.out.println("A nota do primeiro bimestre foi registrada no valor de " + nota1);

    System.out.println("Informe a nota do 2º bimestre");
    float nota2 = scanner.nextFloat();
    System.out.println("Anota do segundo bimestre foi registrada no valor de " + nota2);

    System.out.println("Informe a nota do 3º bimestre");
    float nota3 = scanner.nextFloat();
    System.out.println("Anota do terceiro bimestre foi registrada no valor de " + nota3);

    System.out.println("Informe a nota do 4º bimestre");
    float nota4 = scanner.nextFloat();
    System.out.println("Anota do segundo bimestre foi registrada no valor de " + nota4);

    System.out.println("A media calculando");
    float media = (nota1 + nota2 + nota3 + nota4) /4;
    System.out.println("A media calculada foi:" + media);

    if (media >= 7){
      System.out.println("Parabéns");
    }else {
      System.out.println("Poxa, que pena. Ano que vem tente novamente");
    }
  }
}