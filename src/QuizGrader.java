
public class QuizGrader {
 public static void main(String[] args) {

  // Array na naglalaman ng mga tamang sagot sa 10 questions.
  char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};

  // Array na naglalaman ng mga sagot na ibinigay ng student.
  char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

  // Variable na magbibilang kung ilang sagot ang tama.
  // Nagsisimula sa 0.
  int correctCount = 0;

  // For loop na susuri sa lahat ng 10 questions.
  for (int i = 0; i < answerKey.length; i++) {

   // Kinukumpara ang sagot ng student sa tamang sagot.
   if (studentAnswers[i] == answerKey[i]) {

    // Kapag pareho, dagdagan ng 1 ang correctCount.
    correctCount++;

   } else {

    // Kapag mali, ipapakita ang question number,
    // sagot ng student, at tamang sagot.
    System.out.println("Question " + (i + 1) + ": Incorrect. You answered '"
            + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'");
   }
  }

  // Kinukuha ang kabuuang bilang ng questions.
  int totalQuestions = answerKey.length;

  // Kinukuwenta ang percentage ng tamang sagot.
  // Ginagamit ang (double) para makakuha ng decimal result.
  double scorePercentage = ((double) correctCount / totalQuestions) * 100;

  // Ipinapakita ang bilang ng correct answers.
  System.out.println("Correct Answers: " + correctCount + "/" + totalQuestions);

  // Ipinapakita ang final score percentage.
  System.out.println("Score Percentage: " + scorePercentage + "%");

  // Sinusuri kung ang score ay 70% pataas.
  if (scorePercentage >= 70.0) {

   // Kapag 70% pataas, PASS.
   System.out.println("Result: PASS");

  } else {

   // Kapag mas mababa sa 70%, FAIL.
   System.out.println("Result: FAIL");
  }
 }
}

