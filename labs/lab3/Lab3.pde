/** Adam Mellan */
/** CSC220-02   */
/** Lab 3       */

int x1,y1,w1,h1;
int x2,y2,w2,h2;
int randColorR1, randColorG1, randColorB1;
int randColorR2, randColorG2, randColorB2;
boolean isFaceSmiling1;
boolean isFaceSmiling2;
boolean movingRight;

void setup() {
  background(255);
  size(500,500);
  isFaceSmiling1 = true;
  isFaceSmiling2 = true;
  movingRight = true;
  randColorR1 = randomRGBValue();
  randColorG1 = randomRGBValue();
  randColorB1 = randomRGBValue();
  
  randColorR2 = randomRGBValue();
  randColorG2 = randomRGBValue();
  randColorB2 = randomRGBValue();
  
  w1 = (int)random(25,251);
  h1 = w1;
  x1 = (int)random(1+(w1/2),501-(w1/2));
  y1 = (int)random(1+(h1/2),501-(h1/2));
  drawSmileyFace(x1,y1,w1,h1,isFaceSmiling1);
  
  w2 = (int)random(25,251);
  h2 = w2;
  x2 = (int)random(1+(w2/2),501-(w2/2));
  y2 = (int)random(1+(h2/2),501-(h2/2));
  drawSmileyFace(x2,y2,w2,h2,isFaceSmiling2);
}

void draw() {
  background(255);
  text("Adam Mellan",25,475);
  
  if (movingRight) {
    drawSmileyFace(x1++,y1,w1,h1,isFaceSmiling1);
    drawSmileyFace(x2++,y2,w2,h2,isFaceSmiling2);
  } else {
    drawSmileyFace(x1--,y1,w1,h1,isFaceSmiling1);
    drawSmileyFace(x2--,y2,w2,h2,isFaceSmiling2);
  }
  wrapAroundTheScreen();
  determineIfMouseIsOverAFace();
}

void drawSmileyFace(int x, int y, int w, int h, boolean isSmiling) {
  fill(randColorR1, randColorG1, randColorB1);
  ellipse(x,y,w,h);
  fill(randColorR2, randColorG2, randColorB2);
  ellipse(x-(w/5),y-(h/5),w/4,h/4);
  ellipse(x+(w/5),y-(h/5),w/4,h/4);
  
  // Draw smile/frown
  if (isSmiling) {
    // Smile
    arc(x,y+(h/10),w/2,h/2,0,PI);
  } else {
    // Frown
    arc(x,y+(h/4),w/2,h/2,PI,2*PI);
  }
}

void keyPressed() {
  // Random color for face
  randColorR1 = randomRGBValue();
  randColorG1 = randomRGBValue();
  randColorB1 = randomRGBValue();
  
  // Random color for eyes and mouth
  randColorR2 = randomRGBValue();
  randColorG2 = randomRGBValue();
  randColorB2 = randomRGBValue();
  
  // Determine if user pressed the left or right arrow key
  if (keyCode == LEFT) {
    // Move faces left
    movingRight = false;
  } else if (keyCode == RIGHT) {
    // Move faces right
    movingRight = true;
  }
}

int randomRGBValue() {
  return (int)random(1,256);
}

void wrapAroundTheScreen() {
  if (movingRight) {
    while (x1-(w1/2) >= width) {
      x1 = -(w1/2);
    }
  
    while (x2-(w2/2) >= width) {
      x2 = -(w2/2);
    }
  } else {
    while (x1+(w1/2) <= 0) {
      x1 = width+(w1/2);
  }
  
    while (x2+(w2/2) <= 0) {
      x2 = width+(w2/2);
    }
  }
}

void determineIfMouseIsOverAFace() {
  if (mouseX >= x1-(w1/2) && mouseX <= x1+(w1/2) && mouseY >= y1-(h1/2) && mouseY <= y1+(h1/2)) {
    isFaceSmiling1 = false;
  } else {
    isFaceSmiling1 = true;
  }
  
  if (mouseX >= x2-(w2/2) && mouseX <= x2+(w2/2) && mouseY >= y2-(h2/2) && mouseY <= y2+(h2/2)) {
    isFaceSmiling2 = false;
  } else {
    isFaceSmiling2 = true;
  }
}