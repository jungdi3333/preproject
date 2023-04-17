package seb43_pre_027.demo.member;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import seb43_pre_027.demo.member.dto.MemberPostDto;
import seb43_pre_027.demo.member.dto.MemberResponseDto;
import seb43_pre_027.demo.member.entity.Member;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {
    Member memberPostToMember(MemberPostDto memberPostDto);
    MemberResponseDto memberToMemberResponseDto(Member member);

}
