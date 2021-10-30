package com.luxoft;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StreamParser {
    public static String parseFile(InputStream inputStream) throws IOException {
        int buffer;
        StringBuilder result = new StringBuilder();
        try (Reader reader = new InputStreamReader(inputStream)) {
            while ((buffer = reader.read()) != -1) {
                result.append((char) buffer);
            }
        }
        return result.toString();
    }
}
