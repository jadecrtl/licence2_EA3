public class DevoirMaison10 {
    /*
    On souhaite ecrire une fonction trasfBinGen 
    qui prend en parametre un arbre binaire sans sous-arbre droit
    et renvoie le code prefixe décrit en cours de l’arbre général correspondant.
    */

    public String trasfBinGen() {
        String tmp = "";//initialisation de l'affichage de l'arbre
        if (this.gauche != null) {//si gauche est different de null on va continuer à avancer dans l'arbre
            int i = 1;//compteur pour indiquer a quel profondeur se trouve la valeur de l'arbre
            Noeud n = this.gauche;
            while (n.droit != null) {
                System.out.println(i);
                i += 1;//plus on descend dans l'arbre plus on incremente i
                n = n.droit;//on set n qui etait this.gauche a this.gauche.droit
            }
            tmp += "(" + this.val + ", " + i + ")";
            tmp += this.gauche.trasfBinGen();//appel recursif
        }
        if (this.gauche == null) {
            tmp += "(" + this.val + ", " + 0 + ")";
        }
        if (this.droit != null) {
            tmp += this.droit.trasfBinGen();
        }
        return tmp;//affichage final de l'arbre
    }






}