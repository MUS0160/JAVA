class galToLit{
    public static void main(String args[]){
        int count = 0;
        for(double galons = 1; galons <= 100; galons++){ 
            System.out.println(galons + " galons is " + galons*3.7854 + " liters.");
            ++count;
            if(count % 10 == 0){
                System.out.println();
            }
        }
    }
}