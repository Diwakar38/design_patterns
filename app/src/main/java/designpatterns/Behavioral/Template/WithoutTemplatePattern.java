package designpatterns.Behavioral.Template;
//CSV Parser
class CSVParserW {
    public void parse() {
        openFile();
        // CSV parsing logic
        System.out.println("Parsing a CSV file");
        closeFile();
    }
    public void openFile() {
        System.out.println("Opening file");
    }
    public void closeFile() {
        System.out.println("Closing file");
    }
}

//JSON Parser
class JSONParserW {
    public void parse() {
        openFile();
        // CSV parsing logic
        System.out.println("Parsing a JSON file");
        closeFile();
    }
    public void openFile() {
        System.out.println("Opening file");
    }
    public void closeFile() {
        System.out.println("Closing file");
    }
}

public class WithoutTemplatePattern {
    public static void main(String[] args) {
        CSVParserW csvParser = new CSVParserW();
        csvParser.parse();
        JSONParserW jsonParser = new JSONParserW();
        jsonParser.parse();
    }
}
