package class1_1.For;

public class ForExam5_1{
	public static void main(String args[]) {
		for(int i = 5; i >=1; i--) {
			for(int j = 1; j <= i; j++)
				System.out.print(j + "\t");
			System.out.print("\n");
		}
	}
}