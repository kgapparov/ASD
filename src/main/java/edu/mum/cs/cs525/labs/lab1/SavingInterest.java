package edu.mum.cs.cs525.labs.lab1;

import java.util.ArrayList;
import java.util.List;

public class SavingInterest extends MainInerest {
    public SavingInterest() {
        super();
        setInterestRangeValue(new ArrayList<>(List.of(1000, 5000, Integer.MAX_VALUE)), new ArrayList<Double>(List.of(1.0, 2.0, 4.0)));
    }

}
