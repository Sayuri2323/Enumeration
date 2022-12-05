import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        enum EnumMonths{

            January, February, March, April, May, June, July, August, September, October, November, December
        }
        for(EnumMonths month:EnumMonths.values()){
            System.out.println(month);
            if(month.name().endsWith("y")){
                System.out.println("questi mesi hanno y "+month);
            }else System.out.println("questi mesi non hanno y");
        }
        

    }
}
