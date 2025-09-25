public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();

        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

      
        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(5, 3);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        Calculator calc_mul = new Calculator();
        calc_mul.setNumbers(5, 3);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        Calculator calc_div = new Calculator();
        calc_div.setNumbers(10, 2);
        calc_div.divide();
        calc_div.displayResult("/");
    }
} 
 
  
public class Calculator {
    int num1;
    int num2;
    int result;


    public void setNumbers(int num1, int num2){
        //멤버변수와 입력 arg 이름잉 같으면 this 사용 this 사용한건 멤버변수 결과가 arg 됨
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        result = num1 + num2;
        return result;
    }


    public int subtract(){
        result = num1 - num2;
        return result;
    }

    public int multiply(){
//        result = num1 * num2;
//        return result;
        result = 0; //2.대안
        for (int i = 0; i < num2; i++)
            result += num1; // 1.이 방식은 result 초기화가 안되있어서 문제 발생
        return result; //3.대안 작성하면 이것도 작성해야함
    }

    public int divide(){
        result = 0;
        int temp = num1;
        for (int i = 0; temp >= num2; i++) {
            temp -= num2;
            result = i + 1;
        }
        return result;
    }

    public void displayResult(String operator){
        System.out.println(num1 + " " + operator + " " + num2 + "=" + result);
    }


}
