/** Adam Mellan */
/** CSC220-02   */
/** Project 1   */

import sprites.*;
import sprites.maths.*;
import sprites.utils.*;
import java.util.TimerTask;
import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.util.List;

List<Sprite> spriteArray;
Sprite pacMan;
Sprite redGhost;
Sprite pinkGhost;
Sprite blueGhost;
Sprite tanGhost;

// The keyPressed bools only allow the code to be executed when a different key is pressed
boolean arrowKeyPressedL = false;
boolean arrowKeyPressedR = false;
boolean arrowKeyPressedU = false;
boolean arrowKeyPressedD = false;

boolean isRedGhostLeavingBox = false;
boolean isPinkGhostLeavingBox = false;
boolean isBlueGhostLeavingBox = false;
boolean isTanGhostLeavingBox = false;

boolean isKeyBoardDisabled = false;
boolean isPacManInvincible = false;

double ghostSpeed = 125.0;
double pacManSpeed = 100.0;
double gifSpeed = 0.3;

int ghostsRemaining = 4;

List<Sprite> invincibleDotArray;
StopWatch s = new StopWatch();

void setup() {
  size(570, 725);
  background(0);
  spriteArray = new ArrayList<Sprite>();
  invincibleDotArray = new ArrayList<Sprite>();
  initWalls();
  initCharacters();
  initInvincibleDots();
  
  releaseGhosts();
  // Used to call the run method every 250 milliseconds
  //ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
  //executor.scheduleAtFixedRate(new MyTimeTask(),0,250,TimeUnit.MILLISECONDS);
}

void initCharacters() {
  // Init PacMan
  pacMan = new Sprite(this, "pacManSpriteSheet.png", 4, 2, 2, true);
  pacMan.setXY(width/2, height-150);
  pacMan.setFrameSequence(2, 3, gifSpeed);
  spriteArray.add(pacMan);
  
  // Init RED Ghost
  redGhost = new Sprite(this, "ghostsSpriteSheet.png", 8, 8, 2, true);
  redGhost.setXY(width/2, middleBoxTopHBar.getY()-redGhost.getHeight());
  redGhost.setSpeed(ghostSpeed, convertDegreesToRadians(180));
  redGhost.setFrameSequence(20, 21, gifSpeed);
  redGhost.setScale(0.7);
  spriteArray.add(redGhost);
  
  // Init PINK Ghost
  pinkGhost = new Sprite(this, "ghostsSpriteSheet.png", 8, 8, 2, true);
  pinkGhost.setXY(width/2, middleBoxTopHBar.getY()+(pinkGhost.getHeight()/1.25));
  pinkGhost.setSpeed(ghostSpeed, convertDegreesToRadians(180));
  pinkGhost.setFrameSequence(28, 29, gifSpeed);
  pinkGhost.setScale(0.7);
  spriteArray.add(pinkGhost);
  
  // Init BLUE Ghost
  blueGhost = new Sprite(this, "ghostsSpriteSheet.png", 8, 8, 2, true);
  blueGhost.setXY(width/2, pinkGhost.getY()+(blueGhost.getHeight()/1.25));
  blueGhost.setSpeed(ghostSpeed, convertDegreesToRadians(180));
  blueGhost.setFrameSequence(36, 37, gifSpeed);
  blueGhost.setScale(0.7);
  spriteArray.add(blueGhost);
  
  // Init TAN Ghost
  tanGhost = new Sprite(this, "ghostsSpriteSheet.png", 8, 8, 2, true);
  tanGhost.setXY(width/2, blueGhost.getY()+(tanGhost.getHeight()/1.25));
  tanGhost.setSpeed(ghostSpeed, convertDegreesToRadians(180));
  tanGhost.setFrameSequence(44, 45, gifSpeed);
  tanGhost.setScale(0.7);
  spriteArray.add(tanGhost);
}

void initInvincibleDots() {
  Sprite topLeftDot = new Sprite(this, "invincibleDot.png",2);
  topLeftDot.setScale(1.5);
  topLeftDot.setXY(borderTopHBar.getWidth()/4,borderTopLeftVBar.getY());
  invincibleDotArray.add(topLeftDot);
  
  Sprite topRightDot = new Sprite(this, "invincibleDot.png",2);
  topRightDot.setScale(1.5);
  topRightDot.setXY(3*(borderTopHBar.getWidth()/4),borderTopRightVBar.getY());
  invincibleDotArray.add(topRightDot);
  
  Sprite bottomLeftDot = new Sprite(this, "invincibleDot.png",2);
  bottomLeftDot.setScale(1.5);
  bottomLeftDot.setXY(topLeftDot.getX(),borderBottomLeftMiddleHBar.getY());
  invincibleDotArray.add(bottomLeftDot);
  
  Sprite bottomRightDot = new Sprite(this, "invincibleDot.png",2);
  bottomRightDot.setScale(1.5);
  bottomRightDot.setXY(topRightDot.getX(),borderBottomRightMiddleHBar.getY());
  invincibleDotArray.add(bottomRightDot);
}

void draw() {
  background(0);
  textSize(15);
  text("Ghosts Remaining: "+ghostsRemaining,25,25);
  
  // The white "gate" in the middle box
  stroke(255);
  strokeWeight(5);
  line((int)(middleBoxTopLeftGateHBar.getX()+(middleBoxTopLeftGateHBar.getWidth()/2)-5), (int)(middleBoxTopLeftGateHBar.getY()), (int)(middleBoxTopRightGateHBar.getX()-(middleBoxTopRightGateHBar.getWidth()/2)), (int)(middleBoxTopRightGateHBar.getY()));
  
  // Draw all of the walls
  for (Sprite wall : wallArray) {
    wall.draw();
  }
  
  // Draw all of the characters
  for (Sprite character : spriteArray) {
    character.draw();
  }
  
  // Draw the invincible dots
  for (Sprite invincibleDot : invincibleDotArray) {
    invincibleDot.draw();
  }
  
  // Update sprite positions
  S4P.updateSprites((float) s.getElapsedTime());
  
  S4P.collisionAreasVisible = false;
  
  collisionDetection();
  invincibleDotCollisionDetection();
  characterCollisionDetection();
  wrapPacManAroundScreen();
}
void keyPressed() {
  if (!isKeyBoardDisabled) {
    if (keyCode == LEFT) {
      if (!arrowKeyPressedL) {
        // Move PacMan Left
        spriteArray.get(0).setSpeed(pacManSpeed, convertDegreesToRadians(180));
        spriteArray.get(0).setFrameSequence(0, 1, gifSpeed);
        
        arrowKeyPressedL = true;
        arrowKeyPressedR = false;
        arrowKeyPressedU = false;
        arrowKeyPressedD = false;
      }
    } else if (keyCode == RIGHT) {
      if (!arrowKeyPressedR) {
        // Move PacMan Right
        spriteArray.get(0).setSpeed(pacManSpeed, convertDegreesToRadians(0));
        spriteArray.get(0).setFrameSequence(2, 3, gifSpeed);
        
        arrowKeyPressedL = false;
        arrowKeyPressedR = true;
        arrowKeyPressedU = false;
        arrowKeyPressedD = false;
      }
    } else if (keyCode == UP) {
      if (!arrowKeyPressedU) {
        // Move PacMan Up
        spriteArray.get(0).setSpeed(pacManSpeed, convertDegreesToRadians(270));
        spriteArray.get(0).setFrameSequence(4, 5, gifSpeed);
        
        arrowKeyPressedL = false;
        arrowKeyPressedR = false;
        arrowKeyPressedU = true;
        arrowKeyPressedD = false;
      }
    } else if (keyCode == DOWN) {
      if (!arrowKeyPressedD) {
        // Move PacMan Down
        spriteArray.get(0).setSpeed(pacManSpeed, convertDegreesToRadians(90));
        spriteArray.get(0).setFrameSequence(6, 7, gifSpeed);
        
        arrowKeyPressedL = false;
        arrowKeyPressedR = false;
        arrowKeyPressedU = false;
        arrowKeyPressedD = true;
      }
    }
  }
}

void wrapPacManAroundScreen() {
  if (spriteArray.get(0).getX() < 0 - spriteArray.get(0).getWidth()) {
    // If PacMan was moving left and went off screen
      spriteArray.get(0).setX(width+spriteArray.get(0).getWidth());
    } else if (spriteArray.get(0).getX() > width + spriteArray.get(0).getWidth()) {
      // If PacMan was moving right and went off screen
      spriteArray.get(0).setX(0-spriteArray.get(0).getWidth());
    }
}

void releaseGhosts() {
  // Delay the release of the PINK Ghost
  new Timer().schedule(new TimerTask() {
  @Override
  public void run() {
    System.out.println("PINK Ghost");
    spriteArray.get(2).setSpeed(0);
    spriteArray.get(2).setX(width/2);
    movePinkGhostUp();
  }
 }, 2000);
 
 // Delay the release of the BLUE Ghost
 new Timer().schedule(new TimerTask() {
  @Override
  public void run() {
    System.out.println("BLUE Ghost");
    spriteArray.get(3).setSpeed(0);
    spriteArray.get(3).setX(width/2);
    moveBlueGhostUp();
  }
 }, 4000);
 
 // Delay the release of the TAN Ghost
 new Timer().schedule(new TimerTask() {
  @Override
  public void run() {
    System.out.println("TAN Ghost");
    spriteArray.get(4).setSpeed(0);
    spriteArray.get(4).setX(width/2);
    moveTanGhostUp();
  }
 }, 6000);
}

void invincibleDotCollisionDetection() {
  for (Sprite invincibleDot : invincibleDotArray) {
    if (invincibleDot.bb_collision(spriteArray.get(0))) {
      // Make PacMan Invincible
      isPacManInvincible = true;
      invincibleDot.setDead(true);
    }
  }
}

void characterCollisionDetection() {
  // RED Ghost
  if (spriteArray.get(0).bb_collision(spriteArray.get(1))) {
    if (isPacManInvincible) {
      if (!spriteArray.get(1).isDead()) {
        ghostsRemaining --;
      }
      spriteArray.get(1).setDead(true);
    } else {
      spriteArray.get(0).setDead(true);
    }
  }
  
  // PINK Ghost
  if (spriteArray.get(0).bb_collision(spriteArray.get(2))) {
    if (isPacManInvincible) {
      if (!spriteArray.get(2).isDead()) {
        ghostsRemaining --;
      }
      spriteArray.get(2).setDead(true);
    } else {
      spriteArray.get(0).setDead(true);
    }
  }
  
  // BLUE Ghost
  if (spriteArray.get(0).bb_collision(spriteArray.get(3))) {
    if (isPacManInvincible) {
      if (!spriteArray.get(3).isDead()) {
        ghostsRemaining --;
      }
      spriteArray.get(3).setDead(true);
    } else {
      spriteArray.get(0).setDead(true);
    }
  }
  
  // TAN Ghost
  if (spriteArray.get(0).bb_collision(spriteArray.get(4))) {
    if (isPacManInvincible) {
      if (!spriteArray.get(4).isDead()) {
        ghostsRemaining --;
      }
      spriteArray.get(4).setDead(true);
    } else {
      spriteArray.get(0).setDead(true);
    }
  }
  
  // Game Over
  if (spriteArray.get(1).isDead() && spriteArray.get(2).isDead() && spriteArray.get(3).isDead() && spriteArray.get(4).isDead()) {
    // If all of the ghosts are dead then game over
    gameOver();
  } else if (spriteArray.get(0).isDead()) {
    // If PacMan dead then game over
    gameOver();
  }
}

void gameOver() {
  for (Sprite character : spriteArray) {
    character.setSpeed(0);
  }
  
  isKeyBoardDisabled = true;
  textSize(50);
  text("GAME OVER",(width/2)-150,height/2);
  textSize(15);
}

double convertDegreesToRadians(double degrees) {
  double radians = degrees*(PI/180.0);

  return radians;
}

double convertRadiansToDegrees(double radians) {
  double degrees = radians*(180.0/PI);

  return degrees;
}