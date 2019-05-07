public class Arrays{
	public static void main(String[] args){
		int a[] = new int[4];
		a[0] = 0;
		a[3] = 3;
		System.out.print("Values in array are: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(Integer.toString(a[i]));
			if(i != a.length - 1){
				System.out.print(", ");
			}else{
				System.out.println();
			}
		}
		int b[][] = new int[4][];
		b[0] = new int[8];
		b[1] = new int[4];
		b[2] = new int[2];
		b[3] = new int[1];
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				System.out.print(Integer.toString(b[i][j]));
			}
			System.out.println();
		}
		int c[][] = {{0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3}, {0, 1}, {0}};
		for(int i[] : c){
			for(int j : i){
				System.out.print(Integer.toString(j));
			}
			System.out.println();
		}
		char cs[] = {'J', 'o', 'n', 'y'};
		System.out.println(cs);
	}
}
