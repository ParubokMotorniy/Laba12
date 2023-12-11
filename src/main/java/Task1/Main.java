package Task1;

public class Main
{
    public static void main(String[] args)
    {
        Tray hryvnia = new Tray1(50);
        Tray hryvnia2 = new Tray2(50);
        Tray hryvnia50 = new Tray50(10);
        Tray hryvnia100 = new Tray100(5);
        Tray hryvnia200 = new Tray200(5);
        Tray hryvnia500 = new Tray500(5);

        hryvnia500.setNextTray(hryvnia200);
        hryvnia200.setNextTray(hryvnia100);
        hryvnia100.setNextTray(hryvnia50);
        hryvnia50.setNextTray(hryvnia2);
        hryvnia2.setNextTray(hryvnia);

        hryvnia500.GiveCash(1488,  new StringBuilder());
    }

}
