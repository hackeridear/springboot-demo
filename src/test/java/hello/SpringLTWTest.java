package hello;

import com.springboot.demo.Application;
import com.springboot.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 文 件 名:SpringLTWTest
 * 创 建 人:hackeridear
 * 创建日期:2018-06-05
 * 描   述:SpringLTWTest
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringLTWTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("hello.MyLTWTest");
        if( c.newInstance() instanceof MyLTWTest){
            MyLTWTest myLTWTest = (MyLTWTest) c.newInstance();
            myLTWTest.test();
        }
    }

    @Test
    public void test2(){
        User user  = (User) applicationContext.getBean("user");
        System.out.println(user.getAge() + "================");
    }
}
