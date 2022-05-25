package springstudy.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springstudy.spring.mapstruct.MemberDto;
import springstudy.spring.service.Service;
import springstudy.spring.util.PropertiesConfig;

@RestController
@RequiredArgsConstructor
public class SpringController {

    private final PropertiesConfig propertiesConfig;
    private final Service service;

    @GetMapping("index")
    public PropertiesConfig ConfigurationProperties() {
        return propertiesConfig;
    }

    @GetMapping("/api/{apiKey}")
    public ResponseEntity<MemberDto> apiCall(@PathVariable String apiKey) {
        return service.returnApi(apiKey);
    }
}
