public class Dym {
    public static void main(String[] args) {
        //plecak();
        //zlicz();
    }
    public static void plecak(){
        int obj=10;
        int[]W={6,4,5,7,10,2};
        int[]V={6,2,3,2,3,1};
        int przedmioty=V.length;
        int[][] tab= new int[przedmioty][obj+1];
        for (int i = 0; i < przedmioty; i++) {
            for (int j = 0; j <=obj ; j++) {
                if(i==0 && V[0]>j) tab[i][j]=0;
                else if(i==0 && V[0]<=j) tab[i][j]=W[0];
                else if(i>0 && V[i]>j) tab[i][j]=tab[i-1][j];
                else if(i>0 && V[i]<=j) tab[i][j]=Math.max(tab[i-1][j],W[i]+tab[i-1][j-V[i]]);
            }
        }
        System.out.println(tab[przedmioty-1][obj]);
    }
    static boolean sto,tysiac,milion;
    public static void zlicz(){
        int n=31;
        int [] tab = new int[n];
        tab [0]=1;
        tab[1]=1;
        for (int i = 2; i < tab.length ; i++) {
            tab[i]=tab[i-1]+tab[i-2];
            if(tab[i]>100 && !sto){
                System.out.println("Sto króliczków: "+i + " miesiąca");
                sto=true;
            }
            if(tab[i]>1000 && !tysiac){
                System.out.println("Tysiąc króliczków: "+i + " miesiąca");
                tysiac=true;
            }
            if(tab[i]>1000000 && !milion){
                System.out.println("Milion króliczków: "+i + "miesiąca");
                milion=true;
            }
        }
        System.out.println(tab[n-1]);
    }
}
