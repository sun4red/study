class SuperObject{
    public void paint(){
        draw();
    }

    public void draw(){
        draw();
        System.out.println("Super Object");
    }
}

class SubObject extends SuperObject{
    public void paint(){
        super.draw();
    }

    public void draw(){
        System.out.println("Sub Object");
    }
}

public class p354_ex45 {
    public static void main(String[] args) {

        SuperObject a = new SubObject();            // SubObject 클래스의 생성자를 이용하여 SuperObject 클래스의 객체 변수 선언
                                                    // [부모클래스명][객채변수명] = new [자식클래스 생성자()]
                                                    // -> 부모클래스의 객체 변수를 선언하면서 자식클래스의 생성자를 사용하면 형 변환 발생
                                                    //    이렇게 형 변환이 발생했을 때 부모클래스와 자식클래스에 동일한 속성이나 메소드가 있으면
                                                    //    자식클래스의 속성이나 메소드로 재정의된다.
        a.paint();
    }
}
