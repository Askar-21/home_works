package HW5;

public class cat extends Animal {
    public cat(String name, double runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " не умеет плавать!");
        return -1;
    }
}