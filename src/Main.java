public class Main {

    public static void main(String[] args) {


    }
        class Animal { //Superclass
        }

        class Mammal extends Animal { //SubClass til Superclass
        }

        class Reptile extends Animal { //Også en SubClass til Superclass
        }

        public class Dog extends Mammal { //SubClass til Superclass & Animal

            public static void main(String args[]) {
                Animal a = new Animal();
                Mammal m = new Mammal();
                Dog d = new Dog();

                System.out.println(m instanceof Animal);
                System.out.println(d instanceof Mammal);
                System.out.println(d instanceof Animal);
            }
        }
    }