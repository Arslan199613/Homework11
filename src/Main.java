public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1(2022);
        task2(2014, 1);
        task3(95, 1);
    }

    static void task1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не высокосный год");
        }
        //Задание 2
        System.out.println("Задание 2");

    }

    static void task2(int clientDeviceYear, int clientOS) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Установите версию для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке ");
            } else {
                System.out.println("Установите версию для Android по ссылке");
            }
            //Задание 3
            System.out.println("Задание 3");
        }
    }

    static void task3(int deliveryDistance, int daysForDelivery) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней" + daysForDelivery);
        } else if (deliveryDistance < 60) {
            daysForDelivery = daysForDelivery + 1;
            System.out.println("Потребуется дней" + daysForDelivery);
        } else if (deliveryDistance < 100)
            daysForDelivery = daysForDelivery + 2;
        System.out.println("Потребуется дней:" + daysForDelivery);
    }
}
