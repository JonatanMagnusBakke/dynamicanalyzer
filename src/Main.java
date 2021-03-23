import automaton.Automaton;
import automaton.State;

public class Main {
    public static void main(String[] args)
    {
        Automaton automaton = new Automaton();
        State state = automaton.getInitialState();
        System.out.println("state"+state.getIndex());

        for (int i = 0; i < 3; i++) {
            if (state == null) System.out.println(" does not match");
            state = automaton.nextState(state);
            System.out.println("State"+state.getIndex());
        }
        if (state == null) System.out.println(" does not match");
        else if (state.isFinal()) System.out.println("You had a match");
        else System.out.println("Partially match");
    }
}
