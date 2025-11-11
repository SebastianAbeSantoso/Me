package TUGASPEMROCLI;

import java.util.List;
import java.util.Scanner;

public class GUI {

    private static final Scanner scan = new Scanner(System.in);
    private final Process process;

    public GUI(Process process) {
        this.process = process;
    }

    public void menuHandler() {
        while (true) {
            printHeader();
            printBody();
            printFooter();

            int choice = scan.nextInt();
            process.handleMenuSelection(choice);
        }
    }

    private void printHeader() {
        System.out.println("\n\n========= HEADER =========");
        System.out.println("Welcome to Genshin Gacha Simulator");
        System.out.println("You are currently in: " + process.getCurrentState());
        System.out.println("==========================");
    }

    private void printBody() {
        switch (process.getCurrentState()) {
            case MAIN -> {
                System.out.println("\n\n========== MAIN ==========");
                System.out.println("1. Show Characters");
                System.out.println("2. Show Weapons");
                System.out.println("3. Gacha");
                System.out.println("99. Exit");
                System.out.println("==========================");
            }

            case CHARACTER -> printCharacterInventory();
            case WEAPON -> printWeaponInventory();

            case GACHA -> {
                System.out.println("\n\n========== GACHA =========");
                System.out.println("1. View Banners");
                System.out.println("2. Roll Gacha");
                System.out.println("3. Banner Details");
                System.out.println("99. Back");
                System.out.println("==========================");
            }
        }
    }

    private void printFooter() {
        System.out.println("\n\n========= FOOTER =========");
        System.out.print("Your choice: ");
    }

    private void printCharacterInventory() {
        System.out.println("\n\n======= CHARACTERS =======");
        List<Character> list = process.getCharacterInventory();
        if (list.isEmpty()) System.out.println("You have no characters yet.");
        else list.forEach(c -> System.out.println("- " + c.getName()));
        System.out.println("99. Back");
    }

    private void printWeaponInventory() {
        System.out.println("\n\n======== WEAPONS =========");
        List<Weapon> list = process.getWeaponInventory();
        if (list.isEmpty()) System.out.println("You have no weapons yet.");
        else list.forEach(w -> System.out.println("- " + w.getName()));
        System.out.println("99. Back");
    }

    public static void printSpinMenu() {
        System.out.println("\nChoose spin:");
        System.out.println("1. Single (1x)");
        System.out.println("2. Ten Pull (10x)");
        System.out.print("Your choice: ");
    }

    public static void printBannerMenu() {
        System.out.println("\nChoose banner:");
        System.out.println("1. Standard");
        System.out.println("2. Limited");
        System.out.println("3. Weapon");
        System.out.print("Your choice: ");
    }

    public static int getInput() {
        return scan.nextInt();
    }

    public static void printPulledCharacter(Character c) {
        System.out.println("\nYou pulled: " + c.getName());
    }

    public static void printPulledTenCharacters(List<Character> list) {
        System.out.println("\nTen Pull Result:");
        list.forEach(c -> System.out.println("☆ " + c.getName()));
    }
}