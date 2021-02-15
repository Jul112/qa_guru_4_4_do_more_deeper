package tests.working_with_files;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readStringFromFile;

public class TextTests {
    @Test
    void checkTxtTests() {
        // test data
        String dataPath = "./src/test/resources/data/1.txt";
        String expectedData = "hello qa.guru";

        // read text
        String actualData = readStringFromFile(dataPath); //считываем файл

        // assert data
        //assertTrue(actualData.contains(expectedData)); assertTrue = зависимость, встроенная в JUnit: import static org.junit.jupiter.api.Assertions.assertTrue;
        assertTrue(actualData.contains(expectedData));
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void negativeCheckTxtTests() {
        // test data
        String dataPath = "./src/test/resources/data/1.txt";
        String expectedData = "no hello qa.guru";

        // read text
        String actualData = readStringFromFile(dataPath); //считываем файл

        // assert data
        //assertTrue(actualData.contains(expectedData)); assertTrue = зависимость, встроенная в JUnit: import static org.junit.jupiter.api.Assertions.assertTrue;
        assertTrue(actualData.contains(expectedData));
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void negativeCheckTxtWithHamcrestTests() {
        // test data
        String dataPath = "./src/test/resources/data/1.txt";
        String expectedData = "no hello qa.guru";

        // read text
        String actualData = readStringFromFile(dataPath); //считываем файл

        // assert data
        //assertTrue(actualData.contains(expectedData)); assertTrue = зависимость, встроенная в JUnit: import static org.junit.jupiter.api.Assertions.assertTrue;
        assertTrue(actualData.contains(expectedData));
        assertThat(actualData, containsString(expectedData));
    }
}
