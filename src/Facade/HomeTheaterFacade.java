package Facade;

public class HomeTheaterFacade {

    private  Computer computer;
    private  Light light;
    private  PopcornPopper popcornPopper;
    private Player player;
    private  Projector projector;

    public HomeTheaterFacade(Computer computer, Light light, PopcornPopper popcornPopper, Player player, Projector projector) {
        this.computer = computer;
        this.light = light;
        this.popcornPopper = popcornPopper;
        this.player = player;
        this.projector = projector;
    }

    //观影
    public  void watchMovie() {

        computer.on();
        light.down();
        popcornPopper.on();
        popcornPopper.makePopcorn();
        projector.on();
        projector.open();
        player.on();
        player.make3DListener();

    }


    //关闭
    public  void showMovie() {
        computer.off();
        light.up();
        player.off();
        popcornPopper.off();
        projector.close();
        projector.off();

    }


}
