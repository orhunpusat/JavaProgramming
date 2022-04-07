package day31_Constructors;

public class House {

    public String name;
    public int floor;
    public int room;
    public int saloon;
    public int bedroom;
    public int bathroom;
    public double price;

    public House(String name, int floor, int room, int saloon, int bedroom, int bathroom, double price) {
        this.name = name;
        this.floor = floor;
        this.room = room;
        this.saloon = saloon;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.price = price;
    }

    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", room=" + room +
                ", saloon=" + saloon +
                ", bedroom=" + bedroom +
                ", bathroom=" + bathroom +
                ", price=$" + price +
                '}';
    }
}

