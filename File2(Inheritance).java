public class File2 {

    public static class Electronics{ 
        double price;
        
        void printPrice(){ 
            System.out.println(price);
        }
    }

    //Single

    public static class TV extends Electronics{
        
        int height;
        int width;
        void printArea(){
            System.out.println(height*width);
        }
    }

    //Hie.
    public static class Mobile extends Electronics{
        
        int height;
        int width;
        void printArea(){
            System.out.println(height*width);
        }
    }

    //Multi L.
    public static class LCD extends TV{
        
        String hdLevel;
        void printHDLevel(){
            System.out.println(hdLevel);
        }

    }

    public static void main(String args[]){
        TV tv = new TV();
        tv.price = 9000;

        Mobile mobile = new Mobile();
        mobile.price = 8000;

        LCD lcd = new LCD();
        lcd.price = 6000;

    }


    
}
