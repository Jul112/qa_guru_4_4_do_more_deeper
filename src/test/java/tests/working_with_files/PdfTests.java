package tests.working_with_files;

import org.junit.jupiter.api.Test;
import com.codeborne.pdftest.PDF;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readPdfFromFile;
import static utils.FileUtils.readStringFromFile;

public class PdfTests {
    @Test
    void checkPdfTests() {
        // test data
        String dataPath = "./src/test/resources/data/Google.pdf";
        String expectedData = "Сервисы Google доступны на разных языках";

        // read pdf
        PDF actualPdf = readPdfFromFile(dataPath); //считываем файл

        // assert data
        //assertTrue(actualData.contains(expectedData)); assertTrue = зависимость, встроенная в JUnit: import static org.junit.jupiter.api.Assertions.assertTrue;
        assertThat(actualPdf, PDF.containsText(expectedData)); //проверяет наличие заданного текста в файле .pdf
    }

    @Test
    void negativeCheckPdfWithHamcrestTests() { //негативный тест
        // test data
        String dataPath = "./src/test/resources/data/Google.pdf";
        String expectedData = "Сервисы Google не доступны на разных языках";

        // read pdf
        PDF actualPdf = readPdfFromFile(dataPath); //считываем файл

        // assert data
        //assertTrue(actualData.contains(expectedData)); assertTrue = зависимость, встроенная в JUnit: import static org.junit.jupiter.api.Assertions.assertTrue;
        assertThat(actualPdf, PDF.containsText(expectedData)); //проверяет наличие заданного текста в файле .pdf

        /*Expected :a PDF containing "Сервисы Google не доступны на разных языках"
          Actual   :"2/15/2021 Google https://www.google.com 1/1 Сервисы Google доступны на разных языках*/
    }
}