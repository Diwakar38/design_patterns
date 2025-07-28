package designpatterns.Behavioral.Mediator.Solution;

public class Chat {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User diwakar = new User("diwakar",chatRoom);
        User sahith = new User("sahith",chatRoom);
        User neha = new User("neha",chatRoom);

        chatRoom.addUser(diwakar);
        chatRoom.addUser(sahith);
        chatRoom.addUser(neha);

        diwakar.sendMessage("Hello everyone");
    }
}
