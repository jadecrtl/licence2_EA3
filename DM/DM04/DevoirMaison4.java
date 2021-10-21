public class DevoirMaison4 {

	public static void main(String[] args) {

        //On teste la fonction Fibonacci
		System.out.println("Résultat de la fonc Fibonacci récursive avec la valeur 5 : " + Fibonacci(5));
		System.out.println("");

        //Evaluation du temps de la fonction Fibonacci Récursive
		long start1 = System.nanoTime(); 
		Fibonacci(30);
		System.out.println("Résultat de la fonc Fibonacci récursive avec la valeur 30 : " + Fibonacci(30));
		long end1 = System.nanoTime(); 
		System.out.println("Le temps d'éxecution est de : " + (end1 - start1));
		System.out.println("");		

        //Evaluation du temps de la fonction Fibonacci Terminale
		long start2 = System.nanoTime(); 
		FibTerm(30);
		System.out.println("Résultat de la fonc Fibonacci terminale avec la valeur 30 : " + FibTerm(30));
		long end2 = System.nanoTime(); 
		System.out.println("Le temps d'éxecution est de : " +(end2 - start2));
		System.out.println("");		

        //Evaluation du temps de la fonction Fibonacci Itérative
		long start3 = System.nanoTime(); 
		FibIte(30); 
		System.out.println("Résultat de la fonc Fibonacci itérative avec la valeur 30 : " + FibIte(30));
		long end3 = System.nanoTime(); 
		System.out.println("Le temps d'éxecution est de : " + (end3 - start3));
        System.out.println("");

        //On remarque que parmis les 3 fonctions de Fibonacci, quand on prend des petites valeurs les différences en temps //en temps d'éxecution ne sont pas frappante
        //Or quand on prend des plus grandes valeurs on remarque que celle qui prend le plus de temps en terme d'éxecution
        //est la fonction Fibonacci récursive.
	}

    //Fonction Fibonacci récursive
    public static int Fibonacci(int i) {
		if(i == 0 || i == 1) {
			return 1;
		}
		return Fibonacci(i-1) + Fibonacci(i-2); // Pour les cas ou i > 1 
	}

    //Fonction Fibonacci itérative    
	public static int FibIte(int i) {
		int acc1 = 1; // On crée 2 variables pour les additioner 
		int acc2 = 1;
		int x; // Une variable temporaire pour stocker lors d'un changement de variable sur les 2 variables précédentes
		while(i > 1) { // Si i < 1 alors i = 0 ou i = 1
			x = acc1; 
			acc1 = acc2;
			acc2 = x + acc2;
			i--;
		}
		return acc2;
	}
	
    //Fonction Fibonacci terminale	
	public static int FibTerm(int i) {
		return FibAux(i,1,1);
	}

	//Fonction auxiliaire qui complète la fonction Fibonacci terminale
	public static int FibAux(int i , int acc1, int acc2) {
		if(i == 0 || i == 1) {
			return acc1;// Ici on stock directement le résultat dans l'argument
		}
		else {
			return FibAux(i-1, acc1+acc2, acc1);
		}
	}

    
}
