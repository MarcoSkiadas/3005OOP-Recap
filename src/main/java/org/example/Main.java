package org.example;

public class Main {
    public static void main(String[] args) {

        Book books1 = new Book("Test","mcTest","1234");
        Book books2 = new Book("Test2","mcTest2","1233");
        Book books3 = new Book("Test3","mcTest3","1232");
        Book books4 = new Book("Test4","mcTest4","1233");

        System.out.println(books1+"\n"+books2+"\n"+books3+"\n");

    Library library = new Library(new Book[]{books1,books2, books3});

        System.out.println(library);

    library.add(books4);
    System.out.println(library);
    library.remove(books3);
    System.out.println(library);


        /*
        Car speedcar = new Car("VW","Golf",2005,"Blue");
        Car slowcar = new Car("BMW","3",2002,"Red");

        speedcar.start();
        speedcar.accelerates();
        speedcar.accelerates();
        speedcar.accelerates();


        System.out.println(speedcar.getSpeed());

        Person thomas = new Person("Thomas",44,"Male");

        thomas.introduction();
*/

    }
}