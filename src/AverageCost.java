public class AverageCost {
    public static void main(String[] args) {
        double [] weeklyExp= {100,200,20,10,20,52,89};
        double total = 0;
        //for (int i=0; i<weeklyExp.length; i++)
        for (double daily: weeklyExp) {
            total += daily;
        }
        System.out.println("Your total weekly expense is " + total);
        double avg = total/weeklyExp.length;
        System.out.println("Your avg daily expense is "+avg );
        }
    }

