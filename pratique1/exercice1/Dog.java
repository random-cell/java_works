package exercice1;

import java.applet.Applet;
import java.awt.*;

// Applet code for the "Hello, world!" example.
// This should be saved in a file named as "HelloWorldApp.java".
public class HelloWorldApp extends Applet {
  // This method is mandatory(обязательный), but can be empty (i.e., have no actual code).
  public void init() { }

  // This method is mandatory, but can be empty (i.e., have no actual code).
  public void stop() { }

  public void paint(Graphics g) {
    // Print a message on the screen (x=20, y=10).
    g.drawString("Маша! Здравствуй! Hello, world!", 20, 10);
    // Draws a circle on the screen (x=40, y=30).
    g.drawArc(40, 30, 50, 50, 0, 360);
  }
}