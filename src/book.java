import java.util.Objects;

public class book {

    private String bookName;
    private author author;
    int year;

    //Конструктор
    public book(String bookName, author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    //Геттеры
    public String getBookName() {
        return bookName;
    }

    public author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "Название книги: " + getBookName() + " Автор книги: " + getAuthor().getFirstname() + " " + getAuthor().getLastname() + " Год выпуска: " + getYear();
    }

    //Сеттер
    public void setYear(int year) {
        this.year = year;
    }


    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        book book = (book) obj;
        return year == book.year &&
                bookName.equals(book.bookName) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), author, getYear());
    }

}
