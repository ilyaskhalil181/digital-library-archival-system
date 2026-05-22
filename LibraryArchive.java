package digitallibrary;

import java.io.*;
import java.util.ArrayList;

// LibraryArchive class
public class LibraryArchive implements Serializable {

    private static final long serialVersionUID = 1L;

    // Collection of media items
    private ArrayList<MediaItem> items;

    // Constructor
    public LibraryArchive() {
        items = new ArrayList<>();
    }

    // Add item
    public void addItem(MediaItem item) {
        items.add(item);
    }

    // Getter
    public ArrayList<MediaItem> getItems() {
        return items;
    }

    // Serialize object
    public void saveArchive(String fileName) {

        try {

            FileOutputStream fos = new FileOutputStream(fileName);

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(this);

            oos.close();
            fos.close();

            System.out.println("Archive saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving archive:");
            System.out.println(e.getMessage());
        }
    }

    // Deserialize object
    public static LibraryArchive loadArchive(String fileName) {

        try {

            FileInputStream fis =
                    new FileInputStream(fileName);

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            LibraryArchive archive =
                    (LibraryArchive) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Archive loaded successfully.");

            return archive;

        } catch (InvalidClassException e) {

            System.out.println("Version mismatch error:");
            System.out.println(e.getMessage());

        } catch (StreamCorruptedException e) {

            System.out.println("Corrupted file error:");
            System.out.println(e.getMessage());

        } catch (IOException e) {

            System.out.println("File loading error:");
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.println("Class not found error:");
            System.out.println(e.getMessage());
        }

        return null;
    }
}