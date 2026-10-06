import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void readData(){

    }

    public static void main(String[] args) {

        DataAsParagraphs p = new DataAsParagraphs("data/GettysburgAddress.txt");
        p.convertParagraphIntoArrayListOfStrings();
        p.printParagraph();

    }
}