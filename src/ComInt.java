public interface ComInt<T>
{
    int a=0;
}
class comp1<T> implements  ComInt{

}

class comp2<T> implements ComInt<T>{

}

class comp3 implements ComInt{

}

class comp4 implements ComInt<String>{

}
