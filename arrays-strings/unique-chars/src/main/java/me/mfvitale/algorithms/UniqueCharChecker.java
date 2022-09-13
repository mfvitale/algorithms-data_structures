package me.mfvitale.algorithms;

import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharChecker {

    public UniqueCharChecker() {

    }

    public Boolean hasAllUniqueChars(String s) {

        if(s == null) {
            return null;
        }

       Set<Integer> uniqueChars = s.chars().boxed().collect(Collectors.toSet());

       return (uniqueChars.size() == s.length());
    }
}
