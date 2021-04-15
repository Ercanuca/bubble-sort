
package kabarcık;


public class Kabarcık {
  public void bubblesort(int [] A) // bir diziyi parametre alan fonksiyon
  {

     int tmp;

    for(int i=0; i<A.length; i++)
    {
  //    for(int j=1; j<A.length-i+1; j++) şeklinde de döngü yazılabilir
        for(int j=A.length-1 ; j>i;j--) //i'ye kadar olan kısmı sabitlendiği için tekrar geçişlerde kontrolü gerekmemektedir.
      {
        if(A[j-1]>A[j])
        {
          tmp=A[j-1];
          A[j-1]=A[j];
          A[j]=tmp;
        }
       }
       System.out.println(""+A[i]);  
    }

    
  }
    public static void main(String[] args) {
        // TODO code application logic here
  Kabarcık x=new Kabarcık();
        int a[]={2,4,1,5,0,8,11,34,97};
        System.out.println(" ");
        x.bubblesort(a);
    }
    
}
