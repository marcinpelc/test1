package com.example.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AlgorithmServiceTest {

    @InjectMocks
    AlgorithmService algorithmService;

    @Test
    void findParts() {

        assertThat(algorithmService.findParts("a")).containsExactlyInAnyOrder("a");
        assertThat(algorithmService.findParts("ab")).containsExactlyInAnyOrder("a", "b");
        assertThat(algorithmService.findParts("aba")).containsExactlyInAnyOrder("aba");
        assertThat(algorithmService.findParts("abcacded")).containsExactlyInAnyOrder("abcac", "ded");
    }
}