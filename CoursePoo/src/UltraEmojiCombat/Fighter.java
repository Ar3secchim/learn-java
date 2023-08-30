package UltraEmojiCombat;

public class Fighter {
  private String name;
  private String nationality;
  private int old;
  private double height;
  private double weigth;
  private String category;
  private int vitory;
  private int defeats;
  private int ties;

  public Fighter(String name, String nationality, int old,double height, double weigth, int vitory, int defeats, int ties) {
    this.name = name;
    this.nationality = nationality;
    this.old = old;
    this.height = height;
    this.weigth = weigth;
    this.category = categoryWeigth();
    this.vitory = vitory;
    this.defeats = defeats;
    this.ties = ties;
  }

  public String getName() {
    return this.name;
  }

  private String getNationality() {
    return this.nationality;
  }

  private int getOld() {
    return this.old;
  }

  private double getHeight() {
   return this.height;
  }

  private double getWeigth() {
    return this.weigth;
  }

  private int getVitory() {
    return this.vitory;
  }

  private int getDefeats() {
    return this.defeats;
  }

  private int getTies() {
    return this.ties;
  }

  public String getCategory(){
    return this.category;
  }

  public void setVitory(int vitory) {
    this.vitory = vitory;
  }
  public void setDefeats(int defeats) {
    this.defeats = defeats;
  }
  public void setTies(int ties) {
    this.ties = ties;
  }

  private String categoryWeigth(){
    if(getWeigth() <= 70){
      return "Leve";
    }if (getWeigth() >=  70.1 && getWeigth() <= 94) {
      return "Médio";
    } if (getWeigth() >= 95) {
      return "Pesado";
    }else{
      return "Categoria inválida";
    }
  }


  public String toPresent() {
    return "{" +
      " name='" + this.getName() + "'" +
      ", nationality='" + getNationality() + "'" +
      ", old='" + getOld() + "'" +
      ", weigth='" + getWeigth() + "'" +
      ", height='" + getHeight() + "'" +
      ", category='" + categoryWeigth() + "'" +
      ", vitory='" + getVitory() + "'" +
      ", defeats='" + getDefeats() + "'" +
      ", ties='" + getTies() + "'" +
      "}";
  }

  public void winFight(){
    setVitory(getVitory() + 1);
  }

  public void lostFight(){
    setDefeats( getDefeats() + 1);
  }

  public void tiedFight(){
    setTies(getTies() + 1);
  }

}
