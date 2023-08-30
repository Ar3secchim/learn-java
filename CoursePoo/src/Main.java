import Schol.ScholarshipStudent;
import Schol.Studes;
import Schol.Teacher;
import Schol.Worker;

public class Main {
  public static void main(String[] args) {
    Studes p2 = new Studes("Renara", 25, "F", "Matematica");
    Teacher p3 = new Teacher("Renara", 25, "F", "Programação", 5000.00);
    Worker p4 = new Worker("Renara", 25, "F", "Diretoria");
    ScholarshipStudent p5 = new ScholarshipStudent("Renara", 25, "F", "Diretoria", "PROUNI");
    
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4); 
    System.out.println(p5); 
    p5.paymentMatr();
    p2.paymentMatr();
  }

}

