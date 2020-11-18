package javaCode.three;

public class InheritInner  extends WithInner.Inner{
    public InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner ii = new InheritInner(withInner);
    }
}

class WithInner{
    class Inner{}
}
