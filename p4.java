import java.util.Scanner;
class p4
{
	public static void main(String[] args) 
	{
		int[][] matrix_1, matrix_2, sum;
		int r, c;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter order of matrices : ");
		r = in.nextInt();
		c = in.nextInt();
		matrix_1 = new int[r][c];
		matrix_2 = new int[r][c];
		sum = new int[r][c];

		System.out.println("Enter matrix 1 : ");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				matrix_1[i][j] = in.nextInt();

		System.out.println("Enter matrix 2 : ");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				matrix_2[i][j] = in.nextInt();

		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				sum[i][j] = matrix_1[i][j] + matrix_2[i][j];

		System.out.println("Sum : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print(sum[i][j] + "\t");
			System.out.println();
		}

	}
}
