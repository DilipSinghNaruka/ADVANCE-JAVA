// It's Through Error 

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car start with the key");
    }

}

// class Scooter extends Vehicle{
// void start(){
// System.out.println("Scooter start with the kick");
// }
// }
class AD_13_AbstractClassAndMethod extends Vehicle {
    void start() {
        System.out.println("Scooter is start with the key");
    }

    public static void main(String[] args) {
        AD_13_AbstractClassAndMethod scooter = new AD_13_AbstractClassAndMethod();
        scooter.start();

        Car car = new Car();
        car.start();

        // Scooter scooter = new Scooter();
        // scooter.start();
    }
}

//// Abstraction is hiding internal implementation & just highlighting the setup
//// services that we are offering
// 1. A method without body (no implementationis known as abstract method.)
// 2. A method must always be declared in an abstract class, or we can say that
//// if a class has an abstract method, it should be declared abstract as well
// 3. If a regular class extends an abstract class, then the class must have to
//// implement all the abstract methods of abstract parent class or it has to be
//// declared abstract as well
// 4. Abstract methods in an abstract class are meant to be overriden in deriver
//// concrete classes otherwise compile-time error will be thrown.
// 5. Abstract classes connot be instantiated, means we can't create an object
//// of Abstract class
