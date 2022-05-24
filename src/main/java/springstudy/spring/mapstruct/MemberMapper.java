package springstudy.spring.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ValueMapping;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    @Mapping(target = "name", source = "userName")
    @Mapping(target = "age", source = "userAge")
    @Mapping(target = "type", source = "userType")
    MemberEntity dtoToEntity(MemberDto memberDto);

    default MemberEntity matchUp(MemberDto memberDto) {
        return MemberEntity.matchUp(memberDto);

    }

}
