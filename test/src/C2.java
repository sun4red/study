public class C2 implements I1 {
    @Override
    public int call1() {
        System.out.println("여기는 c2 call1");

        return 21;
    }

    @Override
    public int call2() {
        System.out.println("여기는 c2 call2");
        return 22;
    }
}
