package com.example.instancio;


import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    public void testPerson() {
        Person person = Instancio.create(Person.class);
        assertThat(person.getFirstName()).isNotNull();
        assertThat(person.getLastName()).isNotNull();
        assertThat(person.getCity()).isNotNull();
        assertThat(person.getCountry()).isNotNull();
        assertThat(person.getAddress()).isNotNull();
        assertThat(person.getEmail()).isNotNull();
    }

}