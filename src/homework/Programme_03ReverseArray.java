package homework;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_03ReverseArray {
    public static void main(String[] args) {
        int a [] = new int[5];
        a[0]=22;
        a[1]=35;
        a[2]=12;
        a[3]=2;
        a[4]=105;
        Programme_03ReverseArray obj = new Programme_03ReverseArray();
        obj.reverse(a);
    }
    public void reverse(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
