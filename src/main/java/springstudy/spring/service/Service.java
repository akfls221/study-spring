package springstudy.spring.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import springstudy.spring.mapstruct.MemberDto;
import springstudy.spring.mapstruct.MemberEntity;

import java.net.URI;

@org.springframework.stereotype.Service
@Slf4j
@RequiredArgsConstructor
public class Service {

    private final RestTemplate restTemplate;

    public ResponseEntity<MemberDto> returnApi(String apiKey) {
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:8081/return/{apiKey}")
                .build()
                .expand(apiKey)
                .toUri();

        ResponseEntity<MemberDto> forEntity = restTemplate.getForEntity(uri, MemberDto.class);
        return forEntity;
    }
}
