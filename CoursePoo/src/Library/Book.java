package Library;

public class Book implements Publication{
  private String title;
  private String author;
  private int totalPages;
  private int toPage;
  private Boolean open;
  private People reader;

  public Book(String title, String author, int totalPages, int toPage,People reader) {
    this.title = title;
    this.author = author;
    this.totalPages = totalPages;
    this.toPage = 0;
    this.open = false;
    this.reader = reader;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getTotalPages() {
    return this.totalPages;
  }

  public void setTotalPages(int totalPages) {
    this.totalPages = totalPages;
  }

  public int getToPage() {
    return this.toPage;
  }

  public void setToPage(int toPage) {
    this.toPage = toPage;
  }

  public Boolean getOpen() {
    return this.open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public People getReader() {
    return this.reader;
  }

  public Book title(String title) {
    setTitle(title);
    return this;
  }

  public Book author(String author) {
    setAuthor(author);
    return this;
  }

  public Book totalPages(int totalPages) {
    setTotalPages(totalPages);
    return this;
  }

  public Book toPage(int toPage) {
    setToPage(toPage);
    return this;
  }

  public Book open(Boolean open) {
    setOpen(open);
    return this;
  }

  @Override
  public String toString() {
    return
      "title='" + getTitle() + "\n" +
      "author='" + getAuthor() + "\n" +
      "totalPages='" + getTotalPages() + "\n" +
      "toPage='" + getToPage() + "\n" +
      "open='" + getOpen() + "\n" +
      "reader='" + getReader().getName() + "\n";
  }

  @Override
  public void open() {
    this.setOpen(true);
  }

  @Override
  public void close() {
    this.setOpen(false);
  }

  @Override
  public void flipPage(int toPage) {
    this.setToPage(toPage);
  }

  @Override
  public void nextPage() {
    this.setToPage(getToPage() + 1 );
  }

  @Override
  public void backPage() {
    this.setToPage(getToPage() - 1 );
  }

}
