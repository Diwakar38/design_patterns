package designpatterns.Behavioral.Mediator.Problem;

class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void sendMessage(String msg, User recipient) {
        System.out.println(this.name + " is sending " + msg + " to " + recipient.getName());
    }
   public void recieveMessage(String msg, User sender) {
        System.out.println(sender.getName() + " had sent " + msg + " to " + this.name);
    }
}
public class Chat {
    public static void main(String[] args) {
        User diwakar = new User("diwakar");
        User sahith = new User("sahith");
        User neha = new User("neha");

        diwakar.sendMessage("Hey", sahith);
        diwakar.sendMessage("Hello", neha);
    }
}
