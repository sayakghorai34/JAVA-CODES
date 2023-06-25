
public class Matrix {

	public static void main(String[] args) {
		MatMethood obj=new MatMethood();
		System.out.println("Addition of Two Matrix");
		int[][]res=obj.MatAdd();
		System.out.println("Sum Is:");
		obj.PrintMat(res);
		
		
		
		res=obj.MatSub();
		System.out.println("Subtraction is:");
		obj.PrintMat(res);
		
		
		res=obj.MatMultiply();
		System.out.println("Multiplication:");
		obj.PrintMat(res);
	}

}
