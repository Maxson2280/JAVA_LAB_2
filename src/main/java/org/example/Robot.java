package org.example;

//Продолжаем работать с участниками и выполнением действий. Создайте три класса Человек,
//        Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
//        прыгать, все также с выводом информации о действии в консоль.
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//        (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.3. Создайте два массив: с участниками и препятствиями, и заставьте всех участников пройти этот
//        набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по списку он
//        препятствий не идет.
public class Robot implements Action {
    private  double  MaxHeight;

    private int MaxLength;

    private static int count = 2;

    private String Name;

    public boolean Run(int distance) {
        
        if (distance <= this.MaxLength) {
            System.out.println("Робот " + this.Name + " пробежал " + distance + "м");
            return true;
        }
        System.out.println("Робот " + this.Name + " не смог пробежать " + distance + "м");
        return false;
    }
    @Override
    public boolean Jump (double distance) {
        if (distance <= MaxHeight) {
            System.out.printf("Робот %s успешно перепрыгнул%n", Name);
            return true;
        }
        else if (count != 0)
        {
            System.out.printf("Робот " + this.Name + " смог перепрыгнуть препятствие высотой " + MaxHeight + " метров, использовав суперсилу%n");
            count -= 1;
            return true;
        }
        else {
            System.out.printf("Робот %s не удалось перепрыгнуть%n \n", Name);
            return false;
        }
    }


    Robot(String name, double maxHeight, int maxLength) {
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }
}
