package hello;

import com.springboot.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import static org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving.ENABLED;

/**
 * 文 件 名:MyLTWTest
 * 创 建 人:hackeridear
 * 创建日期:2018-06-05
 * 描   述:MyLTWTest
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@Configuration
public class MyLTWTest {

    @Autowired
    @Qualifier("user")
    private User user;

    public void test(){
        System.out.println("年龄:" + user.getAge());
    }
}
