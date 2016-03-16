package test.Mentoring;
import java.awt.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

import javax.swing.*;

import annotation.*;
import model.*;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;

	public Panel(Book book) throws IllegalArgumentException, IllegalAccessException {
		setLayout(new FlowLayout());

		buildPanelByModel(book);

		validate();
	}

	private void buildPanelByModel(Book book) throws IllegalArgumentException, IllegalAccessException {
		for (Field field : book.getClass().getDeclaredFields()) {
						
			MyTextField myTextField = field.getDeclaredAnnotation(MyTextField.class);
			
			if (myTextField != null) {
				
				String label = myTextField.label();
				
				if (label.equals("")) {
					field.setAccessible(true);
					Object object = field.get(book);
					System.out.println(object);
					label = (String) object;
				}
				
				add(new JLabel(label));	
			}
			
			// add(new JLabel(getValue(book, myTextField)));
		}
	}

	private String getValue(Book book, MyTextField myTextField) {
		
		return null;
	}

}
