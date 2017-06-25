package com.paint.www;

import java.awt.*;
import javax.swing.*;

public class Paint02MainFrame extends JFrame{
	
	Paint03MainPanel mp=new Paint03MainPanel();
	
	public Paint02MainFrame(){
		this.setContentPane(mp);
	}
	
}