package pl.edu.ur.main;

/**
 *
 * @author Filip Szpunar
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        //ZADANIE 3
        int a, i;
        int[] tablica = new int[10];
        Scanner odczyt = new Scanner(System.in);
        for (i = 0; i < 10; i++) {

            System.out.println("podaj wartość " + (i) + " elementu tablicy");
            a = odczyt.nextInt();
            tablica[i] = a;
        }
        do {
            System.out.println("wybierz jakie elementy mają być wyświetlone lub w jakiej kolejności wpsiując: '1' od pierwszego do ostatniego, '2' od ostatniego do pierwszego, '3' o nieparzystych indeksach, '4' o parzystych indeksach  ");
            System.out.println("Jeśli chcesz zakonczyć wybierz 5");
            a = odczyt.nextInt();

            if (a == 1) {
                for (i = 0; i < 10; i++) {
                    System.out.println("tab[" + (i) + "]=" + tablica[i]);
                }
            } else if (a == 2) {
                for (i = 9; i > -1; i--) {
                    System.out.println("tab[" + (i) + "]=" + tablica[i]);
                }
            } else if (a == 3) {
                for (i = 0; i < 10; i++) {
                    if (i % 2 == 1) {
                        System.out.println("tab[" + (i) + "]=" + tablica[i] + ", ");
                    }
                }
            } else if (a == 4) {
                for (i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println("tab[" + (i) + "]=" + tablica[i] + ", ");
                    }
                }
            }
        } while (a < 5);
        //ZADANIE 4
        int b;
        int[] liczby = new int[10];
        for (i = 0; i < 10; i++) {

            System.out.println("podaj wartość " + (i) + " tablicy");
            a = odczyt.nextInt();
            liczby[i] = a;
        }
        for (a = 0; a < 6;) {
            System.out.println("wybierz działanie na tablicy wpisując : '1' suma el., '2' iloczyn el.,'3' wartość średnia,'4' wartość min,'5' wartość max.  ");
            System.out.println("Jeśli chcesz zakończyć wybierz 6");
            a = odczyt.nextInt();
            b = 0;
            switch (a) {
                case 1: {
                    for (i = 0; i < 10; i++) {
                        b = b + liczby[i];
                    }
                    System.out.println("suma elementów wynosi " + (b));
                    break;
                }
                case 2: {
                    for (i = 0; i < 10; i++) {
                        b = b * liczby[i];
                    }
                    System.out.println("iloczyn elementów wynosi " + (b));
                    break;
                }
                case 3: {
                    for (i = 0; i < 10; i++) {
                        b = b + liczby[i];
                    }
                    b = b / i;

                    System.out.println("średnia wartość tablicy wynosi " + (b));
                    break;
                }
                case 4: {
                    b = liczby[0];
                    for (i = 0; i < 10; i++) {
                        if (b > liczby[i]) {
                            b = liczby[i];
                        }

                    }
                    System.out.println("wartość minimalna tablicy wynosi " + (b));
                    break;
                }
                case 5: {
                    b = liczby[0];
                    for (i = 0; i < 10; i++) {
                        if (b < liczby[i]) {
                            b = liczby[i];
                        }

                    }
                    System.out.println("wartość maksymalna tablicy wynosi " + (b));
                    break;

                }

            }
        }
        //ZADANIE 6
        a = 0;
        while (a >= 0) {
            System.out.println("podaj liczbe całkowitą");
            b = odczyt.nextInt();
            if (b < 0) {
                break;
            }
        }
        //ZADANIE 7
        a = 1;
        System.out.println("Wprowadz ilosc elementow tablicy");
        int n = odczyt.nextInt();
        int[] tab = new int[n];
        System.out.println("podaj wartości elemenów tablicy");
        for (i = 0; i < tab.length; i++) {
            
            tab[i] = odczyt.nextInt();
        }
        while (a > 0) {
            a = 0;
            for (i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    b = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = b;
                    a++;
                }
            }

        }
        System.out.println("posortowane elementy tablicy ");
        for (i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }
}
