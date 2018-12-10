package test;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
public class App extends SpringBootServletInitializer {


    @Resource(name="classpath:my.properties")
    private Resource somePropertyFile;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder ) {
        return builder.sources( App.class );
    }

}
