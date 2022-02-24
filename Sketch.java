import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(24, 161, 219);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Windows
    rect(130, 290, 50, 50);
    fill(163, 38, 38);

    rect(200, 290, 50, 50);
    fill(163, 38, 38);

  // Sun
    ellipse(460, 50, 150, 150);
    fill(225, 232, 35);

  // House
    rect(120, 240, 220, 220);
    
    
  }
  
  // define other methods down here.
}