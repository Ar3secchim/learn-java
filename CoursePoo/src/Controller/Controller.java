package Controller;

public class Controller implements interfaceController{
  private int volume;
  private boolean power;
  private boolean playing;

  public Controller() {
    this.setVolume(50);
    this.setPower(false);
    this.setPlaying(false);
  }

  private int getVolume() {
    return this.volume;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean getPower() {
    return this.power;
  }

  private void setPower(boolean power) {
    this.power = power;
  }

  private boolean getPlaying() {
    return this.playing;
  }

  private void setPlaying(boolean playing) {
    this.playing = playing;
  }

  @Override
  public void power() {
    this.setPower(true);
  }

  @Override
  public void powerOff() {
    this.setPower(false);
  }

  @Override
  public void openMenu() {
      System.out.println("Tocando:" + this.getPlaying());
      System.out.print("Volume:" );

      for (int i = 0; i < this.getVolume(); i+=10) {
        System.out.print("|");
      }
      System.out.println(" "+ getVolume());

  }

  @Override
  public void closeMenu() {
    System.out.print("Fechado Menu!");
  }

  @Override
  public void moreVolume() {
    if(this.getVolume() >= 0 || this.getPower()){
      this.setVolume(this.getVolume() + 5);
    }
  }

  @Override
  public void lessVolume() {
    if(getVolume() > 0 || this.getPower()){
      this.setVolume(this.getVolume() - 5);
    }
  }

  @Override
  public void powerMute() {
    if(this.getPlaying() && getVolume() > 0){
      this.setVolume(0);
    }
  }

  @Override
  public void powerOffMute() {
    if(this.getPlaying() && getVolume() == 0){
      this.setVolume(50);
    }
  }

  @Override
  public void play() {
    if(this.getPower() && !this.getPlaying()){
      this.setPlaying(true);
    }
  }

  @Override
  public void pause() {
    if(this.getPower() && this.getPlaying()){
      this.setPlaying(false);
    }
  }
}
