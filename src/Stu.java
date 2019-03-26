public class Stu<T>
{
    private T javaScore;
    private T oracleScore;

    public T getJavaScore()
    {
        return javaScore;
    }

    public void setJavaScore(T javaScore)
    {
        this.javaScore = javaScore;
    }

    public T getOracleScore()
    {
        return oracleScore;
    }

    public void setOracleScore(T oracleScore)
    {
        this.oracleScore = oracleScore;
    }

    public static void main(String[] args)
    {
        Stu stu1=new Stu();
        Stu<Object> stu=new Stu<Object>();

        test(stu1);
        //test(stu);
        test1(stu1);
        test1(stu);
    }
    public static void test(Stu<Integer>a){

    }
    public static void test1(Stu<?>a){

    }
}
