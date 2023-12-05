import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("อาชีพที่เลือก");
        Tank T1 = new Tank("Boots Man");
        shield S1 = new shield();
        T1.PrintStatus();
        sword S2 = new sword();

        T1.equipAccessories(S1);
        T1.equipAccessories(S2);
        System.out.println("------------------------------------------------------");
        System.out.println("หลังใส่อาวุธ");
        T1.PrintStatus();
        System.out.println("------------------------------------------------------");
        character enemy1 = new Tank("Cup Man1");
        T1.attack(enemy1);
        System.out.println("------------------------------------------------------");
        System.out.println("หลังโดนโจมตี");
        enemy1.PrintStatus();



        System.out.println("------------------------------------------------------");
        System.out.println("อาชีพที่เลือก");
        Assassin A1 = new Assassin("Buck Man");
        sword S3 = new sword();
        A1.PrintStatus();
        shield S4 = new shield();

        A1.equipAccessories(S3);
        A1.equipAccessories(S4);
        System.out.println("------------------------------------------------------");
        System.out.println("หลังใส่อาวุธ");
        A1.PrintStatus();
        character enemy2 = new Assassin("Cup Man2");
        A1.attack(enemy2);
        System.out.println("------------------------------------------------------");
        System.out.println("หลังโดนโจมตี");
        enemy2.PrintStatus();
        System.out.println("------------------------------------------------------");;

    }
}