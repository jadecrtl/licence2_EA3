public class Exercice {

    public static void triDrapeau(int[] T) {
        int p = 0;
        int m = 0;
        int g = T.length-1;
        while(m <= g) {
            switch(T[m]) {
                case 0:
                    int tmp = T[m];
                    T[m] = T[p];
                    T[p] = tmp;
                    m++;
                    p++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    tmp = T[m];
                    T[m] = T[g];
                    T[g] = tmp;
                    g--;
                    break;
            }
        }
    }

    public static void triDrapeauBicolore(int[] T) {
        int p = 0;
        int m = 0;
        int g = T.length-1;
        while(m <= g) {
            switch(T[m]) {
                case 0:
                    int tmp = T[m];
                    T[m] = T[p];
                    T[p] = tmp;
                    m++;
                    p++;
                    break;
                case 1:
                    m++;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] t = {1,1,0,2,0,2};
        int[] t2 = {0,1,0,0,1,1};
        triDrapeau(t);
        triDrapeauBicolore(t2);
        for (int i=0; i<t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println("");
        for (int i=0; i<t2.length; i++) {
            System.out.print(t2[i]+" ");
        }
    }


}