package HW6;

import java.util.EnumSet;

public class Horse implements Transport {
    private final String name = "Лошадь";
    private final EnumSet<Terrain> restrictedTerrains = EnumSet.of(Terrain.RAVINE);
    private int stamina = 100; // Уровень энергии лошади

    @Override
    public boolean canTravel(Terrain terrain) {
        return !restrictedTerrains.contains(terrain) && stamina > 0;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (!canTravel(terrain)) {
            System.out.println(name + " слишком устала или не может передвигаться по " + terrain);
            return false;
        }

        int staminaLoss = distance * 5; // 5% усталости на 1 км
        if (stamina >= staminaLoss) {
            stamina -= staminaLoss;
            System.out.println(name + " преодолела " + distance + " км по " + terrain + ". Осталось сил: " + stamina + "%");
            return true;
        } else {
            System.out.println(name + " слишком устала, ей нужно отдохнуть!");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
