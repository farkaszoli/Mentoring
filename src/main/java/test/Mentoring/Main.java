package test.Mentoring;
import java.awt.*;

import javax.swing.*;

import model.Book;

public class Main {

	public static void main(String[] asdg) throws IllegalArgumentException, IllegalAccessException {

		JFrame frame = new JFrame("asdf");
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Book lotr = new Book();
		lotr.setAuthor("Tolkien");
		lotr.setTitle("LOTR");
		
		frame.setLayout(new FlowLayout());
				
		frame.add(new Panel(lotr));
		
		
		frame.validate();
	}
}
