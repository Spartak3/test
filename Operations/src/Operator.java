import java.awt.font.FontRenderContext;

public class Operator {


    static int isPowerOfFour(int n)
    {
        int count = 0;

        /*Check if there is
        only one bit set in n*/
        int x = n & (n - 1);

        if ( n > 0 && x == 0)
        {
            /* count 0 bits
            before set bit */
            while(n > 1)
            {
                n >>= 1;
                count += 1;
            }

            /*If count is even
            then return true
            else false*/
            return (count % 2 == 0) ? 1 : 0;
        }

            /* If there are more than
            1 bit set then n is not a
            power of 4*/
        return 0;
    }

    public static void main(String[] args) {
        /*
        int a=5,b=10;
        int c=a+b,g=a*b;
        System.out.println("c="+c+", g="+g);
        int k=b%2,d=b/2;
        System.out.println("k="+k+", d="+d);
        int num=14;
        int num1=num << 1,num2=num >> 2,num3=num & a,num4=num | b;
        System.out.println("num1="+num1+", num2="+num2+", num3="+num3+", num4="+num4);
        int n1=3,n2=5,n3=8;
        n1++;
        --n2;
        n3+=3;
        System.out.println("n1="+n1+", n2="+(n2++) +", n3="+(++n3));
        if(n1>n2){
            System.out.println("n1 is greater than n2"+", n1="+n1+", n2="+n2);
        }
        else{
            System.out.println("n2 is greater then n1"+", n1="+n1+", n2="+n2);
        }
        int n4=n3>n1?n3:n1;
        System.out.println("n4= "+n4);
        int[] arr=new int[3];
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        System.out.println("arr[0]="+arr[0]+", arr[1]="+arr[1]+", arr[2]="+arr[2]);
        arr[0]=arr[1]+arr[2];
        System.out.println("arr[0] is now "+arr[0]);
         */

        /*
        int[] arr = {1, 2, 5, 4, 6, 8, 9, 2, 1, 4, 5, 9,6};
        int v = 0;
        for (int i=0;i<arr.length;i++){
            v = v ^ arr[i];
            //System.out.println("i= "+i+", "+v);
        }
        //System.out.println(v);

        int num=122111474;
        int k=0,t=0,n=num;
        while(n!=0)
        {
            k=n%10;
            t=t^k;
            n/=10;
        }*/
        /*
        int num1=30,num2=10;
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println(num1+" "+num2);
        System.out.println(isPowerOfFour(64));
         */


        int n=10;
        int[] A=new int[]{1,2,3,4,5,34,7,8,9,10};
        int min=A[0];
        for (int i=0;i<n;i++)
        {
            if(min>A[i])
                min=A[i];
        }
        System.out.println(min);
        if(n>10)
            System.out.println("sss");
        else if(n<10)
        {
            System.out.println("ddd");
        }
        System.out.println("----------------");

        int k=5;
        for (int i=0;i<=k;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
