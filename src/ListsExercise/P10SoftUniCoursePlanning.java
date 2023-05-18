package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courses = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("course start")) {
            String [] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            switch(command) {
                case "Add":
                    if(!courses.contains(lessonTitle)) {
                        courses.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if(!courses.contains(lessonTitle)) {
                        courses.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if(courses.contains(lessonTitle)) {
                        courses.remove(lessonTitle);
                    }
                    int indexLesson = courses.indexOf(lessonTitle);
                    if(courses.get(indexLesson + 1).equals(lessonTitle+"-Exercise")) {
                        courses.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":

                    String lessonTitle2 = input.split(":")[2];
                    if (courses.contains(lessonTitle) && courses.contains(lessonTitle2)) {
                        int lesson1Index = courses.indexOf(lessonTitle);
                        int lesson2Index = courses.indexOf(lessonTitle2);
                        courses.set(lesson1Index, lessonTitle2);
                        courses.set(lesson2Index, lessonTitle);

                        String exOne = lessonTitle + "-Exercise";
                        String exTwo = lessonTitle2 + "-Exercise";
                        if (courses.contains(exOne)) {
                            courses.remove(courses.indexOf(exOne));
                            courses.add(courses.indexOf(lessonTitle + 1), exOne);
                        }
                        if (courses.contains(exTwo)) {
                            courses.remove(courses.indexOf(exTwo));
                            courses.add(courses.indexOf(lessonTitle2) + 1, exTwo);
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = courses.indexOf(lessonTitle);
                    if(courses.contains(lessonTitle)) {
                        if(indexLessonTitle == courses.size() - 1) {
                            courses.add(indexLessonTitle + 1, exercise);
                        } else  if(!courses.get(indexLessonTitle + 1).equals(exercise)) {
                            courses.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        courses.add(lessonTitle);
                        courses.add(exercise);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        printList(courses);
    }



    private static void printList(List<String> elements) {
        int count = 1;
        for (String element : elements) {
            System.out.println(count + "." + element);
            count++;

        }
    }
}