package decorator;

public class YellowGemDecotator implements  IEquipDecorator {

    private IEquip equip;

    public YellowGemDecotator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 10 + equip.caculateAttack();
    }

    @Override
    public String description() {

        return equip.description() + "+ 黄宝石";
    }

}
