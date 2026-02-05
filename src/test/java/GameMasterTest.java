import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameMasterTest {

    // Runs before every test to ensure a clean state
    @BeforeEach
    public void setup() {
        GameMaster.resetGame();
    }

    @Test
    public void testGainExperience() {
        GameMaster.gainExperience(500);
        assertEquals(500, GameMaster.getTeamXP(), "XP should be exactly 500 after quest.");
    }

    @Test
    public void testOverloadedPotion() {
        GameMaster.gainExperience(100);
        // Calls the (int) version of the method
        GameMaster.applyPowerUp(50);
        assertEquals(150, GameMaster.getTeamXP(), "Potion should add flat amount.");
    }

    @Test
    public void testOverloadedArtifact() {
        GameMaster.gainExperience(100);
        // Calls the (double) version of the method
        GameMaster.applyPowerUp(1.5);
        assertEquals(150, GameMaster.getTeamXP(), "Artifact should multiply XP.");
    }

    @Test
    public void testCombinedActions() {
        GameMaster.gainExperience(200);   // 200
        GameMaster.applyPowerUp(100);    // 300
        GameMaster.applyPowerUp(2.0);    // 600
        assertEquals(600, GameMaster.getTeamXP(), "Sequential power-ups should calculate correctly.");
    }
}