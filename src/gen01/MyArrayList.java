package gen01;
/*hasNext
* next*/
public class MyArrayList
{
    String[] elem={"a","b","c","d","e","f","g"};
    int size=elem.length;
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

    public static void main(String[] args)
    {
        MyArrayList list=new MyArrayList();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }

}
