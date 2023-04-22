public class program
{
    public static void main(String[] args)
    {
        String s1="abcdefghijkl";
        String rev="";
        char[] a1 = s1.toCharArray();
        for (int i =a1.length-1; i>=0; i--)
        {
            rev= rev+a1[i];
        }
        System.out.println(rev);
        String s2= "kiran kumar yadav";
        String rev1= "";
        String[] spli1 = s2.split(" ");
        for (int i=spli1.length-1;i>=0; i--)
        {
            rev1= rev1+" "+spli1[i];
        }
        System.out.println(rev1);
    }
}