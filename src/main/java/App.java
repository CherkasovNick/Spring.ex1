import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        boolean first = bean1.equals(bean2);
        boolean second = bean3.equals(bean4);
        System.out.println(first);
        System.out.println(second);
    }
}