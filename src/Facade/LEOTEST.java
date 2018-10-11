package Facade;

public class LEOTEST {

    private static HomeTheaterFacade homeTheaterFacade;

    public static void main(String[] args) {

        //HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        Computer computer = new Computer();
        Light light = new Light();
        Player player = new Player();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        //homeTheaterFacade = new HomeTheaterFacade(computer, light, player, popcornPopper, projector);

    }

}
