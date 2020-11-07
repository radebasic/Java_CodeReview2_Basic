import java.util.ArrayList;

public class Exercise {
    public String exercisename;
    public int duration;
    public String position;
    public String description;

    public Exercise(String exercisename, int duration, String position, String description) {
        this.exercisename = exercisename;
        this.duration = duration;           // 60 sec or more
        this.position = position;           // floor or standing
        this.description = description; }

    /*   @Override
       public String toString() {
           return "Exercise{" +
                   "exercisename='" + exercisename + '\'' +
                   ", duration=" + duration +
                   ", position='" + position + '\'' +
                   ", description='" + description + '\'' +
                   '}';   }

    */
    public String toString() {
        return exercisename + '\t' + "\t" + "\t" + " duration=" + duration + "  seconds." + "\n" + "........................................................"
                + '\n' + "description: " + description +
                "\n";
    }


}
























