class TextInput {
    public static int value=0;
    
    public void add(char c){
        value=value*10 + ((int)c);
    }
    
    public String getValue(){
        return Integer.toString(value);
    }
}

class NumericInput extends TextInput{
    @Override
    public void add(char c){
        if(c<'0' || c>'9')
            return;
        value=value*10+(c-'0');
    }
}

public class AA {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        input.add('7');
        System.out.println(input.getValue());
    }
}