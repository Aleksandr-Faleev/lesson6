public class Park {
            public class Attraction {
            private String name;  // Название
            private int openingTime;  // Время открытия
            private int closingTime;  // Время закрытия
            private int price;  // Стоимость

            public Attraction(String name, int openingTime, int closingTime, int price) {
                this.name = name;
                this.openingTime = openingTime;
                this.closingTime = closingTime;
                this.price = price;
            }
            public void display() {
                System.out.println("Аттракцион: " + name);
                System.out.println("Время работы: с " + openingTime + " до " + closingTime);
                System.out.println("Стоимость: " + price + " рублей");
            }
        }
        public static void main(String[] args) {
            Park park = new Park();
            Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", 9, 20, 500);
            Park.Attraction attraction2 = park.new Attraction("Американские горки", 9, 20, 700);
            Park.Attraction attraction3 = park.new Attraction("Карусели", 9, 20, 600);
            Park.Attraction attraction4 = park.new Attraction("Автодром", 9, 20, 1500);

            attraction1.display();
            System.out.println(" ");
            attraction2.display();
            System.out.println(" ");
            attraction3.display();
            System.out.println(" ");
            attraction4.display();
        }
    }
