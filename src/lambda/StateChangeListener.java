package lambda;

import lambda.extra.State;


//functional interface.
public interface StateChangeListener {

    public void onStateChange(State oldState, State newState);

}
