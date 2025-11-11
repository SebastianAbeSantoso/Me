package TUGASPEMROCLI;

public abstract class Character implements Damageable {
    private String name;
    private int hp;
    private int atk;
    private Weapon weapon;
    private ElementalSkill skill;
    private ElementalBurst burst;

    public Character(String name, int hp, int atk, Weapon weapon, ElementalSkill elementalSkill, ElementalBurst elementalBurst) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.weapon = weapon;
        this.skill = elementalSkill;
        this.burst = elementalBurst;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public ElementalSkill getSkill() {
        return skill;
    }

    public ElementalBurst getBurst() {
        return burst;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
    }

    public String attack() {
        return name + " attacks and deals " + atk + " damage";
    }

    public abstract String useSkill();
    public abstract String useBurst();
}