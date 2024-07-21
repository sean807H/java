
import java.io.*;
import java.util.Scanner;

abstract class Animal{
        abstract public void makeSound();
    }

class Dog extends Animal{
        public void makeSound(){
            System.out.println("멍멍");
        }
    }
class Cat extends Animal{
        public void makeSound(){
            System.out.println("야옹");
        }
    }
class Cow extends Animal{
        public void makeSound(){
            System.out.println("음메");
        }
    }

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow = new Cow();

		dog.makeSound(); // 멍멍
		cat.makeSound(); // 야옹
		cow.makeSound(); // 음메
	}

}
