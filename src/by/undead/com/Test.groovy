package by.undead.com

/**
 * Created by
 * User: Khralovich Dzmitry
 * Date: 07.06.13
 * Time: 9:48
 */
class Test {

    public static class Dynamic extends Expando {
        public int x;
        public int y;

        Dynamic() {
            this.x = 1
            this.y = 2
        }

        public int sum() {
            x + y
        }

    }

    public static void main(String[] args) {

        def name = 'World';
        def num = 15;
        println "Hello $name!"
        println num.class

        def obj = new Expando();

        obj.a = 1 // Создаем новое поле
        obj.b = 2 // Создаем новое поле
        obj.do = { println "done" }

        println obj.a
        obj.do

        Dynamic dyn = new Dynamic();

        dyn.s1 = "str"
        dyn.s2 = "ing"
        dyn.plus = { println dyn.s1 + dyn.s2 }

        println dyn.sum();

        dyn.plus
    }
}
