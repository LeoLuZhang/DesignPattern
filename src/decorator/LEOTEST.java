package decorator;

public class LEOTEST {

    public static void main(String[] args) {

        //个镶嵌2颗红宝石,1颗蓝宝石的靴子
        System.out.println("一个镶嵌2颗红宝石,1颗蓝宝石的靴子");

        IEquip equip = new RedGemDecotator(new RedGemDecotator(new BlueGemDecotator(new ShoeEquip())));
        System.out.println("攻击力: " + equip.caculateAttack());
        System.out.println("描述: " + equip.description());
        System.out.println("------------------------------");


        //一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指
        System.out.println("一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指");

        IEquip euip = new RedGemDecotator(new BlueGemDecotator(new YellowGemDecotator(new ArmEquip())));


        System.out.println("攻击力: " + equip.caculateAttack());
        System.out.println("描述: " + equip.description());
        System.out.println("------------------------------");

    }
}
