package Schol;

public abstract class  People {
  private String name;
  private Integer old;
  private String sex;
  

  public People(String name, Integer old, String sex) {
    this.name = name;
    this.old = old;
    this.sex = sex;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getOld() {
    return this.old;
  }

  public void setOld(Integer old) {
    this.old = old;
  }

  public String getSex() {
    return this.sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", old='" + getOld() + "'" +
      ", sex='" + getSex() + "'" +
      "}";
  }
  
  final void toHappyBrithd(){
    this.old++;
  }
}
