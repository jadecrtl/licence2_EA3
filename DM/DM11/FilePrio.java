
public class FilePrio {
	private int[] tab;
	
	public FilePrio(int[] t) {
		this.tab = t;
		tab[0] = 0;
		for(int i = 1 ; i < tab.length; i++) {
			if(tab[i] != 0) {
				tab[0]++;
			}
		}
	}
	
	public void insert(int p) {
		if(tab[0]+1 == tab.length) {
			int[] o = new int[tab.length*2];
			for(int i = 0; i < tab.length; i++) {
				o[i] = tab[i];
			}
			this.tab = o;
			insert(p);
			return;
		}
		int i = tab[0]+1;
		tab[0]++;
		tab[i] = p;
		while(i/2 != 0 && tab[i] > tab[i/2]) {
			int tmp = tab[i];
			tab[i] = tab[i/2];
			tab[i/2] = tmp;
			i = i/2;
		}
	}
	
	public int remove() {
		int max = tab[1];
		tab[1] = tab[tab[0]];
		tab[tab[0]] = 0;
		tab[0]--;
		int i= 1,j = 0;
		while(tab[i] < tab[2*i] || tab[i] < tab[2*i+1]) {
			if(tab[2*i] < tab[2*i+1]) {
				j = 2*i+1;
			} else {
				j = 2*i;
				int tmp = tab[i];
				tab[i] = tab[j];
				tab[j] = tmp;
				i = j;
			}
		}
		return max;
	}
	
	public void affiche() {
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] t = {0,7,5,2};
		FilePrio f = new FilePrio(t);
		f.insert(8);
		f.affiche();
		System.out.println(f.remove());
		f.affiche();
	}

}
