package de.fherfurt.jpa.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddressbookServiceTest {

    @Autowired
    private AddressbookService service;

    @Test
    public void testNonNull(){
        Assertions.assertThat(service).isNotNull();
    }
}
