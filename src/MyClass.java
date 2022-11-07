public class MyClass {
    private String name, surname, food;
    private int age;
    private String[] lesson;

    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public MyClass(String name, String surname, String food, int age, String[] lesson) {
        this.name = name;
        this.surname = surname;
        this.food = food;
        this.age = age;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getLesson() {
        return lesson;
    }

    public void setLesson(String[] lesson) {
        this.lesson = lesson;
    }
}
