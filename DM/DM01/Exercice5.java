class Exercice5 {
    public static void main(String[] args) {
        int[] array = {9, 5, 3, 0, 1};
        System.out.println(compteInf(array, 4));
        System.out.println(compteInf(array, 0));
        System.out.println(compteInf(array, 4));
        System.out.println(compteInf(array, -3));
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

    public static int mediane(int[] t, int a) {
        
        return 0;
    }



}