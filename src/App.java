public class App {
    public static void main(String[] args) {

        author author = new author("Джоан", "Роулинг");
        author author1 = new author("Фёдор", "Достоевский");

        book book = new book("Гарри Поттер и Принц-полукровка", author, 2005);
        book book1 = new book("Идиот", author1, 1868);

        System.out.println("Название книги: " + book.getBookName() + " Автор книги: " + book.getAuthor().getFirstname() + " " + book.getAuthor().getLastname() + " Год выпуска: " + book.getYear());
        System.out.println("Название книги: " + book1.getBookName() + " Автор книги: " + book1.getAuthor().getFirstname() + " " + book1.getAuthor().getLastname() + " Год выпуска: " + book1.getYear());

        book.setYear(2006);
        System.out.println("Название книги: " + book.getBookName() + " Автор книги: " + book.getAuthor().getFirstname() + " " + book.getAuthor().getLastname() + " Измененный год: " + book.getYear());
    }
}
