package lesson_26;

/*Что такое технология Java и каково ее применение?
Java представляет собой язык программирования и платформу вычислений, которая была впервые выпущена компанией Sun
Microsystems в 1995 г. Технология эволюционировала из скромной разработки до инструмента, который играет серьезную роль
в современном цифровом мире, предоставляя надежную платформу для множества сервисов и приложений. Инновационные продукты
и цифровые услуги, разрабатываемые для будущего, также будут создаваться на основе Java.

Несмотря на то что большинство современных приложений Java объединяет в себе среду и приложение Java, все еще существует
множество приложений и даже некоторые веб-сайты, которые не будут работать, если на компьютере не установлена настольная
версия Java. Java.com — это веб-сайт, предназначенный для пользователей, которым, возможно, Java по-прежнему требуется
для настольных приложений, в частности для приложений на Java 8. Более подробную информацию для разработчиков и
пользователей, которые хотели бы научиться программированию на Java, см. на веб-сайте dev.java, для
бизнес-пользователей — на веб-странице oracle.com/java.

    Напишите метод, который отвечает на вопрос сколько символов в этом предложении.
    Подсчитайте, сколько букв (не символов и не цифр и не знаков!) в этом предложении.
    Подсчитайте, сколько букв латиского алфавита в этом предложении.
    Подсчитайте, сколько букв кирилического алфавита в этом предложении.*/


import javax.crypto.spec.PSource;

public class Hw_task1 {
    public static void main(String[] args) {

        final String text =
                "Что такое технология Java и каково ее применение?\n" +
                        "Java представляет собой язык программирования и платформу вычислений, которая была впервые выпущена компанией Sun\n" +
                        "Microsystems в 1995 г. Технология эволюционировала из скромной разработки до инструмента, который играет серьезную роль\n" +
                        "в современном цифровом мире, предоставляя надежную платформу для множества сервисов и приложений. Инновационные продукты\n" +
                        "и цифровые услуги, разрабатываемые для будущего, также будут создаваться на основе Java.\n" +
                        "\n" +
                        "Несмотря на то что большинство современных приложений Java объединяет в себе среду и приложение Java, все еще существует\n" +
                        "множество приложений и даже некоторые веб-сайты, которые не будут работать, если на компьютере не установлена настольная\n" +
                        "версия Java. Java.com — это веб-сайт, предназначенный для пользователей, которым, возможно, Java по-прежнему требуется\n" +
                        "для настольных приложений, в частности для приложений на Java 8. Более подробную информацию для разработчиков и\n" +
                        "пользователей, которые хотели бы научиться программированию на Java, см. на веб-сайте dev.java, для\n" +
                        "бизнес-пользователей — на веб-странице oracle.com/java.";

        System.out.println(countChars(text));
        System.out.println(countLetters(text));
        System.out.println(countLatin(text));
        System.out.println(countKiril(text));


    }

    // Напишите метод, который отвечает на вопрос сколько символов в этом предложении.

    public static int countChars(String source) {
        return source.length();

    }


     // Подсчитайте, сколько букв (не символов и не цифр и не знаков!) в этом предложении.
    public static int countLetters(String source){
       int counter = 0;
        for (int i = 0; i < source.length() ; i++) {
            if (
                    ((source.charAt(i)>= 'a' && (source.charAt(i)<= 'z')) ||
                            ((source.charAt(i)>= 'A' && (source.charAt(i)<= 'Z')) ||
                                    ((source.charAt(i)>= 'а' && (source.charAt(i)<= 'я')) ||
                                            ((source.charAt(i)>= 'А' && (source.charAt(i)<= 'Я')))))))
            {
                                counter++;
            }
        }
                     return counter;
    }
// Подсчитайте, сколько букв латиского алфавита в этом предложении.

    public static int countLatin(String source){
        int counterLatin = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i)>= 'a' && (source.charAt(i)<= 'z') || (source.charAt(i)>= 'A' && (source.charAt(i)<= 'Z'))){
                counterLatin ++;
            }

        } return counterLatin;

    }

    // Подсчитайте, сколько букв кирилического алфавита в этом предложении
    public static int countKiril(String source){
        int counterKiril = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i)>= 'а' && (source.charAt(i)<= 'я') ||
                    (source.charAt(i)>= 'А' && (source.charAt(i)<= 'Я'))){
                        counterKiril++;
            }
        }
        return counterKiril;
    }
    
}

