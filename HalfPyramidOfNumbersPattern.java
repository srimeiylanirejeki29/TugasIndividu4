
public class HalfPyramidOfNumbersPattern {
	public static void main(String[] args) {
		int x;
		int y; 
		int a = 5;
		for (x = 1; x <=a; x++){
			//outer loop
			System.out.println();
			//Memberi garis baru atau enter

			for (y = 1; y <=x; y++) {
				//inner loop
				System.out.print(y+" ");
				//menampilkan bintang pada output  
			}
		}

	}
} 