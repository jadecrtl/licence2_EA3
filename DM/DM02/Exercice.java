public class Exercice {

    //exercice 4 question 1

    /*
    *Fonction permettant de ranger un tableau contenant uniquement trois valeurs
    *Ici dans le main pour tester la fonction on a mis les éléments 0, 1 et 2
    */

    public static void triDrapeau(int[] T) {
        int p = 0;
        int m = 0;
        int g = T.length-1;
        while(m <= g) {
            switch(T[m]) {//En fonction de la valeur du switch on regarde si la valeur est égale aux cases ci-dessous
                case 0:
                    int tmp = T[m];//On crée une valeur temporaire où on stocke T[m]
                    T[m] = T[p];//On dit que T[m]=T[p]
                    T[p] = tmp;//Puis on dit que T[p]=la valeur temporaire
                    m++;//on incrémente m
                    p++;//on incrémente p
                    break;//On sort du case
                case 1:
                    m++;//on incrémente m
                    break;
                case 2:
                    tmp = T[m];//On crée une valeur temporaire où on stocke T[m]
                    T[m] = T[g];//On dit que T[m]=T[g]
                    T[g] = tmp;//Puis on dit que T[g]=la valeur temporaire
                    g--;//on décrémente g
                    break;
            }
        }
    }

    /*
    *La fonction est la même que la précédente or on a que 2 éléments différents au total
    *Donc on a besoin que de 2 cases 
    */

    //exercice 5
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
        int[] t = {1,1,0,2,0,2};//tableau d'entiers avec juste 3 éléments différents
        int[] t2 = {0,1,0,0,1,1};//tableau d'entiers avec juste 2 éléments différents
        triDrapeau(t);
        triDrapeauBicolore(t2);

        //2 for pour afficher les tableaux rangés 
        for (int i=0; i<t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println("");
        for (int i=0; i<t2.length; i++) {
            System.out.print(t2[i]+" ");
        }
    }


}