/** Adam Mellan */
/** CS220-02    */
/** Lab 2       */

void setup () {
  size(500,500);
  background(255);
  fill(0);
  text("Adam Mellan",10,490);
}

void draw() {
}

void mousePressed() {
  // Create random size and random colors
  int randW = (int)random(25,200);
  int randColorR = (int)random(1,255);
  int randColorG = (int)random(1,255);
  int randColorB = (int)random(1,255);
  
  drawTruck(randW, randColorR, randColorG, randColorB);
}

void drawTruck(int randRectW, int randR, int randG, int randB) {
  // Wheels
  noStroke();
  fill(0);
  ellipse(mouseX+(0.25*randRectW), mouseY+randRectW/2, randRectW/3, randRectW/3);
  ellipse(mouseX+(0.75*randRectW), mouseY+randRectW/2, randRectW/3, randRectW/3);
  
  // Body
  fill(randR, randG, randB);
  rect(mouseX, mouseY, randRectW, randRectW/2);
  rect(mouseX-randRectW/4, mouseY+randRectW/4, (mouseX)-(mouseX-randRectW/4), (mouseY+randRectW/4)-(mouseY));
  
  // Window
  fill(255);
  stroke(0);
  triangle(mouseX-randRectW/4, mouseY+randRectW/4, mouseX, mouseY, mouseX, mouseY+randRectW/4);
}