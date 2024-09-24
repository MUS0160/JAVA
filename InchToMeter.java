class InchToMeter{
    public static void main(String args[]){
        int count = 0;
        for (double inch = 1; inch < (12*12); inch++){
            System.out.println(inch + " inches is " + inch/39.37 + " meters.");
            ++count;
            if(count % 12 == 0){
                System.out.println(inch/12 + " feets is " + inch/39.37 + " meters.");
                System.out.println();
            }
        }
    }
}