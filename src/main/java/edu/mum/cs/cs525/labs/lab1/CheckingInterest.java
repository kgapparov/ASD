package edu.mum.cs.cs525.labs.lab1;

import java.util.ArrayList;
import java.util.List;

public class CheckingInterest extends MainInerest{
    public CheckingInterest() {
        super();
        setInterestRangeValue(new ArrayList<>(List.of(1000, Integer.MAX_VALUE)), new ArrayList<>(List.of(1.5, 2.5)));
    }
}
