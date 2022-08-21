
// COMPILE TIME

// public class File3 {

//     public static class Area{ 
//         double area(double r){ 
//             return 3.14*r*r;
//         }
//         double area(double l, double b){ 
//             return l*b;
//         }

//     }

    

//     public static void main(String args[]){

//         Area area = new Area();
//         double areaR = area.area(5.0, 6.0);
//         double areaC = area.area(3.0);
//         System.out.println(areaR);
//         System.out.println(areaC);
//     }
    

// }


// RUN TIME

public class File3{ 

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
        void printPrice(){ 
            System.out.println(6);
        } 
    }

    public static void main(String args[]){
        TV tv = new TV();
        tv.printPrice();
    }
}



