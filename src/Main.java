public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog();
        bobik.setAge(4);
        bobik.setName("Bobik");
        bobik.setColor("White");
        Dog dog2 = new Dog();
        dog2.setAge(7);
        dog2.setName("Rex");
        dog2.setColor("Dark");
        Dog dog1 = new Dog();
        dog1.setAge(6);
        dog1.setName("Dog1");
        dog1.setColor("Grey");
        Fish rybka = new Fish();
        rybka.setAge(2);
        rybka.setName("Rybka");
        rybka.setColor("yellow");
        Fish fish2 = new Fish();
        fish2.setAge(2);
        fish2.setName("Fish2");
        fish2.setColor("Complex");
        Fish fish1 = new Fish();
        fish1.setAge(1);
        fish1.setName("Fish1");
        fish1.setColor("red");
        Cat murka = new Cat();
        murka.setAge(3);
        murka.setName("Murka");
        murka.setColor("Grey");
        Cat cat2 = new Cat();
        cat2.setAge(0);
        cat2.setName("Cat2");
        cat2.setColor("Grey");
        Cat cat = new Cat();
        cat.setAge(2);
        cat.setName("Cat");
        cat.setColor("white");
        Parrot parrot = new Parrot();
        parrot.setAge(1);
        parrot.setName("Parrot");
        parrot.setColor("White");
        Parrot parrot0 = new Parrot();
        parrot0.setAge(2);
        parrot0.setName("Parrot0");
        parrot0.setColor("White");
        Parrot parrot1 = new Parrot();
        parrot1.setAge(3);
        parrot1.setName("Parrot1");
        parrot1.setColor("Green");
        Dog[] dogs = new Dog[]{dog2, dog1,bobik};
        for (Dog d : dogs) {
            System.out.println("Dog: " + d.getName() + " , age: " + d.getAge() + " , color:" + d.getColor());
        }
        Cat[] cats = new Cat[]{cat2, cat,murka};
        for (Cat c : cats) {
            System.out.println("Cat: " + c.getName() + " , age: " + c.getAge() + " , color:" + c.getColor());
        }
        Fish[] fishes = new Fish[]{fish1, fish2,rybka};
        for (Fish f : fishes) {
            System.out.println("Fish: " + f.getName() + " , age: " + f.getAge() + " , color:" + f.getColor());
        }
        Parrot[] parrots = new Parrot[]{parrot0, parrot1,parrot};
        for (Parrot p : parrots) {
            System.out.println("Parrot: " + p.getName() + " , age: " + p.getAge() + " , color:" + p.getColor());
        }
    }
}

