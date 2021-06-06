//package java30day.FifteenDay.字节流.输入流;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class Demo05复制读取字节数组 {
//    public static void main(String[] args) {
//        long s = System.currentTimeMillis();
//        FileOutputStream fis = null;
//        FileOutputStream fos = null;
//        try {
////            fis = new FileInputStream("c:\\t.zip");
//            fos = new FileOutputStream("d:\\t.zip");
//            //定义字节数组，写入数组
//            int len = 0;
//            while ((len = fis.read(bytes)) !=-1){
//                //写入数组
//                fos.write( bytes,0,len);
//            }
//        }catch (IOException ex){
//            System.out.println(ex );
//            throw new RuntimeException( "文件复制失败" );
//        }finally {
//            try {
//                //如果输出流为空
//                if (fos ! = null)
//                    //关闭输出流
//                    fos.close();
//            }catch (IOException ex){
//                System.out.println(ex );
//                throw new RuntimeException( "文件复制失败" );
//            }finally {
//                try {
//                    if (fos != null)
//                        fos.close();
//                }catch (IOException ex){
//                    throw new RuntimeException( "释放资源失败" );
//                }finally {
//                    try {
//                        if (fis !=null)
//                            fis.close();//关闭输入流
//                    }catch (IOException ex){
//                        throw new RuntimeException( "释放资源失败" );
//                    }
//                }
//            }
//            long e = System.currentTimeMillis();
//            System.out.println(e-s );
//        }
//    }
//}
