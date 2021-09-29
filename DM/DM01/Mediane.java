class Mediane {
    public static void main(String[] args) {
        
        //Création du tableau d'entier
        int[] array = {9, 5, 3, 0, 1};
        
        //Jeu de test pour tester la fonction compteInf
        System.out.println(compteInf(array, 4));
        System.out.println(compteInf(array, 0));
        System.out.println(compteInf(array, 6));
        System.out.println(compteInf(array, -3));
        System.out.println(compteInf(array, 12));

        //Création de tableaux à n éléments impair
        int[] tab = {1,2,3,4,5};
        int[] tab2 = {2,4,10,8,6};
        int[] tab3 = {4,10,8,6};
        int[] tab4 = {0,5,2,4,10,8,6};
        int[] tab5 = {20,6,13,8,0};

        //Jeu de test pour tester la fonction mediane
        System.out.println(mediane(tab));
        System.out.println(mediane(tab2));
        System.out.println(mediane(tab3));
        System.out.println(mediane(tab4));
        System.out.println(mediane(tab5));
    }

    //Question 1 :
    
    public static int compteInf(int[] t, int a) {
        int b = 0;//initialisation de l'entier b à 0 qui va être le compteur des entiers inférieur à a
        for (int i=0; i<t.length; i++) {
            if (t[i] < a) {//test pour voir si l'élément à l'index i est inférieur à a
                b++;
            }
        }
        return b;//le nombre d'éléments inférieur à a
    }

    //Question 2 :

    public static int mediane(int[] t) {
        int c = 0;//initialisation de l'entier c à 0 qui va être la médiane à la fin si le tableau d'éléments contient bien n éléments impair
        if (t.length % 2 == 0) {//vérification pour éliminer les tableaux à n éléments pair
            System.out.println("Le tableau contient un nombre pair de numéro dans le tableau donc ça ne marche pas.");
        }
        else{
            int b = (t.length - 1)/2;//définition de l'index de la médiane d'une série d'éléments impair dans un entier b
            for (int i=0; i<t.length; i++) {//boucler sur tout les éléments pour trouver la médiane car le tableau d'entier n'est pas forcement rangé
                if (b == compteInf(t, t[i])) {//l'index de la médiane doit être égal au nombre d'entiers inférieurs de l'élément à l'index i 
                    c = t[i];//quand le test est concluant on remplace la valeur initiale de c par la valeur de la médiane
                }
            }
        }
        System.out.println("La médiane est égal à :");
        return c;
    }



}