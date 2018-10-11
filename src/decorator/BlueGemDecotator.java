package decorator;

public class BlueGemDecotator implements IEquipDecorator {

    private  IEquip equip;

    public BlueGemDecotator (IEquip equip){
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 5 + equip.caculateAttack();
    }

    @Override
    public  String description(){

        return equip.description() + "+ 蓝宝石";

    }
}
