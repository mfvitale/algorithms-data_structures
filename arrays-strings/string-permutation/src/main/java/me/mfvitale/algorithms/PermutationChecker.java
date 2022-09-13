package me.mfvitale.algorithms;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermutationChecker {

    public PermutationChecker() {

    }

    public Boolean isPermutations(String s1, String s2) {

        if(s1 == null | s2 == null) {
            return false;
        }

        if(s1.isEmpty() | s2.isEmpty()) {
            return false;
        }

        if(s1.length() != s2.length()) {
            return false;
        }

        Set<Integer> uniquesValue = Stream.of(s1,s2)
        .map(String::chars)
        .flatMap(IntStream::boxed)
        .collect(Collectors.toSet());

        return uniquesValue.size() == s1.length();

    }
}
