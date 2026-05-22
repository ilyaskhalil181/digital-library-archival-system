package digitallibrary;

// ResearchPaper class
public class ResearchPaper extends MediaItem {

    private static final long serialVersionUID = 1L;

    private String doi;

    // Constructor
    public ResearchPaper(String title, String author,
                         String lastAccessedTime, String doi) {

        super(title, author, lastAccessedTime);

        this.doi = doi;
    }

    // Overridden method
    @Override
    public void showMetadata() {

        System.out.println("===== Research Paper =====");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("DOI: " + doi);

        // transient field
        System.out.println("Last Accessed Time: " + lastAccessedTime);

        System.out.println();
    }
}