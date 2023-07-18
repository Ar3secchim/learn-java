public class Caneca{
  String model;
  String cor;
  boolean cheia;
  double tamanho;
  boolean usada;

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public void encher() {
    if (cheia) {
      System.out.println("Caneca Cheia");
    }else if (usada) {
      System.out.println("Caneta está suja");
    } else{
      System.out.println("Está sendo cheia");
    }
  }

  public void isUsada() {
     usada = true;
  }
}
