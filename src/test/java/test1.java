import com.dc.service.UserService;
import com.dc.service.UserServiceImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) classPathXmlApplicationContext.getBean("userServiceImp");

        System.out.println(userService.queryAll());

    }
}
