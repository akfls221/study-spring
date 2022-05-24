package springstudy.spring.mapstruct;


import lombok.*;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@Setter
public class MemberEntity {

    private final String name;
    private final int age;
    private final String type;

    @Builder
    public MemberEntity(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public static MemberEntity matchUp(MemberDto memberDto) {
        return MemberEntity.builder()
                .name(memberDto.getUserName())
                .age(memberDto.getUserAge())
                .type(memberDto.getUserType())
                .build();
    }

}
