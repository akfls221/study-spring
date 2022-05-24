package springstudy.spring.mapstruct;

import lombok.*;

@RequiredArgsConstructor
@Getter
public class MemberDto {

    private final String userName;
    private final int userAge;
    private final String userType;


}
