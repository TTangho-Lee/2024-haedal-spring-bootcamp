import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //문제1
        String input1 = scanner.nextLine();
        System.out.println(new StringBuffer(input1).reverse());
        //문제2
        String input2 = scanner.nextLine();
        String[] array={"a","e","i","o","u"};
        boolean tmp=false;
        for(int i=0;i<5;i++){
            if (input2.equals(array[i])) {
                tmp = true;
                break;
            }
        }
        if(tmp){
            System.out.println("O");
        }else{
            System.out.println("X");
        }
        //문제3
        int input3_1=scanner.nextInt();
        scanner.nextLine();
        int input3_2=scanner.nextInt();
        scanner.nextLine();
        if(input3_1>=14||input3_2>=160){
            System.out.println("X");
        }else{
            System.out.println("O");
        }
        //문제4
        while(true){
            String input4=scanner.nextLine();
            try{
                int number=Integer.parseInt(input4);
                int answer=0;
                if(number>0){
                    for(int i=1;i<=number;i++){
                        answer+=i;
                    }
                    System.out.println(answer);
                    break;
                }
                else{
                    System.out.println("X");
                }
            }catch (NumberFormatException e){
                System.out.println("X");
            }
        }
        //문제5
        int input5_1=scanner.nextInt();
        scanner.nextLine();
        int input5_2=scanner.nextInt();
        scanner.nextLine();
        int[] array_30={4,6,9,11};
        int[] array_31={1,3,5,7,8,10,12};
        if(input5_2==2){
            if(input5_1%4==0&&input5_1%100!=0){
                System.out.println("29");
            }
            else if(input5_1%400==0){
                System.out.println("29");
            }
            else{
                System.out.println("28");
            }
        }
        for (int j : array_30) {
            if (input5_2 == j) {
                System.out.println("30");
            }
        }
        for (int j : array_31) {
            if (input5_2 == j) {
                System.out.println("31");
            }
        }
        //문제6
        Fan[] Fans = new Fan[3];
        for(int i=0;i<3;i++){
            String input6_1=scanner.nextLine();
            int input6_2=scanner.nextInt();
            scanner.nextLine();
            Fan fan=new Fan();
            fan.setModel(input6_1);
            fan.setPrice(input6_2);
            Fans[i]=fan;
        }
        if(Fans[0].getPrice()<=Fans[1].getPrice()&&Fans[0].getPrice()<=Fans[2].getPrice()){
            System.out.println(Fans[0].getModel());
        }
        if(Fans[1].getPrice()<=Fans[0].getPrice()&&Fans[1].getPrice()<=Fans[2].getPrice()){
            System.out.println(Fans[1].getModel());
        }
        if(Fans[2].getPrice()<=Fans[1].getPrice()&&Fans[2].getPrice()<=Fans[0].getPrice()){
            System.out.println(Fans[2].getModel());
        }

    }
    private static class Fan{
        private String model;
        private int price;
        public Fan() {}
        public String getModel() {return model;}
        public void setModel(String model) {this.model = model;}
        public int getPrice() {return price;}
        public void setPrice(int price) {this.price = price;}
    }
}