import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
//        System.out.println("check helloworld");
        System.out.println(bean1==bean2);

        Cat cat1= applicationContext.getBean("cat", Cat.class);
        Cat cat2= applicationContext.getBean("cat", Cat.class);

//        System.out.println("check cat");
        System.out.println(cat1==cat2);
    }
}