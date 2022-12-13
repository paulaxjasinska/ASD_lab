public class Plecak_krotszy {
    public static void main(String[] args) {
        pakujMale(przedmioty,obj);
    }
    final static int obj=10;
    final static int przedmioty=6;

    public static void pakujMale(int ilosc, int objetosc)
    {
        int[] v = {1, 2, 2, 3, 3, 6};
        int[] w = {2, 7, 4, 10, 5, 6};

        int wartosc = 0;

        for(int i=0 ;i<ilosc; i++)
        {
            if(v[i] <= objetosc)
            {
                wartosc += w[i];
                objetosc -= v[i];
            }
        }

        System.out.println("Wartość(MALE): " + wartosc);
    }
    public static void pakujCenne(int ilosc, int objetosc)
    {
        int[] v = {3, 2, 6, 3, 2, 1};
        int[] w = {10, 7, 6, 5, 4, 2};

        int wartosc = 0;

        for(int i=0 ;i<ilosc; i++)
        {
            if(v[i] <= objetosc)
            {
                wartosc += w[i];
                objetosc -= v[i];
            }
        }

        System.out.println("Wartość(CENNE): " + wartosc);
    }

    public static void pakujmale(int ile, int obj){
        int[]v={1,2,2,3,3,6};
        int[] w={2,7,4,10,5,6};
        int wartosc=0;
        for (int i = 0; i < ile; i++) {
            if(v[i]<=obj){
                wartosc += w[i];
                obj -= v[i];
            }
        }
        System.out.println("Wartość: "+wartosc);

        }
}
