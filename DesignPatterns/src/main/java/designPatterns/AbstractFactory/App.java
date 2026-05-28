package designPatterns.AbstractFactory;

public class App {

    public static void main(String[] args) {
        Client client1 = new Client(new NetworkFactory());
        client1.communication();

        Client client2 = new Client(new DatabaseFactory());
        client2.communication();
    }

}
