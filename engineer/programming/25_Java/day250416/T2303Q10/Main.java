package day250416.T2303Q10;

class Person{
    private String name;
    public Person(String val){
        name = val;
    }
    public static String get(){
        return name;
        // static 메소드는 instance 변수를 호출할 수 없다.
    }
    public void print(){
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person obj = new Person("Tomorrow");
        obj.print();
    }
}
