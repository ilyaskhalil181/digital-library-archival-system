package digitallibrary;

import java.io.Serializable;

// Abstract parent class
public abstract class MediaItem implements Serializable {

    // serialVersionUID for version compatibility
    private static final long serialVersionUID = 1L;

    protected String title;
    protected String author;

    // transient field (will not be serialized)
    transient String lastAccessedTime;

    // Constructor
    public MediaItem(String title, String author, String lastAccessedTime) {
        this.title = title;
        this.author = author;
        this.lastAccessedTime = lastAccessedTime;
    }

    // Abstract method
    public abstract void showMetadata();
}