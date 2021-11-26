public class FileTableau {
	private final int taille = 10;
	private Element[] tableau;
	private int premier = 0;
	private int dernier = 0;
	
	public FileTableau() {
		this.tableau = new Element[taille];
	}
	
	public boolean empty() {
		return (tableau[premier] == null);
	}
	
	public void put(Element x) {
		if(this.empty()) {
			tableau[premier] = x;
		} else {
			if(dernier > premier) {
				if(dernier == taille-1 && premier != 0) {
					dernier = 0;
					tableau[dernier] = x;
					return;
				} else {
					dernier++;
					tableau[dernier] = x;
					return;
				}
			}
			if(dernier+1 == premier ) {
				System.out.println("Le tableau est vide.");
				return;
			}
			dernier++;
			tableau[dernier] = x;
			return;
		}
	}
	
	public int get() {
		if(!this.empty() && tableau[premier] != null) {
			if(premier < dernier) {
				Element e = tableau[premier];
				tableau[premier] = null;
				premier++;
				return e.getValeur();
			}
			if(premier == taille-1) {
				Element e = tableau[premier];
				premier = 0;
				return e.getValeur();
			}
			Element e = tableau[premier];
			tableau[premier] = null;
			premier++;
			return e.getValeur();
		}
		return -1;
	}
	
	public void afficher() {
		for(int i = 0; i < taille; i++) {
			if(tableau[i] != null) {
				System.out.print("["+tableau[i].getValeur()+"] ");
			} else {
				System.out.print("["+tableau[i]+"] ");
			}	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Element e = new Element(2);
		Element e1 = new Element(4);
		Element e2 = new Element(8);
		Element e3 = new Element(9);
		Element e4 = new Element(6);
		FileTableau f = new FileTableau();
		System.out.println(f.empty());
		System.out.println();
		f.afficher();
		f.put(e);
		f.put(e1);
		f.put(e2);
		f.put(e3);
		f.put(e4);
		f.afficher();
	}

}
