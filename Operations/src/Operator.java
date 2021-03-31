public class Operator {
    public static void main(String[] args) {
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






    }
}
