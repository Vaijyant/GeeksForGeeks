package test;

public class OuterClass {

    public static void main(String arg[]) {
        StaticInnerClass obj1 = new StaticInnerClass();
        StaticInnerClass obj2 = new OuterClass.StaticInnerClass();
        NonStaticOuterClass obj3 = new OuterClass().new NonStaticOuterClass();
    }

    public static class StaticInnerClass{
        StaticInnerClass(){
            System.out.println("Static Inner class");
        }
    }

    public class NonStaticOuterClass {
        NonStaticOuterClass() {
            System.out.println("Non Static Inner Class");
        }
    }
}
