import java.io.Closeable;
import java.io.IOException;

public class TestMethod
{
    /*泛型方法<>，只能访问对象的信息，不能修改信息
    * 泛型方法<>返回类型签名*/
    public static void main(String[] args)
    {

    }
    public static<T> void test(T a){
        System.out.println("a");
    }
    public static <T extends Closeable> void test(T... a){
        for(T tem:a){
            try {
                tem.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
