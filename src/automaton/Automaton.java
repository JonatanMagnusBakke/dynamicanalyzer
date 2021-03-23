package automaton;

import java.util.ArrayList;
import java.util.List;

public class Automaton {

    private ArrayList<State> states = new ArrayList<>();
    private State initialState;

    public Automaton() {
        states.add(initialState = new State(0, false));
        states.add(new State(1, false));
        states.add(new State(2, false));
        states.add(new State(3, true));
    }

    List<State> getStates()
    {
        return states;
    };
    public State getInitialState()
    {
        return initialState;
    };
    public State nextState(State state)
    {
        if(!state.isFinal())
        {
            return states.get(state.getIndex() + 1);
        }
        return null;
    };
}
