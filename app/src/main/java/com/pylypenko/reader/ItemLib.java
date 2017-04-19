package com.pylypenko.reader;

/**
 * Created by Irina on 21.11.2016.
 */
public class ItemLib {
    String pathImg;
    String pathFile;
    String name;
    ItemLib(String img, String file, String name) {
        this.pathImg = img;
        this.pathFile = file;
        this.name = name;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
