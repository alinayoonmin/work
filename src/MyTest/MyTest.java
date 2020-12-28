import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MyTest {
	Work work = new Work();
	
	@Test
	public void Nnn() {
		assertEquals("",work.i, 0);
		work.colorButtonRed.doClick();
		assertEquals("", work.i = 1, 1);
	}
	@Test
	public void Nn2() {
		work.colorButtonGreen.doClick();
		assertEquals("",work.i = 2, 2);
	}
}
