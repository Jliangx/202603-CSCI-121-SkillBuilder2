# Skill Builder 2: The Hero’s Forge (RPG Logic Engine)

## 1. Student Learning Outcomes (SLOs)

Upon successful completion of this assignment, students will be able to:

* **Implement Static Variables:** Demonstrate the ability to manage global state that is shared across all calls within a class.
* **Develop Static Methods:** Create utility-style methods that can be invoked without instantiating an object.
* **Apply Method Overloading:** Design multiple methods with the same name but different parameter signatures to handle different data types (e.g. integers vs. doubles).
* **Perform Type Casting:** Explicitly convert data types to maintain precision or satisfy variable requirements.
* **Utilize JUnit Testing:** Use a test suite to verify code logic and understand how static state persists across different test cases.

---

## 2. Background

In game development, many systems are "Global." For example, a "World Clock" or a "Global Team Experience Pool" doesn't belong to just one player; it belongs to the game itself. In Java, we represent these global concepts using the `static` keyword.

In this assignment, you will build the `GameMaster` utility class, which will handle the experience points (**XP**) for a party of adventurers.


## 3. Requirements

### Part A: The `GameMaster` Class

Create a class file named `GameMaster.java`. This class should not be instantiated (you will use it via its class name).

1. **Shared State:** Create a private static integer called `totalExperiencePoints`.

2. **Basic Tracking:** Create a static method `gainExperience(int xp)` that adds to the total.

3. Create a static method `getTeamXP()` that returns the total experience points.

4. **Overloaded Power-Ups:** Implement two versions of a static method called `applyPowerUp`:

  - **Version 1 (int)** The `applyPowerUp(int xp)` represents a *Potion*. It should add the parameter value directly to the `totalExperiencePoints`.

6. **Version 2 (double):** The `applyPowerUp(double multiplier)` represents an *Artifact*. It should multiply the current `totalExperiencePoints` by the parameter (e.g., `1.5` for a 50% boost). Note: You must use **type casting** to convert the resulting double back into an integer.

**NOTE:** You may ask, "Why not just name them `applyPotion` and `applyArtifact` instead of overloading them?"  The answer is they are actually both "Power-Ups", and overloading keeps the API clean.

### Part B: Verification

Create a separate class with a `main` method with the following signature,

```
public static void main(String[] args)
```

to simulate a game session. You must:

1. Add 500 XP via a quest experience.
2. Apply a Potion of 100 XP.
3. Apply an Artifact multiplier of 2.5.
4. Print the final results to the console.

**NOTE:** Make sure to create a run configuration and select Application.  Then, in the *Build and Run* section, click on the *Browse* icon in the *Main Class* textbox.  Select the `GameMaster` class. This is the class that has the main method. In the **-cp** text box, select *SkillBuilder2.main*.


## 4. Testing with JUnit

To ensure your logic is "Production Ready," you are provided with a JUnit test suite.

<div style="background-color:pink; padding: 5px; border-radius: 10px;">
<strong>Critical Note on Statics:</strong> Because static variables "live" as long as the program is running, they do not automatically reset between tests. You must implement a <code>public static void resetGame()</code> method in your <code>GameMaster</code> class that sets the XP back to 0 so the tests can run independently.
</div>

**NOTE:** Make sure to create a Gradle run configuration and add a *test* in the run textbox. This will run the JUnit test that is included with the project.

## 5. Submission Instructions

Submit the `GameMaster.java` file with the completed class, including the implemented `main` method by clicking on the **Skill Builder 2** CodeGrade link in Blackboard.