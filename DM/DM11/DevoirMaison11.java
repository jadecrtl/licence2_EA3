public class DevoirMaison11 {
	private int[] tableau;
	
	public DevoirMaison11(int[] n) {
		this.tableau = n;
		tableau[0] = 0;
		for(int i = 1 ; i < tableau.length; i++) {
			if(tableau[i] != 0) {
				tableau[0]++;
			}
		}
	}
	
	public void insert(int p) {
		if(tableau[0] + 1 == tableau.length) {
			int[] t = new int[tableau.length * 2];
			for(int i = 0; i < tableau.length; i++) {
				t[i] = tableau[i];
			}
			this.tableau = t;
			insert(p);
			return;
		}
		int i = tableau[0] + 1;
		tableau[0]++;
		tableau[i] = p;
		while(i/2 != 0 && tableau[i] > tableau[i/2]) {
			int tmp = tableau[i];
			tableau[i] = tableau[i/2];
			tableau[i/2] = tmp;
			i = i/2;
		}
	}
	
	public int remove() {
		int max = tableau[1];
		tableau[1] = tableau[tableau[0]];
		tableau[tableau[0]] = 0;
		tableau[0]--;
		int i = 1;
        int j = 0;
		while(tableau[i] < tableau[2 * i] || tableau[i] < tableau[2 * i+1]) {
			if(tableau[2 * i] < tableau[2 * i+1]) {
				j = 2 * i+1;
			} else {
				j = 2 * i;
				int tmp = tableau[i];
				tableau[i] = tableau[j];
				tableau[j] = tmp;
				i = j;
			}
		}
		return max;
	}
	
	public void affiche() {
		for(int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] tab = {0,7,5,2};
		DevoirMaison11 f = new DevoirMaison11(tab);
		f.insert(8);
		f.affiche();
		System.out.println(f.remove());
		f.affiche();
	}

}
