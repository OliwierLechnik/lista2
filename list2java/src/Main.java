
public class Main {
    public static void main(String[] args) {

        int len = args.length;
        if(len < 1){
            return;
        }

        if(1 > Integer.valueOf(args[0])){
            return;
        }

        Prime prime = new Prime(Integer.valueOf(args[0]));
        for(int i = 1; i < len; i++){
            try {
                System.out.println(args[i] + " - "+  prime.get(Integer.valueOf(args[i])));
            }catch (NumberFormatException e){
                System.out.println("'" + args[i] + "' is not a number");
            }
        }
    }
}