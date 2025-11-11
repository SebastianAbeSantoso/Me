package TUGASPEMROCLI;

import java.util.Random;

public class Gacha {
    private final Random random = new Random();

    private int pullsSinceLastFiveStar = 0;
    private boolean guaranteedLimitedNextTime = false;

    public Character roll(int bannerChoice) {
        return switch (bannerChoice) {
            case 1 -> rollStandardBanner();
            case 2 -> rollLimitedBanner();
            case 3 -> rollWeaponBanner();
            default -> null;
        };
    }

    private Character rollStandardBanner() {
        pullsSinceLastFiveStar++;

        if (pullsSinceLastFiveStar >= 90) {
            pullsSinceLastFiveStar = 0;
            return fiveStarStandard();
        }

        int rate = random.nextInt(1000);
        if (rate < 10) {
            pullsSinceLastFiveStar = 0;
            return fiveStarStandard();
        }
        if (rate < 100) {
            return fourStarStandard();
        }
        return threeStar();
    }

    private Character fiveStarStandard() {
        return new GenericCharacter(
                "Jean (Standard 5★)",
                900, 200,
                new Weapon("Favonius Sword", 200),
                new ElementalSkill("Gale Blade", 350),
                new ElementalBurst("Dandelion Field", 900)
        );
    }

    private Character fourStarStandard() {
        return new GenericCharacter(
                "Sucrose (Standard 4★)", 700, 150,
                new Weapon("Sacrificial Fragments", 150),
                new ElementalSkill("Astable Anemohypostasis Creation", 300),
                new ElementalBurst("Forbidden Creation", 700)
        );
    }

    private Character rollLimitedBanner() {
        pullsSinceLastFiveStar++;

        if (pullsSinceLastFiveStar >= 90) {
            pullsSinceLastFiveStar = 0;
            return fiveStarLimited();
        }

        int rate = random.nextInt(1000);
        if (rate < 10) {

            pullsSinceLastFiveStar = 0;

            if (guaranteedLimitedNextTime || random.nextBoolean()) {
                guaranteedLimitedNextTime = false;
                return fiveStarLimited();
            } else {
                guaranteedLimitedNextTime = true;
                return fiveStarStandard();
            }
        }

        if (rate < 100) {
            return fourStarStandard();
        }

        return threeStar();
    }

    private Character fiveStarLimited() {
        return new GenericCharacter("Eula", 1000, 300,
                new Weapon("Song of Broken Pines", 300),
                new ElementalSkill("Ice Tide Vortex (Boosted)", 500),
                new ElementalBurst("Glacial Illumination (Boosted)", 1500)
        );
    }

    private Character rollWeaponBanner() {
        int rate = random.nextInt(1000);

        if (rate < 10) {
            return new GenericCharacter(
                    "5★ Weapon Holder",
                    1_000, 300,
                    new Weapon("Wolf's Gravestone", 320),
                    new ElementalSkill("None", 0),
                    new ElementalBurst("None", 0)
            );
        }

        if (rate < 100) {
            return new GenericCharacter(
                    "4★ Weapon Holder",
                    800, 260,
                    new Weapon("Sacrificial Greatsword", 180),
                    new ElementalSkill("None", 0),
                    new ElementalBurst("None", 0)
            );
        }

        return threeStar();
    }

    private Character threeStar() {
        return new GenericCharacter(
                "3★ Character",
                300, 70,
                new Weapon("Rusty Sword", 20),
                new ElementalSkill("Peck", 30),
                new ElementalBurst("Weak Burst", 60)
        );
    }
}