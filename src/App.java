public class App {
    public static void main(String[] args) {

        System.out.println("HW12");

        author author = new author("Джоан", "Роулинг");
        author author1 = new author("Фёдор", "Достоевский");

        book book = new book("Гарри Поттер и Принц-полукровка", author, 2005);
        book book11 = new book("Идиот", author1, 1868);

        System.out.println("Название книги: " + book.getBookName() + " Автор книги: " + book.getAuthor().getFirstname() + " " + book.getAuthor().getLastname() + " Год выпуска: " + book.getYear());
        System.out.println("Название книги: " + book11.getBookName() + " Автор книги: " + book11.getAuthor().getFirstname() + " " + book11.getAuthor().getLastname() + " Год выпуска: " + book11.getYear());

        book.setYear(2006);
        System.out.println("Название книги: " + book.getBookName() + " Автор книги: " + book.getAuthor().getFirstname() + " " + book.getAuthor().getLastname() + " Измененный год: " + book.getYear());

        System.out.println(" ");

        System.out.println("HW13");

        book book1 = new book("Гарри Поттер и Принц-полукровка", author, 2005);
        book book2 = new book("Идиот", author1, 1868);
        book book3 = new book("1984", new author("Джордж", "Оруэлл"), 1948);
        book book4 = new book("iКона. Стив Джобс", new author("Джеффри С.", "Янга"), 2005);


        System.out.println("Книга 1: " + book1);
        System.out.println("Книга 2: " + book2);
        System.out.println("Книга 3: " + book4);

        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));
        System.out.println("book1.equals(book4): " + book1.equals(book4));


        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
        System.out.println("book4.hashCode(): " + book4.hashCode());

        //Дополнительная проверка (Правельнось работы кода)
        System.out.println(" ");
        book book5 = new book("Гарри Поттер и Принц-полукровка", author, 2005);
        System.out.println("book1.equals(book5): " + book1.equals(book5));
    }
}
