package org.example;

import java.util.Optional;

public class DemoNPE {
    public static void main(String[] args) {
        DemoNPE demoNPE = new DemoNPE();
        Optional<String> result = demoNPE.processWithNPE();
        if (result.isPresent()) {
            result.get();
        }

    }

    Optional<String> processWithNPE() {
        return Optional.of("1234");
    }
}
