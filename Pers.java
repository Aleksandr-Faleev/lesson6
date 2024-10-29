public class Pers {

        String name; //ФИО
        String position; //должность
        String email; //емейл
        String phone_number; //номер телефона
        int salary; //зарплата
        int age; //возраст


        public Pers (String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone_number = phone_number;
            this.salary = salary;
            this.age = age;
        }
    public static void main(String[] args) {

        Pers[] persArray = new Pers[5];
        persArray[0] = new Pers("Наталья Волкова", "Генеральный директор", "volkova@.com", "+79996665544", 250_000, 45);
        persArray[1] = new Pers("Иван Лопатин", "Заместитель директора", "lopata@.com", "+79992134514", 115_000, 35);
        persArray[2] = new Pers("Дмитрий Круть", "Охранник", "Krut@.com", "+79530922897", 55_000, 21);
        persArray[3] = new Pers("Оксана Чернова", "Ведущий разработчик", "Schrno@.com", "+79435678345", 90_000, 29);
        persArray[4] = new Pers("Кристина Зайцева", "Директор по работе с клиентами", "Zayc@.com", "+79235789054", 110_000, 30);
    }

        public void print(){
            System.out.println("Наталья Волкова"+","+"Генеральный директор"+","+"volkova@.com"+","+"+79996665544"+","+250_000+","+ 45);
            System.out.println("Иван Лопатин"+","+"Заместитель директора"+","+"lopata@.com"+","+"+79992134514"+","+115_000+","+ 35);
            System.out.println("Дмитрий Круть"+","+"Охранник"+","+"Krut@.com"+","+"+79530922897"+","+55_000+","+ 21);
            System.out.println("Оксана Чернова"+","+"Ведущий разработчик"+","+"Schrno@.com"+","+"79435678345"+","+90_000+","+29);
            System.out.println("Кристина Зайцева"+","+"Директор по работе с клиентами"+","+"Zayc@.com"+","+"+79235789054"+","+110_000+","+ 30);
        }


        }


