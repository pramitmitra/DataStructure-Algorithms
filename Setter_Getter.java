public class Setter_Getter {
    int x, y;

    void setNum(int x1, int y1)
    {
        x=x1;
        y=y1;
    }

    void getNum()
    {
        System.out.printf("Value of x = %d AND y = %d \n", this.x, this.y);
    }

    void add_int(int x1, int y1)
    {
        System.out.printf("Return of Add_INT is %d", x1+y1);
    }

    public static void main(String args[])
    {
        Setter_Getter z1=new Setter_Getter();
        z1.setNum(10, 20);
        z1.getNum();

        Setter_Getter z2=new Setter_Getter();
        z2.setNum(30,40);
        z2.getNum();

        z1.add_int(100, 200);

    }
}
