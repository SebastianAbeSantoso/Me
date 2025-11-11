package TUGASPEMROCLI;

public class GenericCharacter extends Character {
    public GenericCharacter(String name, int hp, int atk, Weapon weapon,
                            ElementalSkill elementalSkill, ElementalBurst elementalBurst) {
        super(name, hp, atk, weapon, elementalSkill, elementalBurst);
    }

    @Override
    public String useSkill() {
        return getSkill().activate();
    }

    @Override
    public String useBurst() {
        return getBurst().activate();
    }
}