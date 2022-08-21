public class File1 {


    static class Cat{ 
        String color;
        String size;
        String breed;

         public void printCat(){ 
            System.out.println(this.color);
            System.out.println(this.size);
            System.out.println(this.breed);
        }

        Cat(){ 
            this.color = "white";
            this.size = "small";
            this.breed = "A";
        }

        // Cat(String color, String size,String breed){ 
        //     this.color = color;
        //     this.breed = breed;
        //     this.size = size;

        // }

        Cat(Cat cat){
            this.color = cat.color;
            this.breed  = cat.breed;
            this.size = cat.size;
        }


    }

    public static void main(String args[]){ 
        Cat catA = new Cat();
        catA.color = "black";
        catA.size = "medium";
        catA.breed = "A";
        catA.printCat();


        Cat catB = new Cat(catA);
        catB.printCat();
    }
    
}
