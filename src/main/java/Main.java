import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void readData(){

    }

    public static void main(String[] args) {

        ReadData p = new ReadData("data/GettysburgAddress.txt");
        System.out.println(p.convertParagraphIntoArrayListOfStrings());

        System.out.println();
        try {
            ReadFile fileRes = new ReadFile("data/GettysburgAddress.txt");
            ArrayList<String> lines = fileRes.getLines();
            int linenum = 1;
            for (String line: lines) {
                System.out.println(linenum + ": " + line);
                linenum++;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}