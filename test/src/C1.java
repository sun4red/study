public class C1 implements I1{
    @Override
    public int call1() {
        System.out.println("여기는 c1 call1");
        return 11;
    }

    @Override
    public int call2() {
        System.out.println("여기는 c1 call2");
        return 12;
    }
}
