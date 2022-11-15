public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder(drink.getText());
        s.reverse();
        drink.setText(s.toString());
    }
    @Override
    public void undo(StringDrink drink){
        execute(drink);
    }
}
