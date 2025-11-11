package TUGASPEMROCLI;

import java.util.ArrayList;
import java.util.List;

public class Process {
    public enum MenuState {
        MAIN,
        CHARACTER,
        WEAPON,
        GACHA
    }

    private MenuState currentState = MenuState.MAIN;

    private final Gacha gacha;
    private final List<Character> characterInventory = new ArrayList<>();
    private final List<Weapon> weaponInventory = new ArrayList<>();

    public Process(Gacha gacha) {
        this.gacha = gacha;
    }

    public MenuState getCurrentState() {
        return currentState;
    }

    public void handleMenuSelection(int choice) {
        switch (currentState) {

            case MAIN -> {
                switch (choice) {
                case 1 -> currentState = MenuState.CHARACTER;
                case 2 -> currentState = MenuState.WEAPON;
                case 3 -> currentState = MenuState.GACHA;
                case 99 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            };
            }

            case CHARACTER, WEAPON, GACHA -> {
                if (choice == 99) {
                    currentState = MenuState.MAIN;
                } else {
                    handleGacha(choice);
                }
            }
        }
    }

    private void handleGacha(int choice) {
        switch (currentState) {
            case GACHA -> {
                switch (choice) {
                    case 1 -> System.out.println("\nAvailable banners:\n1. Standard\n2. Limited\n3. Weapon");

                    case 2 -> {
                        GUI.printSpinMenu();
                        int spin = GUI.getInput();
                        GUI.printBannerMenu();
                        int bannerChoice = GUI.getInput();
                        if (spin == 1) {
                            Character result = gachaOnePull(bannerChoice);
                            GUI.printPulledCharacter(result);
                        } else {
                            List<Character> results = gachaTenPull(bannerChoice);
                            GUI.printPulledTenCharacters(results);
                        }
                    }
                    case 3 -> System.out.println("\nDrop rates:\n5★ = 1%\n4★ = 10%\n3★ = 89%");
                }
            }
        }
    }

    public Character gachaOnePull(int bannerChoice) {
        Character result = gacha.roll(bannerChoice);

        if (bannerChoice == 3) {
            weaponInventory.add(result.getWeapon());
            return result;
        }

        characterInventory.add(result);
        weaponInventory.add(result.getWeapon());
        return result;
    }

    public List<Character> gachaTenPull(int bannerChoice) {
        List<Character> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Character result = gacha.roll(bannerChoice);

            if (bannerChoice == 3) {
                weaponInventory.add(result.getWeapon());
            } else {
                characterInventory.add(result);
                weaponInventory.add(result.getWeapon());
            }

            results.add(result);
        }

        return results;
    }

    public List<Character> getCharacterInventory() {
        return characterInventory;
    }

    public List<Weapon> getWeaponInventory() {
        return weaponInventory;
    }
}