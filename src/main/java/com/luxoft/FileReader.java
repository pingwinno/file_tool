package com.luxoft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileReader {

    public static InputStream getStream(String path) {
        try {
            return new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new com.luxoft.FileNotFoundException("File with path: " + path + " not found.", e);
        }
    }

}
