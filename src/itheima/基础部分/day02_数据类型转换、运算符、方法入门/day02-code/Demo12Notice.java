/*
����byte/short/char����������˵������Ҳำֵ����ֵû�г�����Χ��
��ôjavac�����������Զ�������Ϊ���ǲ���һ��(byte)(short)(char)��

1. ���û�г������ķ�Χ������������ǿת��
2. ����Ҳ೬������෶Χ����ôֱ�ӱ���������
*/
public class Demo12Notice {
	public static void main(String[] args) {
		// �Ҳ�ȷʵ��һ��int���֣�����û�г������ķ�Χ��������ȷ�ġ�
		// int --> byte�������Զ�����ת��
		byte num1 = /*(byte)*/ 30; // �Ҳ�û�г������ķ�Χ
		System.out.println(num1); // 30
		
		// byte num2 = 128; // �Ҳ೬�������ķ�Χ
		
		// int --> char��û�г�����Χ
		// �����������Զ�����һ��������(char)
		char zifu = /*(char)*/ 65;
		System.out.println(zifu); // A
	}
}