public class DiZ {
    public static void main(String[] args) {
        //System.out.println(plecak(przedmioty-1,10));
        //zlicz(100);
    }
    static int obj=10;
    static int przedmioty=6;
    static int[] V={6,2,3,2,3,1};
    static int[] W={6,4,5,7,10,2};
    public static int plecak(int i, int obj){
      if(i==0 && obj<V[0]) return 0;
      if(i==0 && obj>=V[0]) return W[0];
      if(i>0 && obj<V[i]) return plecak(i-1,obj);
      else return Math.max(plecak(i-1,obj),W[i]+plecak(i-1,obj-V[i]));

    }
    static boolean sto,tysiac,dziesiec,sto_tys,milion;
    public static int zlicz(int n){
        if(n==1 || n==2) return 1;
        int kroliki= zlicz(n-1) + zlicz(n-2);
        if(kroliki>100 && !sto){
            System.out.println("Sto króliczków: "+n + " miesiąca");
            sto=true;
        }
        if(kroliki>1000 && !tysiac){
            System.out.println("Tysiąc króliczków: "+n + " miesiąca");
            tysiac=true;
        }
        if(kroliki>10000 && !dziesiec){
            System.out.println("Dziesięć tysięcy króliczków: "+n + " miesiąca");
            dziesiec=true;
        }
        if(kroliki>100000 && !sto_tys){
            System.out.println("Sto tysięcy króliczków: "+n + " miesiąca");
            sto_tys=true;
        }
        if(kroliki>1000000 && !milion){
            System.out.println("Milion króliczków: "+n + "miesiąca");
            milion=true;
        }
        return kroliki;
    }
}

