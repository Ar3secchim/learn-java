import Controller.Controller;

public class Main {
  public static void main(String[] args) {
    Controller controller = new Controller();

    controller.play();
    controller.openMenu();

    controller.powerMute();
    controller.openMenu();
  }

}

