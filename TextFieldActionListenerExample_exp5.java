import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldActionListenerExample_exp5 extends JFrame {

    public TextFieldActionListenerExample_exp5() {
        setTitle("TextField with ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a text field
        JTextField textField = new JTextField(20);

        // Create a label to display the text entered in the text field
        JLabel resultLabel = new JLabel("Result:");

        // Create a button to clear the text field
        JButton clearButton = new JButton("Clear");

        // Create an action listener for the text field
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the enter key is pressed in the text field, this method is called
                String text = textField.getText(); // Get the text entered in the text field
                resultLabel.setText("Result: " + text); // Update the label with the entered text
            }
        });

        // Create an action listener for the clear button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the clear button is clicked, this method is called
                textField.setText(""); // Clear the text field
                resultLabel.setText("Result:"); // Clear the label
            }
        });

        // Create a panel and add components to it
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(textField);
        panel.add(resultLabel);
        panel.add(clearButton);

        // Add the panel to the frame
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextFieldActionListenerExample_exp5::new);
    }
}
