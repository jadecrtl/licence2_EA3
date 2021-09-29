class Exercice5 {
    public static void main(String[] args) {
        int[] array = {9, 5, 3, 0, 1};
        System.out.println(compteInf(array, 4));
        System.out.println(compteInf(array, 0));
        System.out.println(compteInf(array, 6));
        System.out.println(compteInf(array, -3));
        System.out.println(compteInf(array, 12));

        int[] tab = {1,2,3,4,5};
        System.out.println(mediane(tab));
    }

    //Question 1 :
    
    public static int compteInf(int[] t, int a) {
        int b = 0;
        for (int i=0; i<t.length; i++) {
            if (t[i] < a) {
                b++;
            }
        }
        return b;
    }

    //Question 2 :

    public static int mediane(int[] t) {
        int c = 0;
        if (t.length % 2 == 0) {
            System.out.println("Le tableau contient un nombre pair de numéro dans le tableau donc ça ne marche pas.");
        }
        else{
            int b = (t.length - 1)/2;
            if (b == compteInf(t, t[b])) {
                c = t[b];
            }
        }
        System.out.println("La médiane est égal à :");
        return c;
    }



}