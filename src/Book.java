public class Book {
    private String name;
    private String author;
    private int yearOfPublishing;

    public Book(String name, Author jamesHarriott, int yearOfPublishing) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }
    public String getName() {
    return this.name;
    }
    public String getAuthor() {
    return this.author;
        }
        public int getYearOfPublishing() {
    return this.yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
    this.yearOfPublishing = yearOfPublishing;

    }
}
