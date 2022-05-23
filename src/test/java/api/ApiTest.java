package api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiTest {

    private final Api underTest = new Api();

    @Test
    void testApi(){
        String expected = "Some text.";
        String actual = underTest.getText();

        assertEquals(expected, actual);
    }
}