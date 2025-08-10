package day3;

public class MergeAndSortInArray {
//13. merge two arrays and sort them 

    public static void main(String[] args) {
    	int[] a={3,1,4}, b={5,2};
        int n=a.length, m=b.length;
        int[] c = new int[n+m];
        for(int i=0;i<n;i++) c[i]=a[i];
        for(int i=0;i<m;i++) c[n+i]=b[i];
        // Manual sort
        for(int i=0;i<c.length-1;i++)
            for(int j=0;j<c.length-1-i;j++)
                if(c[j]>c[j+1]) {
                    int tmp=c[j]; c[j]=c[j+1]; c[j+1]=tmp;
                }
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
}
