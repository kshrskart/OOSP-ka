// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder()
                .setTitle("Капитанская дочка")
                .setAuthor("А.С.Пушкин")
                .setGenre("Историческая проза")
                .setPageCount(320)
                .build();
        System.out.println("Название:" + book.getTitle());
        System.out.println("Автор:" + book.getAuthor());
        System.out.println("Жанр:" + book.getGenre());
        System.out.println("Количество страниц:" + book.getPageCount());
    }
}