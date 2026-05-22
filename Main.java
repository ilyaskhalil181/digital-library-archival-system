package digitallibrary;

public class Main {

    // MAIN METHOD
    public static void main(String[] args) {

        // Create archive object
        LibraryArchive archive = new LibraryArchive();

        // Create objects
        Book b1 = new Book(
                "Java Programming",
                "James Gosling",
                "10:30 PM",
                "ISBN-12345"
        );

        ResearchPaper r1 = new ResearchPaper(
                "Artificial Intelligence",
                "Andrew Ng",
                "09:00 AM",
                "DOI-56789"
        );

        AudioLecture a1 = new AudioLecture(
                "OOP Concepts",
                "Dr. Ahmed",
                "08:45 PM",
                90
        );

        // Add items to archive
        archive.addItem(b1);
        archive.addItem(r1);
        archive.addItem(a1);

        // Save archive
        archive.saveArchive("libraryArchive.dat");

        System.out.println();

        // Load archive
        LibraryArchive loadedArchive =
                LibraryArchive.loadArchive("libraryArchive.dat");

        System.out.println();

        // Check if archive loaded successfully
        if (loadedArchive != null) {

            System.out.println("===== DESERIALIZED DATA =====");
            System.out.println();

            // Polymorphism
            for (MediaItem item : loadedArchive.getItems()) {

                item.showMetadata();
            }
        }
    }
}