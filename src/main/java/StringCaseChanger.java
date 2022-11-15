public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {

        String str = drink.getText();
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                x.append(Character.toLowerCase(ch));
            else
                x.append(Character.toUpperCase(ch));
        }
        drink.setText(x.toString());
    }
}
