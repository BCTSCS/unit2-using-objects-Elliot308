public class MethodsLab2 {
    public static void main(String[] args){
        forloop(2,90,5);
        forloop(-10,8,2);
        forloop(100,150,5);

        System.out.println("............................................");

        whileloop(234);
        whileloop(10000);
        whileloop(123456789);
        whileloop(222222);
    }

    public static void forloop(int a, int b, int c){
        String result = "";
        for (int i=a; i<b; i = i + c){
            result+=i + " ";
        }
        System.out.println("Start: " + a + " / Stop: " + b + " / Increment: " + c);
        System.out.println(result);
    }

    public static void whileloop(int num){
        int i = 0;
        int sum = 0; 
        int orignum = num;
        while (num > 0){
            i++;
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println("The number " + orignum + " has " + i + " digits and the digits have a sum of " + sum);
    }

    public static void addHypen(String word){
        word = word.toUpperCase();
        System.out.println(word);
        for (int i = 0; i < word.length(); i++){
            if (word.substring(i, i+1) = " "){

            }
        }
    }
}
