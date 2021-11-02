
public class fusion {
	public static int[] triPartielle(int [] t, int i) {
		int j=i;
		int tmp ;
		while(j>0 && t[j]<t[j-1]) { 
			tmp = t[j];
			t[j] = t[j-1];
			t[j-1] = tmp;
			j--;
		}
		return t;
	}
		
	public static int[] triInsertion(int[] t) {
		int n = t.length;
		for(int i = 0; i < n; i++) { 
			triPartielle(t,i);			
		}
		return t;
	}
	
	public static int[][] separation(int[] t){
		int cpt=0;
		int j=1, k=0;
		while(j < t.length && t[j] > t[j-1]) {
			j++;
		}
		int[] t1 = new int[j];
		for(int i = 0; i < j; i++) {
			t1[i] = t[i];
		}
		for(int i=j; i < t.length; i++) {
			cpt++;
		}
		int[] t2 = new int[cpt];
		for(int i=j; i < t.length; i++) {
			t2[k] = t[i];
			k++;
		}
		int[][] res = {t1,t2};
		return res;
	}
	
	public static int[][] fusion(int[][] t, int i, int k) {
		int j=i;
		int tmp;
		triInsertion(t[1]);
		while(k>0 && t[0][j]>t[1][k-1]) {    // dans le pire des cas, on a : n(n-1)/2 comparaisons
			tmp = t[0][j];					// dans le meilleur on a : 1 comparaison
			t[0][j] = t[1][k-1];
			t[1][k-1] = tmp;
			k--;
		}
		return t;
	}
	
	public static int[][] fusion(int[][] t){
		for(int i = 0; i < t[0].length; i++) {
			for(int j=0; j < t[1].length; j++) {
				fusion(t,i,j);
			}
		}
		return t;
	}
	
	public static void main(String[] args) {
		int[] t = {4,1,10,5,9,1};
		int[][] t1 = fusion(separation(t));
		for(int i=0; i<t1.length; i++) {
			for(int j=0; j < t1[i].length; j++) {
				System.out.print(t1[i][j]+" ");
			}
		}
	}
}
