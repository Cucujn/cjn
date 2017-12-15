import java.util.Arrays;
/**
 * 请尝试各种数组的定义及赋值方法、数组元素的访问及输出
 * @author wfpan
 */ 

class ArrayDemo {
	public static void main(String[] args) {
//		int[][] a = new int[2][2];
		int[][] a = new int[3][];
		a[0] = new int[3];
		a[1] = new int[10];
		a[2] = new int[5];

		for(int[] x:a) ｛
			for(int y:x) {
				System.out.println(y);
			}
		｝
	

				
	}
}
