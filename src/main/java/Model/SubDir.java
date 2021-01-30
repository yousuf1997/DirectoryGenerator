package Model;

import java.util.ArrayList;

/**
 * This class represents a sub directories
 */
public class SubDir {

    private String directoryName;
    private ArrayList<SubDir> subDirs;

    public SubDir() {
    }

    public SubDir(String directoryName, ArrayList<SubDir> subDirs) {
        this.directoryName = directoryName;
        this.subDirs = subDirs;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public ArrayList<SubDir> getSubDirs() {
        return subDirs;
    }

    public void setSubDirs(ArrayList<SubDir> subDirs) {
        this.subDirs = subDirs;
    }
}
