package HW5;

public class dog extends Animal {
    public dog (String name, double runSpeed, double swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double swim(int distance) {
        int energyCost = distance * 2;
        if (stamina < energyCost) {
            System.out.println(name + " устал и не может плыть!");
            return -1;
        }
        stamina -= energyCost;
        return distance / swimSpeed;
    }
}