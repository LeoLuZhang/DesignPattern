package Template;

/**
 * Template
 * Leo
 * 2018/10/13
 */
public class Cricket extends Game{

    @Override
    void endPlay(){
        System.out.println("Circket Game Finished!");
    }


    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

}
