class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Program {
   public static void main(String[] args) {
   Animal pet[] = new Animal[4];
   
   //Look, we assign it to a Dog, not a pet. (So it's Polymorphism)
   pet[0] = new Dog();
   pet[1] = new Cat();
   pet[2] = new Dog();
   pet[3] = new Cat();
   for (int i=0; i<4; i++) {
         pet[i].makeSound();
    }
   }
}
