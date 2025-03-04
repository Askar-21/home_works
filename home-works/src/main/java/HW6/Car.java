package HW6;

import java.util.EnumSet;

public class Car implements Transport {
    private final String name = "Машина";
    private final EnumSet<Terrain> restrictedTerrains = EnumSet.of(Terrain.FOREST, Terrain.SWAMP);

    @Override
    public boolean canTravel(Terrain terrain) {
        return !restrictedTerrains.contains(terrain);
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (canTravel(terrain)) {
            System.out.println(name + " преодолел " + distance + " км по " + terrain);
            return true;
        } else {
            System.out.println(name + " не может передвигаться по " + terrain);
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
