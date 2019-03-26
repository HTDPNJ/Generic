public  abstract class Father<T>
{
    /*父类为泛型类
    * 1、属性
    * 2、方法
    * 不能子类擦除,父类泛型
    * 1、属性类型
    * 父类中，随父类而定
    * 子类中，随子类定
    * 方法重写随父类定
    * */

    T name;
    public  abstract void test(T t);
}

/*子类声明时指定具体类型*/
 class  Child1 extends Father<String>{
    @Override
    public void test(String s)
    {

    }
}

/*子类为泛型类,类型在使用时确定*/
class Child2<T> extends Father<T>{
    @Override
    public void test(T t)
    {

    }

    /*
    * 子类为泛型类，父类不指定类型，泛型的擦出，统一使用Object替换*/
    class Child3<T1,T2>extends Father{
        @Override
        public void test(Object o)
        {
        }
    }

    /*子类与父类同时擦出*/
    class Child4 extends Father{
        @Override
        public void test(Object o)
        {
        }
    }
    /*
    * 错误，子类擦出，父类使用泛型*/
    /*class Child5<T> extends Father{
        @Override
        public void test(T t)
        {

        }
    }*/
}
