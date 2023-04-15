package kaloriaSzamolas;

import java.util.Scanner;

public final class Menu {
    private String nev;
    private Kaloria kaloria;
    private final String menupont1;
    private final String menupont2;
    private final String menupont3;
    private final String menupont4;
    private final String menupont5;
    static Scanner scanner = new Scanner(System.in);


    public void showMenu(String nev,Kaloria kaloria) {
        char menu;
        this.nev = nev;
        this.kaloria = kaloria;
        System.out.println(menupont1);
        System.out.println(menupont2);
        System.out.println(menupont3);
        System.out.println(menupont4);
        System.out.println(menupont5);
        do {
            System.out.println("\n\nAdja meg a menüpontot: ");
            menu = scanner.nextLine().replace(',', '.').charAt(0);
        } while (menu <= 5 && menu >= 1);
        selectMenupont(menu, kaloria);

    }

    public Menu(String menupont1, String menupont2, String menupont3, String menupont4, String menupont5, String nev) {
        this.menupont1 = menupont1;
        this.menupont2 = menupont2;
        this.menupont3 = menupont3;
        this.menupont4 = menupont4;
        this.menupont5 = menupont5;
        this.nev = nev;
    }

    public void selectMenupont(char menu, Kaloria kaloria) {
        switch (menu) {
            case '1' -> {
                System.out.print("Hány óra sport? ");
                kaloria.sportolas(Double.parseDouble(scanner.nextLine()));
                showMenu(this.nev,kaloria);
            }
            case '2' -> {
                System.out.print("Hány óra pihenés? ");
                kaloria.pihenes(Double.parseDouble(scanner.nextLine()));
                showMenu(this.nev,kaloria);
            }
            case '3' -> {
                System.out.print("Mennyi kcal-t evett? ");
                kaloria.taplalkozas(Integer.parseInt(scanner.nextLine()));
                showMenu(this.nev,kaloria);
            }
            case '4' -> {
                kaloria.napiErtek();
                showMenu(this.nev,kaloria);
            }
            case '5' -> {

            }
            default -> {
                System.out.println("Ismeretlen menü");
                showMenu(this.nev,kaloria);
            }
        }
    }
}
