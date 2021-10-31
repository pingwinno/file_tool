package com.luxoft;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
//TODO: Добавить негативных кейсов
class StringProcessorTest {

    private static final String TEST_TEXT = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure? On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee";
    private static final String FIRST_SENTENCE = "No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful";
    private static final String SECOND_SENTENCE = "Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure";
    private static final String THIRD_SENTENCE = "To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it";
    private static final String FOURTH_SENTENCE = "But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure";
    private static final String FIFTH_SENTENCE = "On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee";

    private static final List<String> expectedSentences = List.of(FIRST_SENTENCE, SECOND_SENTENCE, THIRD_SENTENCE, FOURTH_SENTENCE, FIFTH_SENTENCE);

    @Test
    void countWords() {
        assertEquals(7, StringProcessor.countWords(TEST_TEXT, "it"));

    }

    @Test
    void findSentences() {
        var actualSentences = StringProcessor.findSentences(TEST_TEXT, "it");
        assertEquals(5, actualSentences.size());
        assertEquals(expectedSentences, actualSentences);
    }
}