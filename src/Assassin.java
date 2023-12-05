public class Assassin implements character{
    protected String playerName;
    protected int level;
    protected double hp;
    protected double max_hp;
    protected double mana;
    protected double max_mana;
    protected double dmg;
    protected double def;
    protected double base_dmg;
    protected double base_def;
    protected accessories Accessories;

    public Assassin(String playerName){
        this.playerName = playerName;
        level = 1;
        hp = 80;
        max_hp = 80;
        mana = 50;
        max_mana = 50;
        base_dmg = 35;
        base_def = 20;
    }
    public void equipAccessories(accessories Accessories){
        if(Accessories instanceof sword){
            this.Accessories = Accessories;
            updateStatus();
            System.out.println("สวมใส่อาวุธเรียบร้อย");
        }else{
            System.out.println("อาวุธนี้คุณใส่ไม่ได้");
        }
    }
    public void updateStatus(){
        this.base_def += Accessories.addDEF();
        this.base_dmg += Accessories.addDMG();
    }
    public void PrintStatus(){
        System.out.println("Role : Assassin");
        System.out.println("Player Name : " + playerName );
        System.out.println("HP : " + hp );
        System.out.println("MAX HP : " + max_hp );
        System.out.println("MANA : " + mana );
        System.out.println("MAX MANA : " + max_mana );
        System.out.println("BASE DAMAGE : " + base_dmg );
        System.out.println("BASE DEF : " + base_def );

    }
    public double getAtkDmg(){
        return base_dmg;
    }

    public void Attacked(double Dmg){
        if( Dmg > base_def){
            hp = hp - (Dmg - base_def);
        }
    }
}
