package AdvancedJava.Advanced.ActualMidExam.workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise){
        if (this.exercises.size() < this.exerciseCount){
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name,String muscle){
        return this.exercises.removeIf(e -> e.getName().equals(name) && e.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle){
        return this.exercises.stream().filter(e->e.getName().equals(name)
                    && e.getMuscle().equals(muscle)).findAny().orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise(){
        return exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).orElse(null);
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Workout type: " + this.type);
        this.exercises.forEach(e-> sb.append(String.format("%n%s", e.toString())));

        return sb.toString();
    }
}
