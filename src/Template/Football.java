package Template;

/**
 * Template
 * Leo
 * 2018/10/13
 */
public class Football extends Game{

    @Override
    void endPlay(){
        System.out.println("Football Game Finished!");
    }


    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

}
