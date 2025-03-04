package HW5;

public class horse extends Animal {
    public horse(String name, double runSpeed, double swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double swim(int distance) {
        int energyCost = distance * 4;
        if (stamina < energyCost) {
            System.out.println(name + " устала и не может плыть!");
            return -1;
        }
        stamina -= energyCost;
        return distance / swimSpeed;
    }
}
