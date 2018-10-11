package decorator;

public class RedGemDecotator implements  IEquipDecorator {

    private IEquip equip;

    public RedGemDecotator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 10 + equip.caculateAttack();
    }

    @Override
    public String description() {

        return equip.description() + "+ 红宝石";
    }


}
