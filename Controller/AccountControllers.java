package SeminarsOOP.StudentApp.Controller;

import SeminarsOOP.StudentApp.Domen.Person;
import SeminarsOOP.StudentApp.Domen.Teacher;

import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания контролирубщих методов
 */
public class AccountControllers {
    /**
     * @apiNote метод выплаты заработной платы
     * @param person имя перподавателя
     * @param salary сумма заработной платы
     */
    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /**
     * @apiNote метод вычисления среднего возраста участников учебного заведения
     * @param persons спиоск участников
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        int sum = 0;
        for (T per: persons) {
            sum += per.getAge();
        }
        return ((double) sum / persons.size());
    }
}
