public class Caneta{
    String model;
    String cor;
    boolean tampada;
    private double ponta;
    protected int carga;

    //void é sem retorno
    void status(){
      System.out.println("Cor: " + this.cor);
      System.out.println("Modelo: " + this.model);
      System.out.println("Está tampada: " + this.tampada);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Carga: " + this.carga);
    }

    public void rabiscar(){
      if(tampada){
        System.out.println("Caneta tampada");
      }else{
        System.out.println("Rabiscando");
      }
    }

    public void tampar() {
      this.tampada = true;
      System.out.println("Esta caneta foi tampada " + tampada);
    }

    private void destampar(){
      this.tampada = false;
      System.out.println("Esta caneta foi destampada " + tampada);
    }
}

