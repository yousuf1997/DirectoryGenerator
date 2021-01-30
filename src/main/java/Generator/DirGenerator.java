package Generator;

import Model.BaseDir;
import Model.SubDir;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

/**
 *  This is Directory generator which generates
 *  based on the definition provided
 * @author Mohamed Abdul
 */
public class DirGenerator {

    private BaseDir baseDir;

    public DirGenerator(){

    }

    /**
     *
     * @param baseDir
     */
    public DirGenerator(BaseDir baseDir) {
        this.baseDir = baseDir;
    }

    /**
     * Read from JSON file
     * @param filePath
     */
    public void readFromJSONFile(String filePath){

        try {
            FileReader fileReader = new FileReader(filePath);
            ObjectMapper objectMapper = new ObjectMapper();
            this.baseDir = objectMapper.readValue(fileReader, BaseDir.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return baseDir
     */
    public BaseDir getBaseDir() {
        return baseDir;
    }

    /**
     *
     * @param baseDir
     */
    public void setBaseDir(BaseDir baseDir) {
        this.baseDir = baseDir;
    }

    /**
     *  This function sparks the generation of
     *  directories based on the definition provided
     *  in the baseDir
     */
    public void generateDirectories(){

        if(baseDir == null){
            System.out.println("Base directory definition is not provided.");
        } else {

            String basePath =  baseDir.getBasePath() + "\\" + baseDir.getBaseDirectoryName() + "\\";
            createDirectory(basePath);

            // create sub directories
             helperGenerator(basePath, baseDir.getSubDirs());
        }

    }

    /**
     * Helper of generating directories
     * @param basePath
     * @param subDirs
     */
    private void helperGenerator(String basePath , ArrayList<SubDir> subDirs){
            if(subDirs.size() > 0){

                subDirs.stream().forEach(subDir -> {

                    String baseDirPath = basePath + subDir.getDirectoryName() + "\\";

                    System.out.println(subDir.getDirectoryName());

                    createDirectory(baseDirPath);

                    helperGenerator(baseDirPath, subDir.getSubDirs());
                });
            }
    }

    /**
     * Helper to create single directory
     * @param basePath
     */
    private void createDirectory(String basePath){
        try {
            Path path = Paths.get(basePath);
            Files.createDirectories(path);
            System.out.println("Directory is created : " + basePath);

        } catch (IOException ne){
                System.out.println("[Failed to create] Parent path does not exists or file is already present.");
        }

    }
}
