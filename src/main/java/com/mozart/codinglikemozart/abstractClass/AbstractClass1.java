package com.mozart.codinglikemozart.classPackage;

import com.mozart.codinglikemozart.dependance.ConcreteDependance1;
import com.mozart.codinglikemozart.dependance.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;
}
