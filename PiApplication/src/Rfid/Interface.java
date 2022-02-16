package Rfid;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class provides the mapping between the python files.
 *
 * @author Sacredgamer
 */
public class Interface {

    private static final byte READ = 0;
    private static final byte PLAY = 1;
    private static final byte WRITE = 2;
    private static String[] procPaths;

    /**
     * Initialize Interface
     *
     * @param readPath path of the python read file
     * @param playPath
     */
    public static void init(String readPath, String playPath) {
        procPaths = new String[]{readPath, playPath};
    }
     //   public static void init(String readPath) {
     //   procPaths = new String[]{readPath};
    //}

    /**
     * Kills all runnig read and write processes.
     *
     * @throws IOException If the Interface read file was not found or is not
     * python.
     */
    public static void clear() throws IOException {
        for (String path : procPaths) {
            ProcessBuilder builder = new ProcessBuilder("bash", "-c", "pkill -f " + path + "\n");
            builder.directory(new File(path.substring(0, path.lastIndexOf("/"))));
            Process p = builder.start();

            try {
                p.waitFor();
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static String getReadPath() {
        return procPaths[READ];
    }

    public static String getPlayPath() {
        return procPaths[PLAY];
    }
}
