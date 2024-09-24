class ex03{
    public static void main(String args[]){
        int a,b,c;
        a = 2;
        b = 3;

        if(a<b){
            System.out.println("a is smaller than b");
        }
        System.out.println();
        
        c = a - b;
        if(c < 0){
            System.out.println("c is negative");
        }
        c = b-a;
        if(c > 0){
            System.out.println("c is positive");
        }
    }
}