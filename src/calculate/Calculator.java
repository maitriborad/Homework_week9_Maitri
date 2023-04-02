package calculate;

public class Calculator {
    public void addition(int a, int b){ System.out.println(a+b); }
    public void subtraction(int a, int b){
        System.out.println(a-b);
    }
    public void multiplication(int a, int b){
        System.out.println(a*b);
    }
    public void division(int a, int b){
        System.out.println(a/b);
    }
    public void calculateResult(int a, int b, char symbol){
        Calculator obj = new Calculator();
        if(symbol == '+'){
            obj.addition(a,b);
        } else if (symbol=='-') {
            obj.subtraction(a,b);
        }else if (symbol=='*') {
            obj.multiplication(a,b);
        }else if (symbol=='/') {
            obj.division(a,b);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
