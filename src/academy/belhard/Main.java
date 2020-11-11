package academy.belhard;

public class Main {

//    Создать типизированный класс MyItem (используя средства обобщенного программирования)
//    У класса должно быть 1 поле (тот самый item неопределенного типа)
//2 конструктора (1-ый с параметром, 2-ой без параметров, инициализирующий поле item значением null)
//    Метод isPresent должен возвращать true, если поле item не равно null и наоборот
//    Метод toString должен вызывать метод toString у поля item
//
//* Метод getClassName должен печатать название класса нашего item

    public static void main(String[] args) {
	MyItem<Object> item1 = new MyItem(1);
    MyItem<Object> item2 = new MyItem();


    System.out.println(item1.isPresent());
    System.out.println(item1.toString());
    item1.getClassName();

    System.out.println(item2.isPresent());
    System.out.println(item2.toString());
    item2.getClassName();

    }
}
