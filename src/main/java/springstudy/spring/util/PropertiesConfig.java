package springstudy.spring.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@AllArgsConstructor
@ConfigurationProperties(prefix = "my")
@ConstructorBinding
public class PropertiesConfig {
    private final String name;
    private final int age;

    private final Api api;

    @AllArgsConstructor
    @Getter
    public static class Api {
        private final String country;
        private final boolean marriage;
    }
}

