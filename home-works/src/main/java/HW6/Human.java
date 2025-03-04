package HW6;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void takeTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " сел на " + transport.getName());
    }

    public void leaveTransport() {
        if (currentTransport != null) {
            System.out.println(name + " слез с " + currentTransport.getName());
            currentTransport = null;
        }
    }

    public boolean move(int distance, Terrain terrain) {
        if (currentTransport != null) {
            return currentTransport.move(distance, terrain);
        } else {
            System.out.println(name + " идет пешком " + distance + " км по " + terrain);
            return true;
        }
    }
}
