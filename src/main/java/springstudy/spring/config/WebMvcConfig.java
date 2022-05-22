package springstudy.spring.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc // SrpingMvc 구성시 필요한 Bean 설정을 자동으로 해줌(Bean 사용을 안해도 됨.)
@Configuration
public class WebMvcConfig implements WebMvcConfigurer, WebMvcRegistrations {

    @Override// 해당 부분은 application.yml에서도 설정 가능
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**") ///매핑 URI 설정
                .addResourceLocations("/resources/"); // 정적 리소스 위치 설정
    }

    @Override // CORS 매핑 설정
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
