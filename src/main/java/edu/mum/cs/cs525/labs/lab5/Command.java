package edu.mum.cs.cs525.labs.lab5;

public interface Command {
    public void execute();
    public void redo();
    public void undo();
}
