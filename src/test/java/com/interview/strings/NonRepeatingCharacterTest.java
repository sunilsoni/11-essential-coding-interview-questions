package com.interview.strings;

import com.interview.arrays.IsOneArrayRotatingOfAnother;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

@Slf4j
public class NonRepeatingCharacterTest {

    NonRepeatingCharacter nonRepeatingCharacter;

    @Before
    public void setUp(){
        nonRepeatingCharacter = new NonRepeatingCharacter();
    }

    @Test
    public void nonRepeating() {

        Character c = nonRepeatingCharacter.nonRepeating("abcab");
        assertThat(c, is(notNullValue()));
        assertThat(c, is(equalTo('c')));

        c = nonRepeatingCharacter.nonRepeating("abab");
        assertThat(c, is(nullValue()));
    }

    @Test
    public void nonRepeating2() {

        Character c =nonRepeatingCharacter.nonRepeating2("aabbbc");
        assertThat(c, is(notNullValue()));
        assertThat(c, is(equalTo('c')));

        c = nonRepeatingCharacter.nonRepeating2("aabbdbc");
        assertThat(c, is(notNullValue()));
        assertThat(c, is(equalTo('d')));
    }

    @Test
    public void nonRepeating3() {

        Character c =nonRepeatingCharacter.nonRepeating3("aabbbc");
        assertThat(c, is(notNullValue()));
        assertThat(c, is(equalTo('c')));

        c = nonRepeatingCharacter.nonRepeating3("aabbdbc");
        assertThat(c, is(notNullValue()));
        assertThat(c, is(equalTo('d')));

    }
}
