public class sword implements accessories{
    protected double atk = 10;
    protected double def = 10;

    public void PrintStatus(){
        System.out.println("add damage :"+ atk);
        System.out.println("add defend :"+ def);
    }
    public double addDEF(){
        return def;
    }
    public double addDMG(){
        return atk;
    }

}
