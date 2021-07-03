package RecursionConcept;

public class CalculatePower {
    static int stepCount=0;
    public static void main(String[] args) {
        System.out.println(power(3,10000));
        System.out.println("steps: "+stepCount);

    }
    static int power(int n,int m){
        stepCount++;
        if(m==0)
            return 1;
       // return n*power(n,m-1);
        if(m%2==0){
            return power(n*n, m/2);
        }
        return n*power(n,m-1);

    }
}
