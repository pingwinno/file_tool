package com.luxoft;

import java.io.IOException;

public class FileAnalyzer {
    public static void main(String[] args) throws IOException {
        if (args.length != 2 && !(args[0].matches("[A-Z]:.*") || args[0].matches("/.*"))) {
            System.err.println("Wrong arguments. java FileAnalyzer <PATH> <WORD>");
        }
        var word = args[1];
        try (var stream = FileReader.getStream(args[0])) {
            var content = StreamParser.parseFile(stream);
            System.out.println(StringProcessor.countWords(content, word));
            System.out.println(StringProcessor.findSentences(content, word));
        }
    }
}
