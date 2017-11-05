/** Adam Mellan */
/** CS220-02    */
/** Lab 2       */

void setup () {
  size(500,500);
  background(255);
  int numOfShapes = (int)random(1,501);
  
  // Spawn a random number of shapes
  for (int x = 0; x <= numOfShapes; x++) {
    int randShape = (int)random(1,3);
    int randLetter = (int)random(1,27);
    int randW = (int)random(20,100);
    int randH = (int)random(20,100);
    int randX = (int)random(0+randW/2,501-randW/2);
    int randY = (int)random(0+randH/2,501-randH/2);
    
    drawShapeWithLetterInside(randX, randY, randW, randH, randShape, randLetter);
  }
}

void drawShapeWithLetterInside(int x, int y, int w, int h, int shapePicker, int letterPicker) {
  int randLetterColorR = (int)random(1,256);
  int randLetterColorG = (int)random(1,256);
  int randLetterColorB = (int)random(1,256);
  int randShapeColorR = (int)random(1,256);
  int randShapeColorG = (int)random(1,256);
  int randShapeColorB = (int)random(1,256);
  textSize(12);
  
  // Choose between an ellipse and a rectangle and spawn that shape
  if (shapePicker == 1) {
    fill(randShapeColorR, randShapeColorG, randShapeColorB);
    ellipse(x,y,w,w);
    fill(randLetterColorR,randLetterColorG,randLetterColorB);
    text(alphabet(3),x,y);
  } else {
    fill(randShapeColorR, randShapeColorG, randShapeColorB);
    rect(x,y,w,h);
    fill(randLetterColorR,randLetterColorG,randLetterColorB);
    text(alphabet(letterPicker),x+w/2,y+h/2);
  }
}

// Create an alphabet array
char alphabet(int x) {
  char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  char letter = alphabetArray[x-1];
  
  return letter;
}

// Spawn a letter with a random color at the mouse position
void draw() {
  int randLetterColorR = (int)random(1,256);
  int randLetterColorG = (int)random(1,256);
  int randLetterColorB = (int)random(1,256);
  int randLetter = (int)random(1,27);
  
  fill(randLetterColorR,randLetterColorG,randLetterColorB);
  text(alphabet(randLetter),mouseX,mouseY);
}