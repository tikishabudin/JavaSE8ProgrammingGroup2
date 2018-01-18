
public class Day1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x = 5;
		final int[] nums = {1,2,3,4,5,-2,57};
		boolean[] moreNums = new boolean[100];// \0
		int[][] multiInt = new int[3][3];
		multiInt[1][1] = 5;
		
		//Jagged Array
		boolean[][] attendance = new boolean[2][];
		attendance[0] = new boolean[12];
		attendance[1] = new boolean[16];
		
		//x = 100;
		nums[2] = 5;
		//nums = {0,0,0,0,0};
		
		//nums[10] = 100;
		
		for(boolean bool: moreNums)
		{
			bool = true;
		}
		
//		for(int i = 0; i < moreNums.length; i++)
//		{
//			moreNums[i] = true;
//		}
			
		
		System.out.println(moreNums[3]);
	}

}
