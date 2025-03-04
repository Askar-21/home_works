package HW6;

import java.util.EnumSet;

public class Horse implements Transport {
    private final String name = "Лошадь";
    private final EnumSet<Terrain> restrictedTerrains = EnumSet.of(Terrain.RAVINE);

    @Override
    public boolean canTravel(Terrain terrain) {
        return !restrictedTerrains.contains(terrain);
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (canTravel(terrain)) {
            System.out.println(name + " преодолела " + distance + " км по " + terrain);
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
