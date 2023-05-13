import java.util.Objects;

public class Book {
    private String nameOfBook; //название
    private Author author; // автор
    private int yearPublication; // год публикации книги


    public Book(String nameOfBook, Author author, int yearPublication) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }


    @Override
    public String toString() {
        return " Название книги - " + nameOfBook + " Автор книги - " +author.getFirstName()+ " " +author.getLastName()+ " Год издания книги - " +yearPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearPublication == book.yearPublication && Objects.equals(nameOfBook, book.nameOfBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, yearPublication);
    }

}

