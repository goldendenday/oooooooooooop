package SeminarsOOP.StudentApp;

import SeminarsOOP.StudentApp.Controller.AccountControllers;
import SeminarsOOP.StudentApp.Domen.Person;
import SeminarsOOP.StudentApp.Domen.Student;
import SeminarsOOP.StudentApp.Domen.StudentGroup;
import SeminarsOOP.StudentApp.Domen.StudentStream;
import SeminarsOOP.StudentApp.Services.TeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Ольга", 23);
        Student s3 = new Student("Николай", 22);
        Student s4 = new Student("Татьяна", 23);
        Student s5 = new Student("Дарья", 23);
        Student s6 = new Student("Елена", 23);
        Student s7 = new Student("Владислав", 25);
        Student s8 = new Student("Мария", 23);
        Student s9 = new Student("Анастсия", 22);
        Student s10 = new Student("Владимир", 23);
        Student s11 = new Student("Анна", 23);
        Student s12 = new Student("Полина", 23);
        Student s13 = new Student("Дмитрий", 25);
        Student s14 = new Student("Олег", 23);
        Student s15 = new Student("Андрей", 22);
        Student s16 = new Student("Наталья", 23);
        Student s17 = new Student("Оззи", 23);
        Student s18 = new Student("Рэнди", 23);
        Student s19 = new Student("Зак", 23);
        Student s20 = new Student("Даймпег", 23);
        Student s21 = new Student("Джеймс", 23);
        Student s22 = new Student("Кирк", 23);
        Student s23 = new Student("Дейв", 23);
        Student s24 = new Student("Джон", 23);
        Student s25 = new Student("Стив", 23);
        Student s26 = new Student("Джо", 23);
        Student s27 = new Student("Нуно", 23);
        Student s28 = new Student("Пол", 23);
        Student s29 = new Student("Ричи", 23);
        Student s30 = new Student("Арон", 23);

        List<Person> listStud1 = new ArrayList<>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        listStud1.add(s7);

        List<Person> listStud2 = new ArrayList<>();
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);

        List<Person> listStud3 = new ArrayList<>();
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        listStud3.add(s16);

        List<Person> listStud4 = new ArrayList<>();
        listStud4.add(s17);
        listStud4.add(s18);
        listStud4.add(s19);
        listStud4.add(s20);
        listStud4.add(s21);

        List<Person> listStud5 = new ArrayList<>();
        listStud5.add(s22);
        listStud5.add(s23);
        listStud5.add(s24);

        List<Person> listStud6 = new ArrayList<>();
        listStud6.add(s25);
        listStud6.add(s26);
        listStud6.add(s27);
        listStud6.add(s28);
        listStud6.add(s29);
        listStud6.add(s30);

        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        StudentGroup group4582 = new StudentGroup(listStud3, 4582);
        StudentGroup group4583 = new StudentGroup(listStud4, 4583);
        StudentGroup group4584 = new StudentGroup(listStud5, 4584);
        StudentGroup group4585 = new StudentGroup(listStud6, 4585);

        System.out.println("=================================================");
        for (Person std : group4580) {
            System.out.println(std);
        }
        System.out.println("=================================================");

        for (Person std : group4581) {
            System.out.println(std);
        }
        System.out.println("=================================================");

        for (Person std : group4582) {
            System.out.println(std);
        }
        System.out.println("=================================================");

        for (Person std : group4583) {
            System.out.println(std);
        }
        System.out.println("=================================================");

        for (Person std : group4584) {
            System.out.println(std);
        }
        System.out.println("=================================================");

        for (Person std : group4585) {
            System.out.println(std);
        }
        System.out.println("=================================================");

        List<StudentGroup> stream1 = new ArrayList<>();
        stream1.add(group4580);
        stream1.add(group4581);

        List<StudentGroup> stream2 = new ArrayList<>();
        stream2.add(group4582);
        stream2.add(group4583);

        List<StudentGroup> stream3 = new ArrayList<>();
        stream3.add(group4584);
        stream3.add(group4585);

        StudentStream firstStream = new StudentStream(stream1, 11);
        StudentStream secondStream = new StudentStream(stream2, 12);
        StudentStream thirdStream = new StudentStream(stream3, 13);


        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ БЕЗ СОРТИРОВКИ ********");
        System.out.println("=================================================");
        for (StudentGroup grp : firstStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        for (StudentGroup grp : secondStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        for (StudentGroup grp : thirdStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ СОРТИРОВКОЙ ПО РАЗМЕРУ ГРУППЫ ********");
        System.out.println("=================================================");
        Collections.sort(firstStream.getStream());
        for (StudentGroup grp : firstStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        Collections.sort(secondStream.getStream());
        for (StudentGroup grp : secondStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        Collections.sort(secondStream.getStream());
        for (StudentGroup grp : thirdStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ СОРТИРОВКОЙ ПО НОМЕРУ ГРУППЫ ********");
        System.out.println("=================================================");
        Collections.sort(firstStream.getStream(), StudentGroup.compareById());
        for (StudentGroup grp : firstStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        Collections.sort(secondStream.getStream(), StudentGroup.compareById());
        for (StudentGroup grp : secondStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        Collections.sort(thirdStream.getStream(), StudentGroup.compareById());
        for (StudentGroup grp : thirdStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");

        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ С УКАЗАНИЕМ НОМЕРА ПОТОКА, КОЛ-ВА СТУДЕНТОВ В ГРУППЕ И СПИСКОМ СТУДЕНТОВ ********");
        System.out.println("=================================================");
        System.out.println("firstStream = " + firstStream);
        System.out.println("*************************************************");

        System.out.println("secondStream = " + secondStream);
        System.out.println("*************************************************");

        System.out.println("thirdStream = " + thirdStream);
        System.out.println("=================================================");

        /**
         * создаем список учителей
         */
        TeacherService tchCat = new TeacherService();
        tchCat.create("Галина", 55);
        tchCat.create("Татьяна", 57);
        tchCat.create("Ольга", 35);
        tchCat.create("Владимир", 62);
        tchCat.create("Анатолий", 44);
        tchCat.create("Николай", 40);

        System.out.println("******** ВЫВОД СПИСКА УЧИТЕЛЕЙ С СОРТИРОВКОЙ ПО ИМЕНИ ********");
        System.out.println("=================================================");
        tchCat.printTeachers();
        System.out.println("=================================================");

        System.out.println("******** ВЫВОД СРЕДНЕГО ВОЗРАСТА СТУДЕНТОВ ********");
        System.out.println("=================================================");
        System.out.println("Срединй возврас студентов = " + AccountControllers.averageAge(listStud1));
        System.out.println("=================================================");

        System.out.println("******** ВЫВОД СРЕДНЕГО ВОЗРАСТА УЧИТЕЛЕЙ ********");
        System.out.println("=================================================");
        System.out.println("Срединй возврас учителей = " + AccountControllers.averageAge(tchCat.getAll()));
        System.out.println("=================================================");
    }
}