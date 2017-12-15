import java.util.Arrays;

/**
 * 练习数组的动态开辟
 *
 *
 * @author wfpan
 */

class ArrayDynamicAllocateDemo {
	public static void main(String[] args) {
		//开辟数组并赋值
		int[] ages = new int[]{1,2,3};

		//使用Arrays工具类实现数组的扩充及值的拷贝
		//计算新数组的长度
		int newLength = ages.length*3/2;
		//开辟一个以newLength为长度的新数组，然后把原来ages中的值拷贝到新数组，然后再把新数组的引用赋给了ages
		//这里要注意一点：有两个数组，原来的 和 新开辟的。
		ages = Arrays.copyOf(ages,newLength);
		for(int x:ages) {
			System.out.println(x);
		}

		
	}
}
