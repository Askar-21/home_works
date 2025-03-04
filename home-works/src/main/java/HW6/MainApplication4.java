package HW6;

public class MainApplication4 {
    public static void main(String[] args) {
        Human human = new Human("Асқар");
        Transport car = new Car();
        Transport horse = new Horse();
        Transport bike = new Bicycle();
        Transport atv = new ATV();

        human.takeTransport(atv);
        human.move(10, Terrain.PLAIN);
        human.move(3, Terrain.FOREST);
        human.leaveTransport();
        human.takeTransport(bike  );
        human.move(4, Terrain.RAVINE);
    }
}
