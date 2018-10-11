package command;

public class Test {

    public static void main(String[] args) {
        /*
        *
        * 三个家电
        *
         */

        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();

        //一个控制器，假设是我们的app主页面
        ControlPanel controlPanel = new ControlPanel();

        //为每个按扭设置功能
        controlPanel.setCommand(0,new LightOnCommand(light));
        controlPanel.setCommand(1,new LightOffCommand(light));
        controlPanel.setCommand(2,new ComputerOnCommand(computer));
        controlPanel.setCommand(3,new ComputerOffCommand(computer));
        controlPanel.setCommand(4,new DoorOpenCommand(door));
        controlPanel.setCommand(5,new DoorCloseCommand(door));

        //模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
       // controlPanel.keyPressed(8); //没有制定 ，不会 出任何问题，NoCommand的功劳

      //  QuickCommand quickCommand = new QuickCommand(new Command[]{ new LightOnCommand(light),
       //         new ComputerOnCommand(computer),new DoorOpenCommand(door)});


        QuickCommand quickCommand = new QuickCommand(new Command[] {new DoorCloseCommand(door),new LightOffCommand(light),
                new ComputerOffCommand(computer) });

        System.out.println("*******点击一键搞定**********");
        controlPanel.setCommand(8,quickCommand);
        controlPanel.keyPressed(8);

    }
}
