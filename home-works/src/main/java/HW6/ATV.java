package HW6;

public class ATV implements Transport {
    private final String name = "Вездеход";

    @Override
    public boolean canTravel(Terrain terrain) {
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        System.out.println(name + " преодолел " + distance + " км по " + terrain);
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
