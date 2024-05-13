class Clac
{
    public int add(int a , int b )
    {
        return a+b;
    }
    public int sub(int a, int b )
    {
        return a-b;

    }

}
class Adcalc extends Clac
{   
    public int mul(int a ,int b )
        {
            return a*b;
        }
}

class Vadclc extends Adcalc
{
    public int div(int a , int b )
    {
        return a/b;
    }
}
class inheritance 
{
    public static void main(String[] args) 
    {
        Vadclc vd = new Vadclc();
        int r3 = vd.mul(7, 8);
        int r1 = vd.add(12, 23);
        int r2 = vd.sub(34, 23);
        int r4 = vd.div(10, 5);
        System.out.println("add" + r1 );
        System.out.println("sub"+r2);
        System.out.println("mul "+ r3);
        System.out.println("div" + r4);
        
    }

    
}