import java.util.Arrays;

/**
 * ��ϰ����Ķ�̬����
 *
 *
 * @author wfpan
 */

class ArrayDynamicAllocateDemo {
	public static void main(String[] args) {
		//�������鲢��ֵ
		int[] ages = new int[]{1,2,3};

		//ʹ��Arrays������ʵ����������估ֵ�Ŀ���
		//����������ĳ���
		int newLength = ages.length*3/2;
		//����һ����newLengthΪ���ȵ������飬Ȼ���ԭ��ages�е�ֵ�����������飬Ȼ���ٰ�����������ø�����ages
		//����Ҫע��һ�㣺���������飬ԭ���� �� �¿��ٵġ�
		ages = Arrays.copyOf(ages,newLength);
		for(int x:ages) {
			System.out.println(x);
		}

		
	}
}
