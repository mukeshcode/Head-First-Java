import java.util.Scanner;

class StringChecker{
    private String str;

    StringChecker(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        this.str = sc.nextLine();
    }

    public void checkOccurrence(){
        for(int i = 0; i<this.str.length(); i++){
            boolean alreadyCounted = false;
            for(int j = 0; j<i; j++){
                if(this.str.charAt(i) == this.str.charAt(j)){
                    alreadyCounted = true;
                    break;
                }
            }

            if(!alreadyCounted){
                int cnt = 1;
                for(int j = i+1; j<this.str.length(); j++){
                    if(this.str.charAt(i) == this.str.charAt(j))
                        cnt++;
                }
                System.out.println(this.str.charAt(i) + " : " + cnt);
            }
        }
    }
}

class StringTest {
    public static void main(String[] args){
        StringChecker str1 = new StringChecker();
        str1.checkOccurrence();
    }
}
