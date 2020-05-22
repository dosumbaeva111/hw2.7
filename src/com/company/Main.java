package com.company;
//В задании нельзя использовать циклы for и for each. Только while и Iterator
//Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//Затем программа должна отобразить этот список
//Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
//Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//После объединения отобразить в консоли список С
// В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
// и распечатать отсортированный список С.

import javax.sound.sampled.Line;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        ArrayList<String> listA = new ArrayList<>();

        System.out.println("Enter 1a - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 2a - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 3a - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 4a - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 5a - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("___________________________________");
        System.out.println("Список А ");

        Iterator<String> iteratorA = listA.iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }
        System.out.println("___________________________________");
        ArrayList<String> listB = new ArrayList<>();

        System.out.println("Enter 1b - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 2b - Line");
        line = scanner.nextLine();
        listB.add(line);

        System.out.println("Enter 3b - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 4b - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 5b - Line");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("___________________________________");
        System.out.println("Список А");

        Iterator<String> iteratorB = listB.iterator();
        while (iteratorB.hasNext()) {
            System.out.println(iteratorB.next());
        }
        scanner.close();
        System.out.println("___________________________________");
        System.out.println("Список С в указанном поярдке ");
        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);

        Iterator<String> iteratorC1 = listC.iterator();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
            iteratorC1 = listC.iterator();
        }
        while (iteratorC1.hasNext()){
            System.out.println(iteratorC1.next());
        }

        System.out.println("___________________________________");
        System.out.println("Список С по длине ");
        listC.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        Iterator<String> iteratorC2 = listC.iterator();
        while (iteratorC2.hasNext()) {
            System.out.println(iteratorC2.next());
        }
    }
}

