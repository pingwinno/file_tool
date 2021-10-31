package com.luxoft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileManager {
    // public static int countFiles(String path) - принимает путь к папке,
    // возвращает количество файлов в папке и всех подпапках по пути
    public static int countFiles(String path) {
        return (int) getSubFolders(new File(path), new HashSet<>()).stream().filter(File::isFile).count();
    }

    // public static int countDirs(String path) - принимает путь к папке,
    // возвращает количество папок в папке и всех подпапках по пути
    public static int countDirs(String path) {
        return (int) getSubFolders(new File(path), new HashSet<>()).stream().filter(File::isDirectory).count();
    }

    /* метод по копированию папок и файлов.
            Параметр from - путь к файлу или папке, параметр to - путь к папке куда будет производиться копирование.
    public static void move(String from, String to) - метод по перемещению папок и файлов.
            Параметр from - путь к файлу или папке, параметр to - путь к папке куда будет производиться копирование.

     */
    //TODO: добавить тесты для copy
    public static void copy(String from, String to) throws IOException {
        try (var output = new FileOutputStream(to)) {
            var inputStream = new FileInputStream(from);
            var file = inputStream.readAllBytes();
            output.write(file);
            inputStream.close();
        }
    }

    private static Set<File> getSubFolders(File file, Set<File> files) {
        var subFolders = file.listFiles();
        if (subFolders != null) {
            for (File folder : subFolders) {
                getSubFolders(folder, files);
            }
        }
        files.add(file);
        return files;
    }
}
