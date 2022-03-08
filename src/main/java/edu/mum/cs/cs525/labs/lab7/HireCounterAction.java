package edu.mum.cs.cs525.labs.lab7;

import java.util.function.Consumer;

public class HireCounterAction implements Consumer<Hire> {
    private int count = 0;
    @Override
    public void accept(Hire hire) {
        ++count;
    }
    public int getCount(){
        return count;
    }
}
