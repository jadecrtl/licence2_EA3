import java.util.Arrays;

public class DevoirMaison6 {

	public static void main(String[]args) {
		int [] tab = new int [] {2,9,4,6,7,10};
		System.out.println(Arrays.toString(TriFusionCouper(tab)));
	}
	
	/*
	 	Cas de base : Si le tableau initial est de taille 0 alors l'agorithme va renvoyer un tableau vide ce qui est correct.
	 	Heredite : Si le premier tableau atteint sa taille maximale c'est a dire position1 >= t1.length alors l'algorithme rajoute que les elements du deuxieme tableau dans le tableau final.
	 			   Si le deuxieme tablau atteint sa taille maximale c'est a dire position2 >= t2.length alors l'agorithme rajoute que les elements du premier tableau dans le tableau final.
	 			   Si les deux tableaux sont de meme taille alors on verifie lequel est le plus grand des deux elements puis l'algorithme ajoute cette element dans le tableau final jusqu'a ne plus avoir d'element dans le tableau.
	 			   
	 */
	
	public static int [] TriFusion(int [] t1,int [] t2) {
		int [] temp = new int [t1.length +t2.length];
		int position1 = 0;
		int position2 = 0;
		for(int i = 0;i<temp.length;i++) { 
			if(position1 >= t1.length) {	// On verifie si le tableau t1 est arrive et sa taille maximum	
				temp[i] = t2[position2]; // Si c'est le cas alors on ajoute que les elements du tableau t2 dans le tableau retourne
				position2++;
				
			}
			else if(position2 >= t2.length) { // On verifie si le tableau t2 est arrive et sa taille max
				temp[i] = t1[position1]; // Si c'est le cas alors on ajoute que les �l�ments du tableau t1 dans le tableau retourne
				position1++;
				
			}
			else if(t1[position1] < t2[position2]) { // Si c'est deux tableaux ont la meme taille alors on regarde si l'un est plus grand que l'autre 
				temp[i] = t1[position1];
				position1++;
			}
			else { 
				temp[i] = t2[position2]; // Cas contraire du precedent
				position2++; 
			}
		}

		return temp;
		
		
	}
	
	public static int[] TriFusionCouper(int[] tab) {
		if(tab == null || tab.length <=1) { // On verifie si le tableau n'est pas vide ou de taille un 
			return tab;
		}
		int mid = tab.length/2; // On recupere le milieu du tableau
		int [] t1; // Cr�ation de deux tableaux
		int [] t2;
 		if(tab.length % 2 == 0) { // On verifie si la tableau est de taille paire 
			t1 = new int [mid]; // Alors les deux tableaux ont la meme taille
			t2 = new int [mid];
			for(int i = 0 ; i<t1.length; i++) { // On remplit les tableaux grace a une boucle
				t1[i] = tab[i];
				t2[i] = tab[i+mid];

			}
		}
 		else { // Cas contraire du precedent
 			t1 = new int [mid]; // Les deux tableaux ont une taille differente
 			t2 = new int [mid+1];
 			for(int i = 0; i<t1.length; i++) { // On remplit les deux tableaux
 				t1[i] = tab[i];
 				t2[i] = tab[i+mid];
 			}
 			t2[t2.length-1] = tab[tab.length-1]; // On remplit le dernier element dans le deuxieme tableau
 		}
 		return TriFusion(TriFusionCouper(t1),(TriFusionCouper(t2))); //On r'appelle la fonction jusqu'a avoir des tableaux de taille 1
	}
	
}
