package Kaya.hellospring;

import Kaya.hellospring.repository.MemberRepository;
import Kaya.hellospring.repository.MemoryMemberRepository;
import Kaya.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
