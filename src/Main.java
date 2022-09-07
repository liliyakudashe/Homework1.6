public class Main {
    public static void main(String[] args) {
       // Задача 1
         System.out.println("Первая задача");
           for (int i = 1; i <=10; i++){
               System.out.println("Элемент: " + i);
     }
        // Задача 2
        System.out.println("Вторая задача");
        for (int i = 1; i >= -10; i--) {
            System.out.println("Элемент: " + i);
        }
        // Задача 3
        System.out.println("Третья задача");
        for (int j = 1; j <= 17; j +=2) {
            System.out.println("Элемент: " + j);
       }
        // Задача 4
        System.out.println("Четвёртая задача");
        for (int i = 10; i >= -10; i--){
            System.out.println("Элемент: " +i);
        }
        // Задача 5
        System.out.println("Пятая задача");
        for (int i = 1904; i < 2096; i+=4) {
            System.out.printf("%d год является високосным\n", i);
        }
        // Задача 6
        System.out.println("Шестая задача");
        for (int i = 7; i <= 84; i+=7) {
            System.out.println("Элемент " + i);
        }
        // Задача 7
        System.out.println("Седьмая задача");
        for (int i = 1; i <= 512; i*=2) {
            System.out.println("Элемент: " + i);
        }
       // Задача 8
        System.out.println("Восьмая задача");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + savings;
            System.out.println("Сумма накоплений " + total);
        }
        // Задача 9
        System.out.println("Девятая задача");
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + savings;
           System.out.println("Месяц - " + i + ", " + "сумма накоплений равнв: " + total);
        }
    }
}