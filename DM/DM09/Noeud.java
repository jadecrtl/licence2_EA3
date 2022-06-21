import java.util.*;

public class Noeud {
	private Noeud gauche;
	private Noeud droit;
	private char element;
	
	public Noeud(char s) {
		this.gauche = null;
		this.droit = null;
		this.element = s;
	}
	
	public Noeud(char s, Noeud gauche, Noeud droit) {
		this.gauche = gauche;
		this.droit = droit;
		this.element = s;
	}
	
	public void parentheses() {
		if(this.gauche != null) {
			System.out.print("(");
			this.gauche.parentheses();
		}
		System.out.print(element);
		if(this.droit != null) {
			this.droit.parentheses();
			System.out.print(")");
		}
		
	}
}
