import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    //input so usuário
    final Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Digite um numero:");

    int number = scanner.nextInt();

    if(isCenteredTriangular(number)) {
      System.out.println("Esse numero " + number + " é triangular");
    }else{
      System.out.println("Esse numero " + number + " não é triangular");

    }
  }

  public static boolean isCenteredTriangular(int number){
    // Calcula a fórmula para encontrar o n-ésimo número triangular
    int numberQuadrant = (int) Math.sqrt(2 * number);
    double verificacaoNumber = (double) (numberQuadrant * (numberQuadrant + 1)) / 2;

    System.out.println(numberQuadrant);
    System.out.println(verificacaoNumber);

    //verificação da formula verdadeira
    return verificacaoNumber == number;
  }
}
