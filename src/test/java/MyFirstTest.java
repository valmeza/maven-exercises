import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void nameTest() {
        String name = "Codeup";

        assertEquals("Codeup", name);
        assertNotEquals("codeup", name);
    }

    @Test
    public void arraysTest() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
        assertNotSame(moreLanguages, languages);
    }

    @Test
    public void arrayEqualTest() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
        assertArrayEquals(otherNumbers, numbers);
    }

    @Test
    public void conditionalsTest() {
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language, language.contains("H"));
        assertFalse(language, language.contains("J"));
    }
}
