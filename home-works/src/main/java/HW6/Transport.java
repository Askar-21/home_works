package HW6;

public interface Transport {
    boolean canTravel(Terrain terrain);
    boolean move(int distance, Terrain terrain);
    String getName();
}

