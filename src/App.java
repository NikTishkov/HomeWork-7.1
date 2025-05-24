public class App {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book(author, "Казаки", 1865);
        book.yearOfBookPublication = 1863;
        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book(author1, "Евгений Онегин", 1833);
        System.out.println("Author = " + author.firstNameAuthor + " " + author.surNameAuthor);
        System.out.println("Author1 = " + author1.firstNameAuthor + " " + author1.surNameAuthor);
        System.out.println("Book = Автор: " + author.firstNameAuthor + " " + author.surNameAuthor + ". Название произведения: " + book.nameBook + ". Год публикации книги: " + book.yearOfBookPublication + ".");
        System.out.println("Book1 = Автор: " + author1.firstNameAuthor + " " + author1.surNameAuthor + ". Название произведения: " + book1.nameBook + ". Год публикации книги: " + book1.yearOfBookPublication + ".");
    }
}
