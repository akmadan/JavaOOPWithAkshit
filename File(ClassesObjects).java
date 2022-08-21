class File{ 


    static class Cat{ 
        String color;
        String size;
        String breed;

         public void printCat(){ 
            System.out.println(this.color);
            System.out.println(this.size);
            System.out.println(this.breed);
        }

    }
    public static void main(String args[]){
        
        Cat catA = new Cat();
        Cat catB = new Cat();

        catA.color = "red";
        catA.size = "small";
        catA.breed = "A";

        catA.printCat();


        System.out.println("****************");


        catB.color = "orange";
        catB.size = "large";
        catB.breed = "B";

        catB.printCat();

    }
}