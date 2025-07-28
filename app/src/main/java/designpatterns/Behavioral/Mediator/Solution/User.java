package designpatterns.Behavioral.Mediator.Solution;

class User {
    private final String name;
    private ChatMediator chatMediator;
    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }
    public String getName() {
        return this.name;
    }
    public void sendMessage(String msg) {
        System.out.println(this.name + " is sending a msg '" + msg +"'");
        chatMediator.sendMessage(msg,this);
    }
    public void recieveMessage(String msg, User sender) {
        System.out.println(sender.getName() + " had sent '" + msg + "' to " + this.name);
    }
}
