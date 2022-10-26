import java.util.*;
class GuessGame{
    private static int guess=0;
    static int point=0;
    public static void main(String[] args){
        Scanner player=new Scanner(System.in);
        int iteration=4;
        for(;;){
            for(int i=1;i<=4;i++){
                int attempts=4;
                System.out.println("\nRound: "+i);
                Random r=new Random();
                int n=r.nextInt(100) + 1;
                System.out.println("Number is " + String.valueOf(n));
                while(attempts!=0){
                    System.out.println("Guess a number between 1 to 100");
                    guess=player.nextInt();
                    if(guess>n){
                        System.out.println("Too High");
                        attempts--;
                        System.out.println("Attempts left: " + attempts );
                
                    }
                    else if(guess<n){
                        System.out.println("Too Low");
                        attempts--;
                        System.out.println("Attempts left: " + attempts );
                        
                    }else{
                        System.out.println("That is correct!");
                        attempts--;
                        switch(attempts){
                            case 4:
                                point+=4;
                                System.out.println("Your score: "+(++point));
                                break;
                            case 3:
                                point+=3;
                                System.out.println("Your score: "+(++point));
                                break;
                            case 2:
                                point+=2;
                                System.out.println("Your score: "+(++point));
                                break;
                            case 1:
                                point+=1;
                                System.out.println("Your score: "+(++point));
                                break;
                            case 0:
                                System.out.println("Your score: "+(point));
                                break;
                        }break;
                    }
                    if(attempts==0){
                        System.out.println("You are out of attempts");
                        System.out.println("Your score: "+point);

                        

                    }
                }
            }
            System.exit(0);
        }
    }
}