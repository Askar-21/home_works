package HW5;

public class Animal {
        protected String name;
        protected double runSpeed;
        protected double swimSpeed;
        protected int stamina;

        public Animal(String name, double runSpeed, double swimSpeed, int stamina) {
            this.name = name;
            this.runSpeed = runSpeed;
            this.swimSpeed = swimSpeed;
            this.stamina = stamina;
        }

        public double run(int distance) {
            int energyCost = distance;
            if (stamina < energyCost) {
                System.out.println(name + " устал и не может бежать!");
                return -1;
            }
            stamina -= energyCost;
            return distance / runSpeed;
        }

        public double swim(int distance) {
            System.out.println(name + " не умеет плавать!");
            return -1;
        }

        public void info() {
            System.out.println(name + " | Выносливость: " + stamina);
        }
    }


