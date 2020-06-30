package app;

public interface Command {
    public void execute();
    public void undo();
}