import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][] A=new int[3][3];
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Enter element ["+i+"]["+j+"]: ");
				A[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("");
		}
		//System.out.println();
	}

}
