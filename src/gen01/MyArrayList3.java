package gen01;

import java.util.Iterator;

public class MyArrayList3 implements  Iterable<String>
{
    private String[] elem={"a","b","c","d","e","f","g"};
    private int size=elem.length;

    public Iterator<String> iterator(){  //匿名内部类
        return new Iterator<String>()
        {
            private int curosr=-1;
            /*判断是否含有下一个元素*/
            public boolean hasNext(){

                return curosr+1<size;
            }
            public String next(){
                curosr++;
                return elem[curosr];
            }
            public void remove(){
            }
        };

    }

    public static void main(String[] args)
    {
        MyArrayList3 list=new MyArrayList3();
        Iterator iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        for( String temp:list){
            System.out.println(temp);
        }
    }
}
