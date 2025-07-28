package designpatterns.Behavioral.Memento;

import java.util.Stack;

// CareTaker: Manages states of the editor class or mementos
public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undoState(TextEditor editor) {
        if(!history.isEmpty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
