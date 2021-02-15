package tests.working_with_files;

import com.codeborne.xlstest.XLS;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.FileUtils.readXlsFromFile;
import static utils.FileUtils.readXlsxFromFile;

public class XlsTests {
    @Test
    void checkXlsTest() {
        // test data
        String dataPath = "./src/test/resources/data/1.xls";
        String expectedData = "hello qa.guru";

        //read text
        XLS actualXls = readXlsFromFile(dataPath); //считываем файл

        // assert data
        //assertTrue(actualData.contains(expectedData)); assertTrue = зависимость, встроенная в JUnit: import static org.junit.jupiter.api.Assertions.assertTrue;
        assertThat(actualXls, XLS.containsText(expectedData)); //проверяет наличие заданного текста в файле .pdf
    }

    @Test
    void checkXlsxTest() {
        // test data
        String dataPath = "./src/test/resources/data/1.xlsx";
        String expectedData = "hello qa.guru";

        // read text
        String actualXls = readXlsxFromFile(dataPath);

        // assert data
        assertThat(actualXls, containsString(expectedData));
    }

    @Test
    void negativeCheckXlsTest() { //негативный тест к checkXlsTest
        // test data
        String dataPath = "./src/test/resources/data/1.xls";
        String expectedData = "no hello qa.guru";

        // read xls
        XLS actualXls = readXlsFromFile(dataPath); //считываем файл

        // assert data
        assertThat(actualXls, XLS.containsText(expectedData)); //проверяет наличие заданного текста в файле .xls
    }

    /*Expected: a XLS containing text "no hello qa.guru"
     but: was "I:\Programming\QA_guru\Projects\qa_guru_4_4_do_more_deeper\.\src\test\resources\data\1.xls"
    hello qa.guru students	*/
}