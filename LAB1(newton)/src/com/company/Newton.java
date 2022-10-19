package com.company;

public class Newton {
    public int newton(int n, int k){
        int[][] tab = new int[n+1][k+1];
        for(int i=0; i<=n; i++){
            tab[i][0]=1;
        }
        for (int i=0; i<=n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j)
                    tab[i][j] = 1;
            }
        }


        return n;
    }
}
