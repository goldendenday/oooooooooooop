package SeminarsOOP.StudentApp.Domen;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания преподавателя учебного заведения
 */
public class Teacher extends Person {
    private String acadDegree;

    /**
     * @param firstName  имя преподавателя
     * @param age        возраст преподавателя
     * @param acadDegree ученая степень
     * @apiNote конструктор класса
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    public void setDegree(String dgr) {
        this.acadDegree = dgr;
    }
}
