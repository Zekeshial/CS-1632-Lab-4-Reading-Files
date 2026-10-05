import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataAsParagraphsTest {

    @org.junit.jupiter.api.Test
    void convertParagraphIntoArrayListOfStrings() {
        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddress.txt");
        p.convertParagraphIntoArrayListOfStrings();
        assertTrue(p.convertParagraphIntoArrayListOfStrings());
    }



    @org.junit.jupiter.api.Test
    void convertParagraphIntoArrayListOfStrings2() {

        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddress.txt");
        p.convertParagraphIntoArrayListOfStrings();
        Integer actual = p.getParagraphs().size();
        Integer expected = 5;
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void convertParagraphIntoArrayListOfStrings3() {

        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddress.txt");
        p.convertParagraphIntoArrayListOfStrings();
        ArrayList<String> actual = p.getParagraphs().get(2);
        ArrayList<String> expected = new ArrayList<>(List.of("It", "is", "altogether", "fitting", "and", "proper", "that", "we", "should", "do", "this."));

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void convertParagraphIntoArrayListOfStrings4() {
        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddres3s.txt");
        p.convertParagraphIntoArrayListOfStrings();
        assertFalse(p.convertParagraphIntoArrayListOfStrings());
    }

    @org.junit.jupiter.api.Test
    void printParagraph() {
        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddress.txt");
        boolean actual = p.printParagraph();
        assertFalse(actual);
    }

    @org.junit.jupiter.api.Test
    void printParagraph2() {
        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddress.txt");
        p.convertParagraphIntoArrayListOfStrings();
        boolean actual = p.printParagraph();
        assertTrue(actual);
    }
}