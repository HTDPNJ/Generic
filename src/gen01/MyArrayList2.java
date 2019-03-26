package gen01;

import java.util.Iterator;

public class MyArrayList2
{
    private String[] elem={"a","b","c","d","e","f","g"};
    private int size=elem.length;
    private class MyIt implements Iterator<String>{
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
    }

    public Iterator<String> iter(){
        return new MyIt();
    }

    public static void main(String[] args)
    {
        MyArrayList2 list=new MyArrayList2();
        Iterator iter=list.iter();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
