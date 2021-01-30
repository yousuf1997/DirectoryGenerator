package Test;

import Generator.DirGenerator;
public class DirGeneratorTest {

    public static void main(String[] args) {

        DirGenerator dirGenerator = new DirGenerator();
        dirGenerator.readFromJSONFile("C:\\Users\\moham\\Downloads\\testFile.json");
        dirGenerator.generateDirectories();
    }
}
