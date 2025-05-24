public class Book {
    String nameBook;
    Author authorBook;
    int yearOfBookPublication;

    public Book(Author authorBook, String nameBook, int yearOfBookPublication) {
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.yearOfBookPublication = yearOfBookPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearOfBookPublication() {
        return yearOfBookPublication;
    }

    public void setYearOfBookPublication(int yearOfBookPublication) {
        this.yearOfBookPublication = yearOfBookPublication;
    }
}
