import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class ReadData {
    private ArrayList<String> paragraph;
    private HashMap<Integer, ArrayList<String>> paragraphs;
    private String dataToRead;

    public ReadData(String dataToRead) {
        this.paragraph = new ArrayList<>();
        this.paragraphs = new HashMap<>();
        this.dataToRead = dataToRead;
    }

    public ArrayList<String> getParagraph() {
        return paragraph;
    }

    public void setParagraph(ArrayList<String> paragraph) {
        this.paragraph = paragraph;
    }

    public String getDataToRead() {
        return dataToRead;
    }

    public void setDataToRead(String dataToRead) {
        this.dataToRead = dataToRead;
    }

    public HashMap<Integer, ArrayList<String>> convertParagraphIntoArrayListOfStrings() {
        try {
            ReadFile fileRes = new ReadFile(dataToRead);
            ArrayList<String> lines = fileRes.getLines();
            int paragraphNumber = 1;
            for (String line: lines) {
                if (!Objects.equals(line, "")) {
                    paragraph.addAll(Arrays.asList(line.split(" ")));
                    paragraphs.put(paragraphNumber, paragraph);
                    paragraph.clear();
                } else {
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return paragraphs;
    }

    public String printParagraph(){

    }
}
