public class AverageMethod {
    
    public static double sum(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    
    public static double average (double num3, double num4, double num5){
        
        return sum(num3, num4, num5)/3;

    }
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        System.out.println(average(2,5,8));
    }
}
