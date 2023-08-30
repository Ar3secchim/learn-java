package Schol;

public class Teacher extends People {
  private String specialty;
  private Double wage;

  public Teacher(String name, Integer old, String sex, String specialty,  Double wage) {
    super(name, old, sex);
    this.specialty = specialty;
    this.wage = wage;
  }

  public String getSpecialty() {
    return this.specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public Double getWage() {
    return this.wage;
  }

  public void setWage(Double wage) {
    this.wage = wage;
  }
 
  public Teacher salaryIncrease(Double Increase) {
    setWage(getWage() + Increase);
    return this;
  }


  @Override
  public String toString() {
    return "{" +
    " name='" + getName() + "'" +
    ", old='" + getOld() + "'" +
    ", sex='" + getSex() + "'" +
      " specialty='" + getSpecialty() + "'" +
      ", wage='" + getWage() + "'" +
      "}";
  }

}
