package gen04;
/*没有泛型数组
声明可以使用，但是创建失败
* */
public class Arraytest
{
    public static void main(String[] args)
    {
        Student<String>[] arr2=new Student[10];
        MyArrayList<String> strList=new MyArrayList<String>();
        strList.add(0,"a");
    }
}

class MyArrayList<E>{
    Object[] cap=new Object[10];

    public void add(int idx,E e){
        cap[idx]=e;
    }
    public E[] getAll(){
        return (E[]) cap;
    }

    public E getElem(int idx){
        return (E)cap[idx];
    }

}
