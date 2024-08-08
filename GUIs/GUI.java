import javax.swing.JOptionPane;

public class GUI {
        public static void main(String[] args) {
                String name = JOptionPane.showInputDialog(null, "Enter your full name", "Voting Validator",
                                JOptionPane.QUESTION_MESSAGE); // will output as string
                JOptionPane.showMessageDialog(null, "Hello, " + name, "Voting Validator", JOptionPane.PLAIN_MESSAGE);

                int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?", "Voting Validator",
                                JOptionPane.QUESTION_MESSAGE));

                if (age < 18)
                        JOptionPane.showMessageDialog(null, "Sorry, you can not vote yet.", "Voting Validator",
                                        JOptionPane.INFORMATION_MESSAGE);
                else
                        JOptionPane.showMessageDialog(null, "Congratulations! You can vote now.", "Voting Validator",
                                        JOptionPane.INFORMATION_MESSAGE);
        }
}