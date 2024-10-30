public class Emploee {
    private String name;  // ФИО
    private String position;  // должность
    private String email;  // email
    private String phone_number;  // номер телефона
    private int salary;  // зарплата
    private int age;  // возраст

    public Emploee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println(" "+"Vasiliy"+ ","  + "Фотограф"+ ","+"Vasiliy@top.com"+","+ "номер_телефона"+"," +42_000+"," + 32 );
    }
}


