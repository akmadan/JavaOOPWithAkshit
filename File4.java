public  class File4 {


    public static int a = 6;
    private static int b = 10;
    protected int c = 12;

    public void print(){
        System.out.println(b);
    }

    public static int getValueOfb(){
        return b;
    }

    


    
}

 class Child extends File4{
    
    int d = c;
    int e = a;


}

