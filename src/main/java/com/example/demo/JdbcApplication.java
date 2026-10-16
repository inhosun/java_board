package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j

public class JdbcApplication implements ApplicationRunner {
    private final MemberRepository memberRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //memberRepository.save(Member.builder().
        //        name("홍길동").email("sun74@naver.com").age(50).build());
       // memberRepository.save(Member.builder().
        //        name("손흥민").email("son@naver.com").age(32).build());
        var members = memberRepository.findAll();
       // log.info("{}",members);

        List<Member> findByNameAndEmail = memberRepository.findByNameAndEmail("손흥민","son@naver.com");
        List<Member> findByAgeGreaterThan = memberRepository.findByAgeGreaterThan(20);
        log.info("{}",findByAgeGreaterThan);


    }
}
