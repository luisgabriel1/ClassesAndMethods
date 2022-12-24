package ChallengeOfModule;

public class FinalChallengePeople {
    String name;
    double weight;

    FinalChallengePeople(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    void eat(FinalChallengeFood finalChallengeFood){
        if(finalChallengeFood != null){
            this.weight += finalChallengeFood.weight;
        }
    }
    String Output (){
        return "Hello I am" + name + "the have" + weight + "Kgs ";
    }
}
