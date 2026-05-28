package designPatterns.builder;

public class ApartmentBuilder {
    private int sqm =-1;
    private int rooms=-1;
    private String city="";
    private String area="";
    private boolean kitchen=false;

    public ApartmentBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public ApartmentBuilder setSqm(int sqm) {
        this.sqm = sqm;
        return this;
    }

    public ApartmentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ApartmentBuilder setArea(String area) {
        this.area = area;
        return this;
    }

    public ApartmentBuilder setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
        return this;
    }

    public Apartment build(){
        Apartment ap = new Apartment(sqm, rooms, area, city, kitchen);
        sqm =-1;
        rooms=-1;
        city="";
        area="";
        kitchen=false;
        return ap;

    }
}
