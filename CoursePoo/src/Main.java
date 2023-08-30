import java.util.ArrayList;

import Library.Book;
import Library.People;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<People> peoplesList = new ArrayList<People>();
    ArrayList<Book> booksList = new ArrayList<Book>();

    peoplesList.add(new People("Renara", 25, "Femenino"));
    peoplesList.add(new People("Pedro ", 40, "Masculino"));
    peoplesList.add(new People("Anelise", 31, "Femenino"));


    booksList.add(new Book("O idiota", "Fiodor Dostoiévski", 782, 0, peoplesList.get(0)));
    booksList.add(new Book("Memórias das casa dos mortos", "Fiodor Dostoiévski", 452, 0, peoplesList.get(1)));
    booksList.add(new Book("Ressurreição", " Tolstói", 585, 0, peoplesList.get(2)));

    System.out.println(booksList.get(0));
    System.out.println(booksList.get(1));
    System.out.println(booksList.get(2));

  }

}

