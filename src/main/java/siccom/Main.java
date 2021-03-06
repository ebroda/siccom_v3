package siccom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Main Class creates the Welcome frame to start the simulation with the GUI
 *
 * @author kubicek
 * @version 1.0
 */
public class Main                                //implements ActionListener
{
    static Welcome welcome;

    /**
     * Looks for parameter files in the inf-folder
     *
     * @param filename the file name
     */
    public static File getLocalFile(String filename) {
        return new File("species/" + filename);
    }

    /**
     * Sets up the reading tool for the chosen file
     *
     * @param fileName the name of the file that is read
     * @return in the input reader
     */
    public static InputStreamReader getArchiveFile(String fileName) throws FileNotFoundException {
        InputStreamReader in = new InputStreamReader(new FileInputStream(fileName));
        return in;
    }

    /**
     * The main Method
     * Instantiates the Welcome frame --> starts the GUI
     *
     * @param args not used
     */
    public static void main(String[] args) {
        welcome = new Welcome();
    }
}
