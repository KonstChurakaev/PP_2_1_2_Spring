import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println("check helloworld");
        System.out.println(bean1==bean2);

        Cat cat1= (Cat) applicationContext.getBean("cat");
        Cat cat2= (Cat) applicationContext.getBean("cat");

//        System.out.println("check cat");
        System.out.println(cat1==cat2);
    }
}