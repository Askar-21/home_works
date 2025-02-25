package HW5;

public class MainApplication3 {
    public static void main(String[] args) {
        cat cat = new cat("Барсик", 5, 10);
        dog dog = new dog("Бобик", 6, 2, 20);
        horse horse = new horse("Молния", 8, 3, 30);

        cat.run(5);
        cat.swim(2);
        cat.info();

        dog.run(10);
        dog.swim(5);
        dog.info();

        horse.run(15);
        horse.swim(5);
        horse.info();
    }
}
