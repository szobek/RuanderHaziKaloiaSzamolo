import kaloriaSzamolas.Kaloria;
import kaloriaSzamolas.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String nev;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.print("Adja meg a nevet: ");
        nev = scanner.nextLine();
        Menu menu = new Menu("1 - sport","2 - pihenés","3 - evés","4 - napi érték","5 - kilépés",nev);
        Kaloria kaloria=new Kaloria(nev);
        menu.showMenu(nev,kaloria);
        scanner.close();

    }


}