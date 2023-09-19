package SeminarsOOP.StudentApp.Domen;

import java.util.Comparator;

/**
 * @author Developer Name
 * @version 1.0
 * @apiNote Класса для сравнения участинов учебного заведения по имени
 */
public class PersonComparator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            return 0;
        } else {
            return res;
        }
    }

}
