package Model;

import java.util.ArrayList;

/**
 *  This class represents a Base directory
 *  of the folder structure
 */
public class BaseDir {

    private String basePath;
    private String baseDirectoryName;
    private ArrayList<SubDir> subDirs;

    public BaseDir() {
    }

    public BaseDir(String basePath, String baseDirectoryName, ArrayList<SubDir> subDirs) {
        this.basePath = basePath;
        this.baseDirectoryName = baseDirectoryName;
        this.subDirs = subDirs;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getBaseDirectoryName() {
        return baseDirectoryName;
    }

    public void setBaseDirectoryName(String baseDirectoryName) {
        this.baseDirectoryName = baseDirectoryName;
    }

    public ArrayList<SubDir> getSubDirs() {
        return subDirs;
    }

    public void setSubDirs(ArrayList<SubDir> subDirs) {
        this.subDirs = subDirs;
    }
}
