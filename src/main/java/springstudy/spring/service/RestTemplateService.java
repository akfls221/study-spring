package springstudy.spring.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;
import springstudy.spring.mapstruct.MemberDto;

@org.springframework.stereotype.Service
@Slf4j
@RequiredArgsConstructor
public class RestTemplateService {

    public MemberDto returnApi(String apiKey) {
        if (apiKey.equals("api")) {
            return new MemberDto("엄태권", 29, "Master");
        }
        return null;
    }
}
