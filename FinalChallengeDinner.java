package ChallengeOfModule;

public class FinalChallengeDinner {
    public static void main(String[] args) {

        FinalChallengeFood f1 = new FinalChallengeFood("Rice", 0.180);
        FinalChallengeFood f2 = new FinalChallengeFood("Bean", 0.300);
        FinalChallengePeople p = new FinalChallengePeople("Luis", 99.8);

        System.out.println(p.Output());
        p.eat(f1);

        System.out.println(p.Output());
        p.eat(f2);

        System.out.println(p.Output());
    }
}
