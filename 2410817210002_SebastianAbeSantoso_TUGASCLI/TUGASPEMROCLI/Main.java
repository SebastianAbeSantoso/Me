package TUGASPEMROCLI;

public class Main {
    public static void main(String[] args) {
        Gacha gacha = new Gacha();
        Process process = new Process(gacha);
        GUI gui = new GUI(process);

        gui.menuHandler();
    }
}