package springstudy.spring.mapstruct;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
@Slf4j
class MemberDtoTest {

    @Autowired
    MemberMapper memberMapper;

    @Test
    public void dtoToEntity() {

        MemberDto memberDto = new MemberDto("엄태권", 29, "MASTER");
        MemberEntity member = memberMapper.dtoToEntity(memberDto);

        assertThat(memberDto.getUserName()).isEqualTo(member.getName());
        assertThat(memberDto.getUserAge()).isEqualTo(member.getAge());
        assertThat(memberDto.getUserType()).isEqualTo(member.getType());
    }



}