package excercise1.ui.uitils;

public class GetIntOption {
    private int minValue;
    private int maxValue;
    public int getOption (){
        int choice = -1;
        try{
            choice = GetInteger.getInteger();
            if (choice < this.minValue || choice > this.maxValue){
                throw new IllegalArgumentException();
            }

        }catch (IllegalArgumentException e){
            RenderText.render(" ⚠️ Please inseret a number between "
                    + minValue + " and "+ maxValue +".");
        }
        return choice;
    }

    public GetIntOption(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
}
