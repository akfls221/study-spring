package springstudy.spring.mapstruct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
public class MemberDto {

    private final String userName;
    private final int userAge;
    private final String userType;

    /**
     * 생성자의 인자명은 컴파일시에 이름이 바뀌기 때문에 생성자를 찾지 못하는 경우가 있다
     * jackson은 역직렬화할때 생성자나 setter을 사용하는데 인자 이름이 바뀌어 버린 생성자를 찾지 못해 매핑시킬 수 없는 것입니다.
     * https://velog.io/@sileeee/JUnit%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%8B%A4%ED%96%89%EC%A4%91-%EB%A7%88%EC%A3%BC%EC%B9%9C-%EC%98%A4%EB%A5%98
     */
    public MemberDto(@JsonProperty("userName") String userName,
                     @JsonProperty("userAge") int userAge,
                     @JsonProperty("userType") String userType) {
        this.userName = userName;
        this.userAge = userAge;
        this.userType = userType;
    }
}
