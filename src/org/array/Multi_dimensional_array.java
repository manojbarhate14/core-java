package org.array;

public class Multi_dimensional_array {
	public void Multi_dimensional() 
	{
	  int [][] ar = {{50,05,55},{21,32,25},{44,28,58}}; // second way
	//	int [][] ar = new int [3][3];

		/*ar [0] [0] =50;
		ar [0] [1] =65;
		ar [0] [2] =25;

		ar [1] [0] =35;
		ar [1] [1] =45;
		ar [1] [2] =55;

		ar [2] [0] =63;
		ar [2] [1] =35;
		ar [2] [2] =68;*/

		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("ar[" + i + "][" + j + "]= "+ar [i][j]);
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Multi_dimensional_array obj =new Multi_dimensional_array();
		obj.Multi_dimensional();
	}
}
