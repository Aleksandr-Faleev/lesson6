public class Park {
    private String name;
    private String Working_hours; //время,работы
    private int cost; // стоимость

    public Park (String name,String Working_hours, int cost) {
       this.name=name;
        this.Working_hours = Working_hours;
        this.cost = cost;
    }
        public static class Attraction{
            public  static void main(String[] args) {
            Park[] ParkArray = new Park[4];
                ParkArray[0]=new Park("колесло обозрения","8:00-17:00",150 );
                ParkArray[1]=new Park("Надувные горки","8:00-17:00",200);
                ParkArray[2]=new Park("карусели","8:00-17:00",250);
                ParkArray[3]=new Park("автодром","8:00-17:00",350);
                Park Attraction=new Park("name","8:00-17:00",150 );
                Attraction.print();
            }

        }
         public void print(){
             System.out.println("колесло обозрения"+","+"8:00-17:00"+","+150 );
             System.out.println("Надувные горки"+","+"8:00-17:00"+","+200 );
             System.out.println("карусели"+","+"8:00-17:00"+","+250 );
             System.out.println("автодром"+","+"8:00-17:00"+","+350 );
         }
    }

