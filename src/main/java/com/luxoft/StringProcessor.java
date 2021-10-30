package com.luxoft;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringProcessor {
    public static int countWords(String content, String word) {
        var pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher(content);
        var counter = 0;

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
/*
    public static List<String> findSentences(String content, String word) {
        var pattern = Pattern.compile("^|[.?!]\\s(\\p{Upper}.[^.?!]*" + word + ".[^.?!]*[.?!])", Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher(content);
        var sentences = new ArrayList<String>();

        while (matcher.find()) {
            var sentence = matcher.group(1);
            if (sentence != null) {
                sentences.add(sentence);
            }

        }
        return sentences;
    }
 */

    public static List<String> findSentences(String content, String word) {
        return Arrays.stream(content.split("[.?!]"))
                .filter(sentence -> sentence.contains(word))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
