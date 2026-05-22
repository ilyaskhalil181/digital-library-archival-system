package digitallibrary;

// Book class
public class Book extends MediaItem {

    private static final long serialVersionUID = 1L;

    private String isbn;

    // Constructor
    public Book(String title, String author,
                String lastAccessedTime, String isbn) {

        super(title, author, lastAccessedTime);

        this.isbn = isbn;
    }

    // Overridden method
    @Override
    public void showMetadata() {

        System.out.println("===== Book =====");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);

        // transient field
        System.out.println("Last Accessed Time: " + lastAccessedTime);

        System.out.println();
    }
}