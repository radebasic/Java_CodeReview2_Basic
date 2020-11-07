/**
 * Author: Rade Basic
 * Title: Week2-CodeReview2
 * Repository: Java_CodeReview1_Basic
 * Date :07-11-2020
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Exercise>exerciseArrayList = new ArrayList<>();

        exerciseArrayList.add(new Exercise("Push-up", 30, "floor", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to the starting position."));
        exerciseArrayList.add(new Exercise("Plank", 90, "floor", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.") );
        exerciseArrayList.add( new Exercise("Squat", 45, "standing", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels."));
        exerciseArrayList.add( new Exercise("Backward Kick ", 60, "floor", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat."));
        exerciseArrayList.add(new Exercise("Leg Curl", 90, "standing", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg." ));
        exerciseArrayList.add( new Exercise("Sidewards Back Stretch", 60, "standing", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand."));

        for (Exercise i : exerciseArrayList ) {
            System.out.println(i);
        }

        Exercise[] exercises = new Exercise[3];
        exercises[0] = new Exercise("Planks ", 90, "floor" +
                " Now, tighten your abs and hold.", "Start on the floor on your hands and knees. \" +\n" +
                "                \"Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart.\" +\n" +
                "                \" Maintain a straight line from heels through the top of your head, looking down at the floor.");

        exercises[1] = new Exercise("Push-ups ", 30, " Place your hands on the floor. " +
                "Raise up onto your toes so that all of your body weight is on your hands and your feet." +
                " Bend your elbows and lower your chest down toward the floor. Then," +
                " push off the floor and extend them so that you return to the starting position.", "floor");
        exercises[2] = new Exercise("Backward Kick", 60, "Get in an all-fours position with your knees and hands on the floor." +
                " Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. " +
                " Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                " Return to the starting position and repeat.", "floor");

        for ( Exercise e: exercises) {
            System.out.println(e);

        }

    }
}


