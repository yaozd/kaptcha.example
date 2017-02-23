package kaptcha.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/2/23.
 */
@SpringBootApplication
@ComponentScan("kaptcha.example")
public class ApplicationKaptcha {

    /**
     *  kaptcha随机验证码的使用详解,超实用
     *  http://www.cnblogs.com/shaohz2014/p/3534677.html
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationKaptcha.class, args);
    }
}
