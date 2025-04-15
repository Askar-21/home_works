package HW6;

import java.util.EnumSet;

public class Car implements Transport {
    private final String name = "Машина";
    private final EnumSet<Terrain> restrictedTerrains = EnumSet.of(Terrain.FOREST, Terrain.SWAMP);
    private int fuel = 100; // Бензин в процентах

    @Override
    public boolean canTravel(Terrain terrain) {
        return !restrictedTerrains.contains(terrain) && fuel > 0;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (!canTravel(terrain)) {
            System.out.println(name + " не может передвигаться по " + terrain);
            return false;
        }

        int fuelConsumption = distance * 2; // 2% топлива на 1 км
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
