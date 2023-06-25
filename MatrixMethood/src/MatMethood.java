import java.util.Scanner;

public class MatMethood {
	Scanner sc=new Scanner(System.in);
	
	//Initialize new Array
	public int [][] newMat(int r,int c,char s){
		int [][] Arr=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("["+s+"]Enter element ["+i+"]["+j+"]: ");
				Arr[i][j]=sc.nextInt();
			}
		}
		return Arr;
	}
	
	//Matrix Addition 2mat
	public int [][] MatAdd(){
		System.out.println("~~~Addition of <<< A+B=C >>>~~~");
		System.out.println("Enter row:");
		int r=sc.nextInt();
		System.out.println("Enter col:");
		int c=sc.nextInt();
		int [][] arr1= newMat(r,c,'A'),arr2= newMat(r,c,'B'),res= new int[r][c];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}	
		}
		return res;
	}
	//Matrix subtraction 2mat
		public int [][] MatSub(){
			System.out.println("~~~Subtraction of <<< A-B=C >>>~~~");
			System.out.println("Enter row:");
			int r=sc.nextInt();
			System.out.println("Enter col:");
			int c=sc.nextInt();
			int [][] arr1= newMat(r,c,'A'),arr2= newMat(r,c,'B'),res= new int[r][c];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					res[i][j]=arr1[i][j]-arr2[i][j];
				}	
			}
			return res;
		}

		
		//Matrix Multiplication 2mat
		
		public int[][] MatMultiply(){
			
			System.out.println("~~~Multiplication of <<< A*B=C >>>~~~");
			System.out.println("Enter row1:");
			int r1=sc.nextInt();
			System.out.println("Enter col1:");
			int c1=sc.nextInt();
			System.out.println("Enter row2:");
			int r2= sc.nextInt();
			System.out.println("Enter col2:");
			int c2=sc.nextInt();
			int[][] res= new int[r1][c2];
			if(c1!=r2) {
				System.out.println("Error!! Column1 and Row2 Must be Same!!");
			}
			else if(c1==r2) {
				int [][] arr1= newMat(r1,c1,'A'),arr2= newMat(r2,c2,'B');
				for(int i=0;i<r1;i++) {
					for(int j=0;j<c2;j++) {
						for(int k=0;k<r2;k++) {
						res[i][j]+=arr1[i][k]*arr2[k][j];
					}	
				}
				
			}
		}
		return res;
	}


public void PrintMat(int[][]a) {
	int row=a.length;
	for(int i =0;i<row;i++) {
		for(int element:a[i]) {
			System.out.print(element+"\t");
		}
		System.out.println();
	}
}












}
