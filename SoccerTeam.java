public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;
    private int points;
    private static int goals;
    private static int games;

    public SoccerTeam(){
        wins=0;
        losses=0;
        ties=0;
        points=0;

    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        if(myScore>otherScore){ 
            wins++;
            other.losses++;
        }
        else if(myScore<otherScore){ 
            losses++;
            other.wins++;
        }
        else{
             ties++;
             other.ties++;
        }
        goals=myScore+otherScore;
        games++;
    }
    public int points(){
        points=wins*3+ties;
        return points;
    }
    public void reset(){
        wins=0;
        points=0;
        losses=0;
        ties=0;
    }
    public void startTournament(){
        goals=0;
        games=0;
    }
    public static void main(String[] args){
        SoccerTeam s=new SoccerTeam();
        SoccerTeam s1= new SoccerTeam();
        SoccerTeam s2= new SoccerTeam();
        SoccerTeam s3= new SoccerTeam();

        s.startTournament();
        System.out.println("Tournament 1");
        s.played(s1,9,7);
        s2.played(s3,5,7);
        s3.played(s2,5,5);
        s1.played(s2,6,7);
        System.out.println("Wins: "+s.wins+"; Losses: "+s.losses+"; Ties: "+s.ties+"; Current Points "+s.currPts());
        System.out.println("Wins: "+s1.wins+"; Losses: "+s1.losses+"; Ties: "+s1.ties+"; Current Points "+s1.currPts());
        System.out.println("Wins: "+s2.wins+"; Losses: "+s2.losses+"; Ties: "+s2.ties+"; Current Points "+s2.currPts());
        System.out.println("Wins: "+s3.wins+"; Losses: "+s3.losses+"; Ties: "+s3.ties+"; Current Points "+s3.currPts());
        System.out.println("Number of Games: "+getNumGames());
        System.out.println("Number of Goals: "+getNumGoals());
        s.reset();
        System.out.println();

        System.out.println("Tournament 2");
        s.played(s1,3,3);
        s2.played(s3,1,4);
        s3.played(s2,6,2);
        s1.played(s2,4,2);
        System.out.println("Wins: "+s.wins+"; Losses: "+s.losses+"; Ties: "+s.ties+"; Current Points "+s.currPts());
        System.out.println("Wins: "+s1.wins+"; Losses: "+s1.losses+"; Ties: "+s1.ties+"; Current Points "+s1.currPts());
        System.out.println("Wins: "+s2.wins+"; Losses: "+s2.losses+"; Ties: "+s2.ties+"; Current Points "+s2.currPts());
        System.out.println("Wins: "+s3.wins+"; Losses: "+s3.losses+"; Ties: "+s3.ties+"; Current Points "+s3.currPts());
        System.out.println("Number of Games: "+games());
        System.out.println("Number of Goals: "+goals());
    }
}

