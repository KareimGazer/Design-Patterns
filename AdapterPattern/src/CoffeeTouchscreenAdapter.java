public class CoffeeTouchscreenAdapter implements  CoffeeMachineInterface
{
    OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine)
    {
        this.oldVendingMachine = oldMachine;
    }
    @Override
    public void chooseFirstSelection()
    {
        oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection()
    {
        oldVendingMachine.selectB();
    }
}
