package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class SwingButton extends JButton implements IButton,ActionListener  {

	private IActionListener listener;

	public SwingButton(IActionListener listener) {
		super("off");
		init(listener);
	}

	@Override
	public void init(IActionListener listener) {
		this.listener = listener;
		addActionListener(this);        
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		listener.action();        
	}

}