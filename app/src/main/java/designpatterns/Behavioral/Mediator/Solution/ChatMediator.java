package designpatterns.Behavioral.Mediator.Solution;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
