import java.util.*;

public class Arbre {
	private Noeud racine;
	
	public Arbre(Noeud n) {
		this.racine = n;
	}
	
	public Noeud getRacine() {
		return this.racine;
	}
	
	public void NPI(String expression) {
		Stack<Noeud> pile = new Stack<Noeud>();
		for(int i = 0;i<expression.length();i++) {
			if(expression.charAt(i) == '/' ) {
				Noeud droite = pile.pop();
				Noeud gauche = pile.pop();
				Noeud tmp = new Noeud('/',gauche,droite);
				pile.add(tmp);
			}
			else if(expression.charAt(i) == '+') {
				Noeud droite = pile.pop();
				Noeud gauche = pile.pop();
				Noeud tmp = new Noeud('+',gauche,droite);
				pile.add(tmp);
			}
			else if(expression.charAt(i) == '-') {
				Noeud droite = pile.pop();
				Noeud gauche = pile.pop();
				Noeud tmp = new Noeud('-',gauche,droite);
				pile.add(tmp);
			}
			else if(expression.charAt(i) == '*') {
				Noeud droite = pile.pop();
				Noeud gauche = pile.pop();
				Noeud tmp = new Noeud('*',gauche,droite);
				pile.add(tmp);
			}
			else {
				pile.add(new Noeud(expression.charAt(i)));
			}
		}
		this.racine = pile.pop();
	}
	
	public void parentheses(Arbre a) {
		if(a.racine != null) {
			a.racine.parentheses();
		}
	}
		
}
