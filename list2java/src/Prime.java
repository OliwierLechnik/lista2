import java.util.Arrays;

public class Prime {
    private int[] parts;
    private int amount;
    public Prime(int n){
        this.parts = new int[n];
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int counter = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i] == 1){
                parts[counter] = i;
                counter++;
                int j = 2*i;
                while(j < n){
                    isPrime[j] = 0;
                    j += i;
                }
            }
        }
        this.amount = counter;
    }

    public int get(int n){
        if(n < this.amount && n > 0) {
            return this.parts[n];
        }else{
            System.out.println("Array out of bounds. Returning -1 as placeholder.");
            return -1;
        }
    }

    public void print(){
        for(int p : this.parts){
            if(p == 0){
                break;
            }
            System.out.println(p);
        }
    }
}
