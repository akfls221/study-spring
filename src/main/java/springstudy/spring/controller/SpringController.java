package springstudy.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springstudy.spring.util.PropertiesConfig;

@RestController
@RequiredArgsConstructor
public class SpringController {

    private final PropertiesConfig propertiesConfig;

    @GetMapping("index")
    public PropertiesConfig ConfigurationProperties() {
        return propertiesConfig;
    }
}
