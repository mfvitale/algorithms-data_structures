package me.mfvitale.algorithms;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
class PermutationChekerUnitTest {

    private PermutationChecker permutationsChecker;

    @BeforeEach
    public void setup() {
        permutationsChecker = new PermutationChecker();
    }

    @Test
    @DisplayName("One or more None inputs  return false")
    void nullString() {

        assertThat(permutationsChecker.isPermutations(null, "non null")).isFalse();
    }

    @Test
    @DisplayName("One or more empty strings return false")
    void emptyString() {

        assertThat(permutationsChecker.isPermutations("", "non empry")).isTrue();
    }

    @Test
    @DisplayName("When two string are permutations but with different case return false")
    void caseSensitive() {

        assertThat(permutationsChecker.isPermutations("Nib", "bin")).isFalse();
    }

    @Test
    @DisplayName("When two string are permutable return true")
    void permutable() {

        assertThat(permutationsChecker.isPermutations("act", "cat")).isTrue();
    }
}
