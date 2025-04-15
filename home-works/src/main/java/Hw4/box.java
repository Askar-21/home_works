package Hw4;

public class box {
    private final double width;
    private final double height;
    private final double depth;
    private final String color;
    private boolean isOpen;
    private String item;

    public box(double width, double height, double depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        isOpen = true;
        System.out.println("Коробка открыта.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Коробка закрыта.");
    }

    public void putItem(String item) {
        if (isOpen) {
            if (this.item == null) {
                this.item = item;
                System.out.println("В коробку помещен предмет: " + item);
            } else {
                System.out.println("Коробка уже содержит предмет: " + this.item);
            }
        } else {
            System.out.println("Коробка закрыта. Откройте ее перед добавлением предмета.");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (this.item != null) {
                System.out.println("Предмет " + this.item + " вынут из коробки.");
                this.item = null;
            } else {
                System.out.println("Коробка уже пустая.");
            }
        } else {
            System.out.println("Коробка закрыта. Откройте ее перед извлечением предмета.");
        }
    }
}
