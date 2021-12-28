package edu.bsuir.lw1.pathes;

public enum PathToFile {
    FILE1("c:/file1.txt"),
    FILE2("c:/file2.txt");

    private String path;

    PathToFile (String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
