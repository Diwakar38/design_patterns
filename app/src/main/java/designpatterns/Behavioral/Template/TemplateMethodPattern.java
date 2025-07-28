package designpatterns.Behavioral.Template;

abstract class ParseFile{
    public final void parse() {
        openFile();
        parseFile();
        closeFile();
    }
    protected void openFile()  {
        System.out.println("Opening file");
    }
    protected void closeFile() {
        System.out.println("Closing file");
    }

    protected abstract void parseFile();
}

class CSVParser extends ParseFile {

    @Override
    public void parseFile() {
        System.out.println("Parsing a CSVFile");
    }
}

class JSONParser extends ParseFile {

    @Override
    public void parseFile() {
        System.out.println("Parsing a JSONFile");
    }
}

public class TemplateMethodPattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
