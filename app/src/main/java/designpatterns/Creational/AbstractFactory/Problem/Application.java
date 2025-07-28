package designpatterns.Creational.AbstractFactory.Problem;

// Windows UI components
class WindowsButton{
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsScrollbar{
    public void scroll() {
        System.out.println("Rendering Windows Scrollbar");
    }
}
// Mac UI components

class MacButton{
    public void scroll() {
        System.out.println("Scrolling Mac Button");
    }
}

class MacScrollbar{
    public void render() {
        System.out.println("Rendering Mac Scrollbar");
    }
}
public class Application {
    public static void main(String[] args) {
        // Windows UI
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollbar windowsScrollbar = new WindowsScrollbar();

        windowsButton.render();
        windowsScrollbar.scroll();
        // Problem 1: If the client code is running on Mac, then there is no need it to be
        // creating Windows button and scrollbar
        // Problem 2: Application is now tightly coupled with WindowsButton, MacButton etc...
    }
}
