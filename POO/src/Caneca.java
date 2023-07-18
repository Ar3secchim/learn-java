public class Caneca {
  String model = this.model;
  String cor = this.cor;
  boolean tampada = this.tampada;
  double ponta = this.ponta;
  int carga = this.carga;

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public void rabiscar() {
    if (tampada) {
      System.out.println("Caneta tampada");
    } else {
      rabiscar();
    }
  }
}
