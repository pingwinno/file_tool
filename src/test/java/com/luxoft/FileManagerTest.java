package com.luxoft;

import org.junit.jupiter.api.Test;

class FileManagerTest extends FileManager{
    //TODO: Добавить негативных кейсов и попробовать подсунуть мок File
    @Test
    void countFiles() {
        System.out.println(FileManager.countFiles("/home/shiro/"));
    }

    @Test
    void countDirectory() {
        System.out.println(FileManager.countDirs("/home/shiro/"));
    }


}