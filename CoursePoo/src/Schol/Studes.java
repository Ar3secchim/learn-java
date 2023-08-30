package Schol;

public class Studes extends People{
  private Boolean matr;
  private String course;

  public Studes(String name, Integer old, String sex, String course) {
    super(name, old, sex);
    this.matr= true;
    this.course = course;
  }

  public Boolean getMatr() {
    return this.matr;
  }

  public void setMatr(Boolean matr) {
    this.matr = matr;
  }

  public String getCourse() {
    return this.course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public void closeMatr(){
    this.setMatr(false);
  }

  public void paymentMatr(){
    System.out.println(this.getName() + ", mensalidade paga");
  }

  @Override
  public String toString() {
    return "{" +
     " Name='" + getName() + "'" +
     " Sexo='" + getSex() + "'" +
     " Old='" + getOld() + "'" +
      " Matr='" + getMatr() + "'" +
      ", Course='" + getCourse() + "'" +
      "}";
  }
}
