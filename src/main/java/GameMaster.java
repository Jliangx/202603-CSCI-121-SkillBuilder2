public class GameMaster {
    private static int totalExperiencePoints;
    public static void gainExperience(int xp){
        totalExperiencePoints += xp;
    }
    public static int getTeamXP(){
        return totalExperiencePoints;
    }
    public static void applyPowerUp(int xp){
        totalExperiencePoints += xp;
    }
    public static void applyPowerUp(double multiplier){
        totalExperiencePoints = (int)(totalExperiencePoints * multiplier);
    }
    public static void main(String[] args){
        GameMaster.resetGame();
        GameMaster.gainExperience(500);
        GameMaster.applyPowerUp(100);
        GameMaster.applyPowerUp(2.5);
        System.out.println(GameMaster.getTeamXP());
    }
    public static void resetGame(){
        totalExperiencePoints = 0;
    }

}
