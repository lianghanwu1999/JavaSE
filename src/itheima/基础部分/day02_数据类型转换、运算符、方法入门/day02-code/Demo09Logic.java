/*
�루���ң�	&&	ȫ����true������true���������false
�򣨻��ߣ�	||	����һ����true������true��ȫ����false������false
�ǣ�ȡ����	!	������true�����false��������false�����true

�롰&&������||�������ж�·Ч���������������Ѿ������жϵõ����ս������ô�ұߵĴ��뽫����ִ�У��Ӷ���ʡһ�������ܡ�

ע�����
1. �߼������ֻ������booleanֵ��
2. �롢����Ҫ���Ҹ�����һ��booleanֵ������ȡ��ֻҪ��Ψһ��һ��booleanֵ���ɡ�
3. �롢�����������������ж����������������д��
��������������A && ����B
�������������A && ����B && ����C

TIPS��
����1 < x < 3�������Ӧ�ò���������֣�Ȼ��ʹ�������������������
int x = 2;
1 < x && x < 3
*/
public class Demo09Logic {
	public static void main(String[] args) {
		System.out.println(true && false); // false
		// true && true --> true
		System.out.println(3 < 4 && 10 > 5); // true
		System.out.println("============");
		
		System.out.println(true || false); // true
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		System.out.println("============");
		
		System.out.println(true); // true
		System.out.println(!true); // false	
		System.out.println("============");
		
		int a = 10;
		// false && ...
		System.out.println(3 > 4 && ++a < 100); // false
		System.out.println(a); // 10
		System.out.println("============");
		
		int b = 20;
		// true || ...
		System.out.println(3 < 4 || ++b < 100); // true
		System.out.println(b); // 20
	}
}