/**
 * Created by narahara on 7/10/2017.
 */
public class BusinessLogic {
    @MyAnnotation1
    @MyAnnotation2
    public void method1() {
        System.out.println("Annotated method1 called.");
    }

    @MyAnnotation1
    public void method2() {
        System.out.println("Annotated method2 called.");
    }

    public void method3() {
        System.out.println("Method withoud annotation");
    }
}

