import java.util.ArrayList;
public class BasicJava {
    public static void OneTo256(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
    
    public static void Odd256(){
        for(int i = 1; i < 256; i = i + 2){
            System.out.println(i);
        }
    }
    public static void GetSum(){
        int sum = 0;
        for(int i = 0; i < 255; i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
    public static void ArrayLoop(int [] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
    public static int ArrayMax(int [] num){
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
            System.out.println(max);
        }
        return max;
    }
    public static double AverageArray(int [] avrArray){
        double avr = 0;
        int sums = 0;
        for(int i = 0; i < avrArray.length; i++){
            sums = sums + avrArray[i];
            avr = sums / avrArray.length;
            System.out.println(avr);
        }
        return avr;
    }
    public static ArrayList<Integer> OddArray(){
        ArrayList<Integer> mainArray = new ArrayList<Integer>();
        for(int i = 0; i < 256; i++){
            if(i % 2 != 0){
                mainArray.add(i);
            }
            System.out.println(mainArray);
        }
        return mainArray;
    }
    public static int GreaterThanY(int [] greaterY){
        int count = 0;
        int y = 3;
        for(int i = 0; i < greaterY.length; i++){
            if(greaterY[i]> y){
                count++;
            }
            System.out.println(count);
        }
        return count;
    }
    public static void ArraySquare(int [] mainArray){
        for(int i = 0; i < mainArray.length; i++){
            mainArray[i] = mainArray[i]*mainArray[i];
            System.out.println(mainArray[i]);
        }
    }
    public static void ArrayNegative(int [] negativeArray){
        for(int i = 0; i < negativeArray.length; i++){
            if(negativeArray[i]< 0){
                negativeArray[i] = 0;
            }
            System.out.println(negativeArray[i]);
        }
    }
    public static void MaxMinAvrArray(int [] array){
        int maxd = array[0];
        int min = array[0];
        double avrs = 0;
        int sumd = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxd){
                maxd = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
            sumd = sumd + array[i];
            avrs = sumd / array.length;
            System.out.println(avrs);
            System.out.println(min);
            System.out.println(maxd);
        }
    }
    public static void ShiftingValues(int [] thisArray){
        for(int i = 1; i < thisArray.length; i++){
            thisArray[i - 1] = thisArray[i];
        }
        thisArray[thisArray.length -1]= 0;
    }
    public static void main(String[] args){
        int [] mainArray = {22,3,5,-7,9,-13};
        ArrayLoop(mainArray);
        ArrayMax(mainArray);
        AverageArray(mainArray);
        GreaterThanY(mainArray);
        OneTo256();
        Odd256();
        GetSum();
        ArrayNegative(mainArray);
    }
}
