package springstudy.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springstudy.spring.mapstruct.MemberDto;
import springstudy.spring.service.RestTemplateService;

@RestController
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateService service;

    @GetMapping("/return/{apiKey}")
    public MemberDto apiReturn(@PathVariable String apiKey) {
        return service.returnApi(apiKey);
    }
}
