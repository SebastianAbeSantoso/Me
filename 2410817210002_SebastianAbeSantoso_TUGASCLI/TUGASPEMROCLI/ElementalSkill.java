package TUGASPEMROCLI;

public class ElementalSkill {
    private String name;
    private int damage;

    public ElementalSkill(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String activate() {
        return " used Elemental Skill " + name + " and dealt " + damage + " damage!";
    }
}