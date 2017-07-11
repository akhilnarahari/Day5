import java.lang.reflect.Method;

/**
 * Created by narahara on 7/10/2017.
 */
import java.lang.reflect.Method;

public class AnnotExp {

    public static void main(String[] args) {

        BusinessLogic bl = new BusinessLogic();
        Method[] methods = bl.getClass().getMethods();
        for (Method method : methods) {
            MyAnnotation1 run = method.getAnnotation(MyAnnotation1.class);
            if (run != null) {
                try {
                    method.invoke(bl);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        for (Method method : methods) {
            MyAnnotation2 run = method.getAnnotation(MyAnnotation2.class);
            if (run != null) {
                try {
                    method.invoke(bl);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}