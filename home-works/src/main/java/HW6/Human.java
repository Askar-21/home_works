package HW6;

public class Human {
    private String name;
    private Transport currentTransport;
    private int stamina = 100; // Стамина человека

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
            return walk(distance, terrain);
        }
    }

    private boolean walk(int distance, Terrain terrain) {
        int staminaLoss = distance * 4; // 4% стамины за 1 км пешком

        if (stamina >= staminaLoss) {
            stamina -= staminaLoss;
            System.out.println(name + " идет пешком " + distance + " км по " + terrain + ". Осталось сил: " + stamina + "%");
            return true;
        } else {
            System.out.println(name + " слишком устал, чтобы идти пешком! Нужно отдохнуть.");
            return false;
        }
    }

    public void rest() {
        stamina = 100;
        System.out.println(name + " отдохнул и восстановил силы!");
    }
}
