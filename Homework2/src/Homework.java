import java.io.Console;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
       //task1-Create an array and fill it with 2 number.
        int[] arr1=new int[]{2,4};

        //task2-Create an array and fill it with numbers from 1:1000.
        int size=1000;
        int[] arr2=new int[size];
        for (int i=0;i<size;i++){
            arr2[i]=i+1;
        }


        //task3-Create an array and fill it with odd numbers from -20:20
        int size3=20,curr=0;
        int[] arr3=new int[size3];
        for (int i=-20;i<=20;i++)
        {
            if(i%2!=0) {
                arr3[curr++] = i;
            }
        }

        //task4-Create an array and fill it. Print all elements which can be divided by 5
        int[] arr4={1,2,4,443,32,45,68,77,25,35,60};
        for (int i=0;i<arr4.length;i++)
        {
            if(arr4[i]%5==0)
                System.out.print(arr4[i]+" ");
        }
        System.out.println();


        //task5-Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        float[] arr5={1.0f,.45f,4.456f,443.5f,32f,45f,68.54f,77.0f,25.25f,35.3f,60.0f};
        for (int i=0;i<arr5.length;i++)
        {
            if(arr5[i]>=24.12 && arr5[i]<=467.23){
                System.out.print(arr5[i]+" ");
            }
        }
        System.out.println();

        //task6-Create an array and fill it. Print count of elements which can be divided by 2.
        int[] arr6={1,2,4,443,32,45,68,77,25,35,60};
        int sumOf=0;
        for (int i=0;i<arr4.length;i++)
        {
            if(arr6[i]%2==0)
                sumOf++;

        }
        System.out.println(sumOf);



        //task7-Create an array and fill it. Print count of elements which can be divided by 2.
        int num= 8;
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }

        //Find single element
        int[] arrOfNum={1,2,3,2,7,1,3,8,8};//7 is single
        int singleNum=arrOfNum[0];
        for (int i = 1; i <arrOfNum.length; i++) {
            singleNum=singleNum^arrOfNum[i];
        }
        System.out.printf("Single element is %d",singleNum);
        System.out.println();



        //boblesort
        int t=0;
        int[] sortArray={10,9,8,7,6,5,4,3,2,1,0,-5};
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < sortArray.length-1; j++) {
                if(sortArray[j]>=sortArray[j+1])
                {
                    t=sortArray[j+1];
                    sortArray[j+1]=sortArray[j];
                    sortArray[j]=t;
                }
            }
        }

        for (int i = 0; i < sortArray.length; i++) {

            System.out.print(sortArray[i]+" ");
        }







    }
}
