package Schol;

public class ScholarshipStudent extends Studes {
  private String scholar;

  public ScholarshipStudent(String name, Integer old, String sex, String course, String scholar) {
    super(name, old, sex, course);
    this.scholar = scholar;
  }

  public String getScholar() {
    return this.scholar;
  }

  public void setScholar(String scholar) {
    this.scholar = scholar;
  }

  
  @Override
  public void paymentMatr() {
    System.out.println(this.getName() + " é bolsista! Não paga mensalidade");
  }

  @Override
  public String toString() {
    return "{" +
    " Name='" + getName() + "'" +
     " Sexo='" + getSex() + "'" +
     " Old='" + getOld() + "'" +
      " Matr='" + getMatr() + "'" +
      ", Course='" + getCourse() + "'" +
      " scholar='" + getScholar() + "'" +
      "}";
  }
}
