package designpatterns.Behavioral.Command;
// Command Interface
interface Command {
    void execute();
}
// Concrete classes for Command
class BoldCommand implements Command {
    private TextEditor editor;
    public BoldCommand(TextEditor editor) {
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.boldText();
    }
}
class ItalicsCommand implements Command {
    private TextEditor editor;
    public ItalicsCommand(TextEditor editor) {
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.italicsText();
    }
}
class UnderlineCommand implements Command {
    private TextEditor editor;
    public UnderlineCommand(TextEditor editor) {
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.underlineText();
    }
}
class TextEditor{
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

class Button {
    // This button is part of UI library.
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void click() {
        command.execute();
    }
}
public class CommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Button button = new Button();
        button.setCommand(new BoldCommand(editor));
        button.click();
        button.setCommand(new ItalicsCommand(editor));
        button.click();
        button.setCommand(new UnderlineCommand(editor));
        button.click();
    }
}
