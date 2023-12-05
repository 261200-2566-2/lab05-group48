public class Tank implements character{
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

    public Tank(String playerName){
        this.playerName = playerName;
        level = 1;
        hp = 120.0;
        max_hp = 120.0;
        mana = 50;
        max_mana = 50;
        base_dmg = 20;
        base_def = 20;
    }
    public void equipAccessories(accessories Accessories){
        if(Accessories instanceof shield){
            this.Accessories = Accessories;
            System.out.println("สวมใส่อาวุธเรียบร้อย");
            updateStatus();
        }else{
            System.out.println("อาวุธนี้คุณใส่ไม่ได้");
        }
    }
    public void updateStatus(){
        this.base_def += Accessories.addDEF();
        this.base_dmg += Accessories.addDMG();
    }
    public void PrintStatus(){
        System.out.println("Role : Tank");
        System.out.println("Player Name : " + playerName );
        System.out.println("HP : " + hp );
        System.out.println("MAX HP : " + max_hp );
        System.out.println("MANA : " + mana );
        System.out.println("MAX MANA : " + max_mana );
        System.out.println("BASE DAMAGE : " + base_dmg );
        System.out.println("BASE DEF : " + base_def );

    }
    public double getAtkDmg(){
        return base_dmg ;
    }

    public void Attacked(double Dmg){
        if( Dmg > base_def){
            hp = hp - (Dmg - base_def);
        }
    }
}
