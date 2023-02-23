public class DemoExample
{
    public static void main(String args[])
  {
    int a[]={1,2,4,5,7};
    int b[]={5,6,3,4,8};
    int x=9;
    for(int i=0;i<=a.length-1;i++)
     for(int j=0;j<=b.length-1;j++)
      if(a[i]+b[j]==x)
        {
            System.out.println(a[i]+ "  " +b[j]);
        }
   }
}
