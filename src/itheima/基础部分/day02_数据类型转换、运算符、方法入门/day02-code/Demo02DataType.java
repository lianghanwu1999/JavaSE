/*
ǿ������ת��
	1. �ص㣺������Ҫ��������ĸ�ʽ���������Զ���ɡ�
	2. ��ʽ����ΧС������ ��ΧС�ı����� = (��ΧС������) ԭ����Χ�������;

ע�����
	1. ǿ������ת��һ�㲻�Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ�����������
	2. byte/short/char���������Ͷ����Է�����ѧ���㣬����ӷ���+��.
	3. byte/short/char�����������������ʱ�򣬶��ᱻ����������Ϊint���ͣ�Ȼ���ټ��㡣
	4. boolean���Ͳ��ܷ�����������ת��
*/
public class Demo02DataType {
	public static void main(String[] args) {
		// �����int���ͣ��ұ���long���ͣ���һ��
		// long --> int�����Ǵ�С����
		// ���ܷ����Զ�����ת����
		// ��ʽ����ΧС������ ��ΧС�ı����� = (��ΧС������) ԭ����Χ�������;
		int num = (int) 100L;
		System.out.println(num);
		
		// longǿ��ת����Ϊint����
		int num2 = (int) 6000000000L;
		System.out.println(num2); // 1705032704
		
		// double --> int��ǿ������ת��
		int num3 = (int) 3.99;
		System.out.println(num3); // 3���Ⲣ�����������룬���е�С��λ���ᱻ������
		
		char zifu1 = 'A'; // ����һ���ַ��ͱ����������Ǵ�д��ĸA
		System.out.println(zifu1 + 1); // 66��Ҳ���Ǵ�д��ĸA������65���д���
		// ������ĵײ����һ�����֣������ƣ��������ַ�A������65
		// һ��char���ͽ�������ѧ���㣬��ô�ַ��ͻᰴ��һ���Ĺ������Ϊһ������
		
		byte num4 = 40; // ע�⣡�Ҳ����ֵ��С���ܳ����������ͷ�Χ
		byte num5 = 50;
		// byte + byte --> int + int --> int
		int result1 = num4 + num5;
		System.out.println(result1); // 90
		
		short num6 = 60;
		// byte + short --> int + int --> int
		// intǿ��ת��Ϊshort��ע����뱣֤�߼�����ʵ��С������û�г���short��Χ������ᷢ���������
		short result2 = (short) (num4 + num6);
		System.out.println(result2); // 100
	}
}