package JavaSE.FifteenDay;

import java.io.FileReader;
import java.io.IOException;

public class Demo02字符输入文本FileReader类 {
    /* int read()
				* 读取单个字符
			* int read(char[] cbuf)
				* 将字符读入数组
			* abstract  int read(char[] cbuf, int off, int len)
				* 将字符读入数组的某一部分。
				*  Reader类是抽象类,找到子类对象 FileReader
	 *
	 *   构造方法: 绑定数据源
	 *     参数:
	 *        File  类型对象
	 *        String文件名
     */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\ceshi\\abc.txt");
		/*int len =0;
		while ((len =fr.read()) != -1){
			System.out.println((char)len );
		}*/
		char[] ch = new char[1024];
		int len = 0;
		while ((len = fr.read(ch))!=-1){
			System.out.println(new String(ch,0,len) );
		}
		fr.close();
	}
}
