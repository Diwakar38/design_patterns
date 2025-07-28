package designpatterns.Behavioral.Command;

class TextEditor1{
    public void boldText() {
        System.out.println("Text has been bolded");
    }
    public void italicsText() {
        System.out.println("Text has been italicized");
    }
    public void underlineText() {
        System.out.println("Text has been underlined");
    }
}

// UI classes

class BoldButton {
    private TextEditor1 editor;
    public BoldButton(TextEditor1 editor) {
        this.editor = editor;
    }
    public void click(){
        editor.boldText();
    }
}


class ItalicButton {
    private TextEditor1 editor;
    public ItalicButton(TextEditor1 editor) {
        this.editor = editor;
    }
    public void click(){
        editor.italicsText();
    }
}
class UnderlineButton {
    private TextEditor1 editor;
    public UnderlineButton(TextEditor1 editor) {
        this.editor = editor;
    }
    public void click(){
        editor.underlineText();
    }
}
public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor1 editor = new TextEditor1();
        BoldButton boldButton = new BoldButton(editor);
        boldButton.click(); // tightly coupled
    }
}
