/*
�����������++
�Լ��������--

�������壺��һ��������һ������1��������һ��������һ������1
ʹ�ø�ʽ��д�ڱ�������֮ǰ������д�ڱ�������֮�����磺++num��Ҳ����num++
ʹ�÷�ʽ��
	1. ����ʹ�ã����������κβ�����ϣ��Լ�������Ϊһ�����衣
	2. ���ʹ�ã�������������ϣ������븳ֵ��ϣ��������ӡ������ϣ��ȡ�
ʹ������
	1. �ڵ���ʹ�õ�ʱ��ǰ++�ͺ�++û���κ�����Ҳ���ǣ�++num;��num++;����ȫһ���ġ�
	2. �ڻ�ϵ�ʱ���С��ش�����
		A. ����ǡ�ǰ++������ô��������������+1����Ȼ�����Ž������ʹ�á�	���ȼӺ��á�
		B. ����ǡ���++������ô����ʹ�ñ�����������ֵ����Ȼ�����ñ���+1����	�����ú�ӡ�
		
ע�����
	ֻ�б�������ʹ���������Լ���������������ɷ����ı䣬���Բ����á�
*/
public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1); // 10
		++num1; // ����ʹ�ã�ǰ++
		System.out.println(num1); // 11
		num1++; // ����ʹ�ã���++
		System.out.println(num1); // 12
		System.out.println("=================");
		
		// ���ӡ������ϵ�ʱ��
		int num2 = 20;
		// ���ʹ�ã���++�������������ϱ��21��Ȼ���ӡ���21
		System.out.println(++num2); // 21
		System.out.println(num2); // 21
		System.out.println("=================");
		
		int num3 = 30;
		// ���ʹ�ã���++������ʹ�ñ���������30��Ȼ�����ñ���+1�õ�31
		System.out.println(num3++); // 30
		System.out.println(num3); // 31
		System.out.println("=================");
		
		int num4 = 40;
		// �͸�ֵ�������
		int result1 = --num4; // ���ʹ�ã�ǰ--��������������-1���39��Ȼ�󽫽��39����result1����
		System.out.println(result1); // 39
		System.out.println(num4); // 39
		System.out.println("=================");
		
		int num5 = 50;
		// ���ʹ�ã���--�����Ȱѱ���������50����result2��Ȼ�����Լ���-1���49
		int result2 = num5--;
		System.out.println(result2); // 50
		System.out.println(num5); // 49
		System.out.println("=================");
		
		int x = 10;
		int y = 20;
		// 11 + 20 = 31
		int result3 = ++x + y--;
		System.out.println(result3); // 31
		System.out.println(x); // 11
		System.out.println(y); // 19
		
		// 30++; // ����д��������������ʹ��++����--
	}
}