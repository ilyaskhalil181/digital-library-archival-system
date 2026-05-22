package digitallibrary;

// AudioLecture class
public class AudioLecture extends MediaItem {

    private static final long serialVersionUID = 1L;

    private int duration;

    // Constructor
    public AudioLecture(String title, String author,
                        String lastAccessedTime, int duration) {

        super(title, author, lastAccessedTime);

        this.duration = duration;
    }

    // Overridden method
    @Override
    public void showMetadata() {

        System.out.println("===== Audio Lecture =====");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Duration: " + duration + " minutes");

        // transient field
        System.out.println("Last Accessed Time: " + lastAccessedTime);

        System.out.println();
    }
}