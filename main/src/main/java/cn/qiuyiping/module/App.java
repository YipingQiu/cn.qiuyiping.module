package cn.qiuyiping.module;

import cn.qiuyiping.module.area.AreaService;
import cn.qiuyiping.module.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "cn.qiuyiping.module")
@EnableAutoConfiguration
@RestController
public class App {

    @Autowired
    private UserService userService;

    @Autowired
    private AreaService areaService;

    @RequestMapping("/")
    public String home() {
        userService.addUser();
        areaService.addArea();
        return "success";
    }

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
