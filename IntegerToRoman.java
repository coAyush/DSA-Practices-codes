package Strings;
public class IntegerToRoman {
    public static void main(String[] args) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM","D", "CD","C", "XC","L", "XL","X","IX","V","IV","I"};
        int num=6;
        int i=0;
        StringBuilder b=new StringBuilder();
        while(num>0){
            while (num>=values[i]){
                num-=values[i];
                b.append(symbols[i]);
            }
            i++;
        }
        System.out.println(b.toString());
    }
}
