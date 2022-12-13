import java.sql.SQLOutput;
import java.util.Random;

public class M_C {
    public static void main(String[] args) {
    lody();
    }
    public static int lody(){
        final int[][] koszty = {
                {0, 7, 20, 21, 12, 23},
                {27, 0, 13, 16, 46, 5},
                {53, 15, 0, 25, 27, 6},
                {16, 2, 35, 0, 47, 10},
                {31, 29, 5, 18, 0, 4},
                {28, 24, 1, 17, 5, 0}
        };
        int smaki = koszty.length;
        int[] odp_smaki = new int[smaki+1];
        int naj_mozliwosc = Integer.MAX_VALUE;

        final int proby=10;
        Random rand = new Random();


        for(int i=0; i<proby;i++) {

            //losujemy 1 smak
            int poczatek = rand.nextInt(6);
            int[] tym_odp = new int[smaki+1];
            tym_odp[0] = poczatek;

            boolean[] uzyte_smaki = new boolean[smaki];
            uzyte_smaki[poczatek] = true;
            int kolejny_smak = 1;
            //losujemy kolejne smaki
            while (kolejny_smak < smaki) {
                int index_smaku = rand.nextInt(6);
                if (uzyte_smaki[index_smaku]) continue; //Jeśli sie powtórzył to losuj inny
                tym_odp[kolejny_smak] = index_smaku;
                uzyte_smaki[index_smaku] = true;
                kolejny_smak++;
            }
            //Wracamy do początkowego smaku
            tym_odp[6] = poczatek;


            //obliczanie wartości dla danej sekwencji
            int wartosc_kosztu = 0;
            for (int j = 0; j < tym_odp.length - 1; j++) {
                wartosc_kosztu += koszty[tym_odp[j]][tym_odp[j+1]];
            }
            //zapisujemy najlepsze wartości
            if (wartosc_kosztu < naj_mozliwosc) {
                naj_mozliwosc = wartosc_kosztu;
                odp_smaki = tym_odp;
            }
        }
        //Wypisanie wyniku
        System.out.println("Najlepsze rozwiązanie");
        System.out.println("Smaki: ");
        for(int i = 0; i<odp_smaki.length;i++){
            System.out.println(""+(odp_smaki[i]+1));
        }
        System.out.println("Całkowity czas przestrojeń: "+naj_mozliwosc);

        return naj_mozliwosc;
    }
}



