package designPatterns.builder;

public class Client {

    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder.setSqm(25).setRooms(2).setCity("London").setArea("Camden").setKitchen(true).build();

        Apartment ap2 = builder.setCity("paris").setRooms(2).build();

        ap1.display();
        ap2.display();
    }
}
