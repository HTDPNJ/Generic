package gen04;
/*
* ?能在声明类型声明方法上使用，不能声明类上使用，也不能使用时用
* ?extends : <=上限 指定类型自身或子类
* ？super: >=上限  指定类型自身或父类 */
public class Student<T>
{
    T score;

    public static void main(String[] args)
    {
        Student<?> stu=new Student<String>();  //?声明时使用
        //Student<?> stu1=new Student<?>();  //?使用时使用?,错误
        test(new Student<Integer>());
        test2(new Student<Apple>()); //?实现了泛型
        //test3(new Student<Apple>());//泛型没有多态，错误
    }
    public static void test(Student<?> stu){
    }
    public static void test3(Student<Fruit> stu){
    }

    public static void test2(Student<?extends Fruit>stu){
    }

    public static void test4(Student<? super Fruit>stu){

    }


}
