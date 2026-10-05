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

        System.out.println();
        try {
            ReadFile fileRes = new ReadFile("data/GettysburgAddress.txt");
            ArrayList<String> lines = fileRes.getLines();
            int lineNum = 1;
            for (String line: lines) {
                System.out.println(lineNum + ": " + line);
                lineNum++;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}