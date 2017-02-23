package kaptcha.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/23.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        StringBuilder sb=new StringBuilder();
        sb.append("验证码 kaptcha之springboot用法");
        return sb.toString();
    }
}
