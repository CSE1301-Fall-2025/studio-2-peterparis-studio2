public class Ruin {
    public static void main(String[] args) {
        int startAmount = 10;
        double winChance = 1.0;
        int winLimit = 15;
        int totalDays = 10;
        for (int x = 1; x<=totalDays; x++) {
           System.out.println("Day" + x);
            while (startAmount > 0 && startAmount < winLimit) {
                boolean win = Math.random() < winChance;
                if (win == true) {
                    startAmount++;
                } else {
                    startAmount--;
                }
            
                System.out.println(startAmount);
            }

        }


    }
}
