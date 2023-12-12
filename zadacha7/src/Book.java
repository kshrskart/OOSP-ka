public class Book {
    private String title;
    private String author;
    private String genre;
    private int pageCount;

    public static class BookBuilder {
        private String title;
        private String author;
        private String genre;
        private int pageCount;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setPageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.pageCount = builder.pageCount;
    }

    // Getters for title, author, genre and pageCount

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }
}
