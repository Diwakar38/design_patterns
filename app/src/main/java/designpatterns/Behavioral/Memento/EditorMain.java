package designpatterns.Behavioral.Memento;

public class EditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        editor.write("test1");
        careTaker.saveState(editor);
        editor.write("test2");
        careTaker.saveState(editor);
        editor.write("test3");
        careTaker.saveState(editor);

        System.out.println(editor.getContent());
        careTaker.undoState(editor);
        System.out.println(editor.getContent());
        careTaker.undoState(editor);
        System.out.println(editor.getContent());
    }
}
