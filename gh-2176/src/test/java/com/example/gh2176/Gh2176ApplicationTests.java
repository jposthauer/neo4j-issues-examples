package com.example.gh2176;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Gh2176ApplicationTests {

    private final OuterDomainRepository repository;

    @Autowired
    Gh2176ApplicationTests(OuterDomainRepository repository) {
        this.repository = repository;
    }

    @Test
    void innerDomainLoading() {
//        repository.save(new OuterDomain.InnerDomainOne());

        OuterDomain consumed = repository.findByIdCustom("InnerDomainOne3fff576d-c494-42da-9067-a77862c98647");
        assertThat(consumed).isNotNull();
        assertThat(consumed).isOfAnyClassIn(OuterDomain.InnerDomainOne.class);
    }

}
