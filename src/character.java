public interface character {
    default void attack(character enemy){
        enemy.Attacked(getAtkDmg());
    }
    public void Attacked(double Dmg);
    public double getAtkDmg();
    public void PrintStatus();

}
