import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class DataAsParagraphs {
    private ArrayList<String> paragraph;
    private HashMap<Integer, ArrayList<String>> paragraphs;
    private String dataToRead;

    public DataAsParagraphs(String dataToRead) {
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

    public HashMap<Integer, ArrayList<String>> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(HashMap<Integer, ArrayList<String>> paragraphs) {
        this.paragraphs = paragraphs;
    }

    /**
     * This method takes the data from a csv file and converts each paragraph into a arraylist of strings and adds it to a hashmap of key integer, value, paragraph.
     * @return true if it found the file and was successful, false if it didn't find the file
     */
    public boolean convertParagraphIntoArrayListOfStrings() {
        try {
            ReadFile fileRes = new ReadFile(dataToRead);
            ArrayList<String> lines = fileRes.getLines();
            int paragraphNumber = 1;
            for (String line: lines) {
                if (!Objects.equals(line, "")) {
                    paragraph.addAll(Arrays.asList(line.split(" ")));
                } else {
                    paragraphs.put(paragraphNumber, paragraph);
                    paragraphNumber++;
                    paragraph = new ArrayList<>();
                }
            }
            paragraphs.put(paragraphNumber, paragraph);
            paragraph = new ArrayList<>();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
        return true;
    }

    /**
     * prints out the list of Paragraphs in order they appear in the csv file
     * @return false if the hashmap is empty, true if it had values to print out.
     */
    public boolean printParagraph(){
        if (paragraphs.isEmpty()) {
            System.out.println("You don't have anything in the list.");
            return false;
        } else {
            paragraphs.forEach((key, value) -> {
                System.out.println("Paragraph number: " + key);
                System.out.println(value + "\n");
            });
            return true;
        }
    }
}
