package me.mfvitale.algorithms;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
class UniqueCharChekerUnitTest {

    private UniqueCharChecker uniqueCharChecker;

    @BeforeEach
    public void setup() {
        uniqueCharChecker = new UniqueCharChecker();
    }

    @Test
    @DisplayName("Null string return null")
    void nullString() {

        assertThat(uniqueCharChecker.hasAllUniqueChars(null)).isEqualTo(null);
    }

    @Test
    @DisplayName("Empty string return True")
    void emptyString() {

        assertThat(uniqueCharChecker.hasAllUniqueChars("")).isTrue();
    }

    @Test
    @DisplayName("foo has double o char then return false")
    void stringWithDuplicate() {

        assertThat(uniqueCharChecker.hasAllUniqueChars("foo")).isFalse();
    }

    @Test
    @DisplayName("bar has unique chars then return true")
    void stringWithoutDuplicate() {

        assertThat(uniqueCharChecker.hasAllUniqueChars("bar")).isTrue();
    }
}
