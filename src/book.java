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

    //Сеттер
    public void setYear(int year) {
        this.year = year;
    }
}
