public class Exercice5 {

    //1) Les pré-points fixes du tableau sont 0, 1, 2, 3 et 4 et les post-points fixes du tableau sont 3, 4 et 5.
    //2) Les post-points fixes se trouveront toujours après les pré-points fixes car le tableau est trié.

    //3)

    public static boolean chercheEle (int[] t) {
        int i=0;
        while(i < t.length && i > t[i]) {
            i++;
        }
        if (i <= t.length-1) {
            if (i+1 == t[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] t = {-1,0,1,3,4,8};
        int[] t2 = {1,2,3,4};
        int[] t3 = {-1,0,0,1};
        System.out.println(chercheEle(t));//doit renvoyer true
        System.out.println(chercheEle(t2));//doit renvoyer false
        System.out.println(chercheEle(t3));//doit renvoyer false
    }

    //Dans le pire des cas il fait une comparaison

}