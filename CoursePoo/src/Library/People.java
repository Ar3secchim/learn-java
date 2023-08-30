package Library;

public class People{
  private String name;
  private int old;
  private String sex;

  public People(String name, int old, String sex) {
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

  public int getOld() {
    return this.old;
  }

  public void setOld(int old) {
    this.old = old;
  }

  public String getSex() {
    return this.sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public People name(String name) {
    setName(name);
    return this;
  }

  public People old(int old) {
    setOld(old);
    return this;
  }

  public People sex(String sex) {
    setSex(sex);
    return this;
  }

  public void makeBirthday() {
    this.old++;
  }
}
