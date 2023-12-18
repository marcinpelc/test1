package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlgorithmService {

    public List<String> findParts(String data) {
        Map<Integer, Integer> letterIndexes =  IntStream.rangeClosed(96 + 1, 96 + 26).boxed()
                .collect(Collectors.toMap(Function.identity(), i -> 0));

        for (int i = 0; i < data.length(); i++) {
            Integer character = (int) data.charAt(i);
            Integer maxIndex = letterIndexes.get(character);
            if (i > maxIndex) {
                letterIndexes.put(character, i);
            }
        }

        List<String> result = new ArrayList<>();
        List<Integer> lettersToCheck = new ArrayList<>();
        Integer lastCutIndex = 0;
        for (int currentIndex = 0; currentIndex < data.length(); currentIndex++) {
            Integer currentCharacter = (int) data.charAt(currentIndex);
            lettersToCheck.add(currentCharacter);
            boolean canCut = true;
            for (Integer letter: lettersToCheck) {
                if(letterIndexes.get(letter) > currentIndex) {
                    canCut = false;
                }
            }

            if  (canCut) {
                result.add(data.substring(lastCutIndex, currentIndex + 1));
                lastCutIndex = currentIndex + 1;
            }
        }
        return result;
    }

}
