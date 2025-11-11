package TUGASPEMROCLI;

public class ElementalBurst {
        private String name;
        private int damage;

        public ElementalBurst(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public String activate() {
            return " used Elemental Burst " + name + " and dealt " + damage + " damage!";
    }

}