package HW6;

public class ATV implements Transport {
    private final String name = "Вездеход";
    private int fuel = 100; // Бензин в процентах

    @Override
    public boolean canTravel(Terrain terrain) {
        return fuel > 0;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (!canTravel(terrain)) {
            System.out.println(name + " не может передвигаться, так как нет топлива!");
            return false;
        }

        int fuelConsumption = distance * 3; // 3% топлива на 1 км (вездеход жрет больше)
        if (fuel >= fuelConsumption) {
            fuel -= fuelConsumption;
            System.out.println(name + " преодолел " + distance + " км по " + terrain + ". Осталось топлива: " + fuel + "%");
            return true;
        } else {
            System.out.println(name + " не хватает топлива для поездки!");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
