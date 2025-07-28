package designpatterns.Creational.AbstractFactory.Solution;

// Abstract Product Interfaces
interface Button {
    void render();
}

interface Scrollbar {
    void scroll();
}

// Windows UI components
class WindowsButton implements Button{
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsScrollbar implements Scrollbar{
    public void scroll() {
        System.out.println("Scrolling Windows Scrollbar");
    }
}
// Mac UI components

class MacButton implements Button{
    public void render() {
        System.out.println("Scrolling Mac Button");
    }
}

class MacScrollbar implements Scrollbar{
    public void scroll() {
        System.out.println("Rendering Mac Scrollbar");
    }
}

// Abstract Factory
interface UIFactory {
    Button createButton();
    Scrollbar createScrollbar();
}

// Concrete implementation of this abstract factory
class windowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new WindowsScrollbar();
    }
}

class macosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MacScrollbar();
    }
}

public class Application {
    private Button button;
    private Scrollbar scrollbar;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.scrollbar = factory.createScrollbar();
    }

    public void renderUI() {
        button.render();
        scrollbar.scroll();
    }

    public static void main(String[] args) {
        // Making factories
        UIFactory windowsFactory = new windowsUIFactory();
        UIFactory macosFactory = new macosUIFactory();
        // Making apps
        Application windowsApp = new Application(windowsFactory);
        Application macosApp = new Application(macosFactory);

        windowsApp.renderUI();
        macosApp.renderUI();
    }
}
