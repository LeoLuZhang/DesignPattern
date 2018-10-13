package State;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
