import java.util.*;
import java.util.concurrent.*;

class quiz {
    static class Question {
        String question;
        String[] options;
        int correctOption;

        public Question(String question, String[] options, int correctOption) {
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }
    }

    private static final int TIME_LIMIT = 10; // seconds per question
    private static final Scanner scanner = new Scanner(System.in);
    private static int score = 0;

    public static void main(String[] args) {
        List<Question> questions = Arrays.asList(
            new Question("What is the capital of France?", new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Lisbon"}, 3),
            new Question("Which planet is known as the Red Planet?", new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"}, 2),
            new Question("What is the largest mammal?", new String[]{"1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Polar Bear"}, 2)
        );

        for (Question q : questions) {
            askQuestion(q);
        }

        System.out.println("Quiz finished! Your score: " + score + " / " + questions.size());
    }

    private static void askQuestion(Question q) {
        System.out.println(q.question);
        for (String option : q.options) {
            System.out.println(option);
        }
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            System.out.print("Your answer: ");
            return scanner.nextInt();
        });
        
        try {
            int answer = future.get(TIME_LIMIT, TimeUnit.SECONDS);
            if (answer == q.correctOption) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + q.correctOption);
            }
        } catch (TimeoutException e) {
            System.out.println("Time's up! The correct answer was " + q.correctOption);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            executor.shutdownNow();
        }
        System.out.println();
    }
}
