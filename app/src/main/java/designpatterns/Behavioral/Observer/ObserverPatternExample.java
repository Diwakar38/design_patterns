package designpatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(float temp);
}
interface Subject {
    // Add observer
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

// Weather station concrete object of Subject
class WeatherStation implements Subject {
    private float temp;
    private List<Observer> observerList;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void setTemp(float temp){
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(temp); // Runtime polymorphism
        }
    }
}

// Concrete implementation of observer

class PhoneObserver implements Observer {
    float temp;

    @Override
    public void update(float temp) {
        this.temp = temp;
        System.out.println("Phone detected temperature change to " + temp);
    }
}

class DisplayObserver implements Observer {
    float temp;

    @Override
    public void update(float temp) {
        this.temp = temp;
        System.out.println("Display detected temperature change to " + temp);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {

        // Creating weatherstations
        WeatherStation weatherStation = new WeatherStation();

        // Creating observers
        PhoneObserver phoneObserver = new PhoneObserver();
        DisplayObserver displayObserver = new DisplayObserver();

        // Adding observers to weatherstations
        weatherStation.attach(phoneObserver);
        weatherStation.attach(displayObserver);

        // Changing temprature
        weatherStation.setTemp(40.05F);
        weatherStation.setTemp(56.00F);

        // Detach
        weatherStation.detach(phoneObserver);
        weatherStation.setTemp(26.00F);

    }
}
