package SeminarsOOP.StudentApp.Services;

import java.util.List;

/**
 * @author Developer Name
 * @version 1.0
 * @apiNote Интерфейс для описания взаимодейсвтия с участниками учебного заведения
 */


public interface iPersonServices<T> {
    /**
     * метод получения списка всех участников
     */
    List<T> getAll();

    /**
     * метод созадния учатинка
     *
     * @param name имя учачтинка
     * @param age  возраст участинка
     */
    void create(String name, int age);
}