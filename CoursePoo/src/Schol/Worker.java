package Schol;

public class Worker extends People {
  private String sector;
  private Boolean active;

  public Worker(String name, Integer old, String sex, String sector) {
    super(name, old, sex);
    this.sector= sector;
    this.active = true;
  }


  public String getSector() {
    return this.sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public Boolean getActive() {
    return this.active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void changeJob(String sector){
    setSector(sector);
  }

  @Override
  public String toString() {
    return "{" +
    " name='" + getName() + "'" +
    ", old='" + getOld() + "'" +
    ", sex='" + getSex() + "'" +
      " sector='" + getSector() + "'" +
      ", active='" + getActive() + "'" +
      "}";
  }
}
