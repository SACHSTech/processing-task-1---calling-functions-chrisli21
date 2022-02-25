import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
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
    fill(255, 251, 0);

    rect(200, 290, 50, 50);
    fill(255, 251, 0);

    rect(270, 290, 50, 50);
    fill(255, 251, 0);

  // Sun
    ellipse(460, 50, 150, 150);
    fill(38, 0, 255);

  // House
    rect(120, 240, 220, 220);
    fill(0,0,0);

  // Grass
    rect(0, 450, 500, 70);
    fill(0, 156, 23);

  // Pathway
    rect(200,440,70,80);
    fill(255, 0, 0);

  // Roof
    triangle(80, 240, 250, 130, 380, 250);
    fill(0, 0, 0);
    
    
    
  }
  
  // define other methods down here.
}