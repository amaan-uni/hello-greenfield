package uk.ac.lancashire.co3408;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void greetsTheWorld() {
        assertEquals("Hello, World!", App.greet("World"));
    }
}
