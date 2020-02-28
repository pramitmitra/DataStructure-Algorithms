package Easy;

public class BalancingBracket {

    static int getString(String s)
    {
        String str=s;
        char []c_str=new char[str.length()];
        c_str=str.toCharArray();
        char []stack_c=new char[str.length()];
        int l=str.length();

        int top=0;



//PUSH LOGIC
        for (int i=0;i<l;i++) {
            if(c_str[i] =='(')
            {
               // System.out.printf("\n [Push]Value of topis %c @ %d ", c_str[i],top);
                //For first item succeedes as top=-1
//                top=top+1;
                stack_c[top++]=c_str[i];

            }
            if (c_str[i] ==')' )
            {
                //System.out.printf("\n [Pop]Value of top %c @ %d", c_str[i],top);
                //System.out.printf("\n Pop element %c from stack, locatiom %d", c_str[i], top);
                top--;
            }
        }
        return top;
    }

    public static void main(String args[])
    {
        String s="(())))";
        int ret=getString(s);
        System.out.printf("\n %d",ret);
    }
}
