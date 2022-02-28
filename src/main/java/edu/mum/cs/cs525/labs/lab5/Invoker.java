package edu.mum.cs.cs525.labs.lab5;

public class Invoker {
    private Command[] commands = new Command[3];
    private Command theLastCommand;

    public Invoker() {
        for (int i = 0; i < 3; i++) {
            commands[i] = new NoCommand();
            theLastCommand = new NoCommand();
        }
    }

    public void setCommand(int slot, Command theCommand) {
        this.commands[slot] = theCommand;
    }

    public void commandExecute(int slot) {
        commands[slot].execute();
        theLastCommand = commands[slot];
    }
    public void redo(){
        theLastCommand.redo();
    }
    public void undo() {
        theLastCommand.undo();
        theLastCommand = new NoCommand();
    }
}
