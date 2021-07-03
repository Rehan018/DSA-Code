package RecursionConcept;

public class FindPathInGrid {
    public static void main(String[] args) {
        System.out.println(path(4,4));
    }
    static int path(int n,int m){
        if(n==1 || m==1)
            return 1;
        return path(n,m-1)+path(m,n-1);
    }
}
