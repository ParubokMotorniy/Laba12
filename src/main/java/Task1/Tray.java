package Task1;

import lombok.Getter;
import lombok.Setter;

public abstract class Tray
{
    @Getter
    @Setter
    protected int banknotesNumber;

    @Getter
    protected int denomination;

    @Getter
    @Setter
    protected Tray nextTray;

    public Tray(int banknotesNumber)
    {
        this.banknotesNumber = banknotesNumber;
    }

    public void GiveCash(int amount, StringBuilder result)
    {
        if(nextTray != null)
        {
            result.append("Handing out ").append(amount / denomination).append(" banknotes of ").append(denomination).append(" denomination.\n");
            nextTray.GiveCash(amount % denomination, result);
        } else if (amount <= denomination * banknotesNumber)
        {
            result.append("Handing out ").append(amount / denomination).append(" banknotes of ").append(denomination).append(" denomination.\n");
            System.out.println(result.toString());
        }else
        {
            throw new IllegalArgumentException();
        }
    }
}
