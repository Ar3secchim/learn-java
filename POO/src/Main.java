public class Main {

  public static void main(String[] args) {
    Caneta caneta = new Caneta();

    caneta.carga = 100;
    caneta.cor= "Azul";
    caneta.tampada= true;
    caneta.model = "BIC";
    //caneta.ponta = 0.5;

    caneta.status();
  }
}
