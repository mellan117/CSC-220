// Wall Array
List<Sprite> wallArray;

// Top border sprites
Sprite borderTopHBar;
Sprite borderTopRightVBar;
Sprite borderTopLeftVBar;
Sprite borderTopMiddleVBar;
Sprite borderTopLeftBoxTopHBar;
Sprite borderTopLeftBoxMiddleVBar;
Sprite borderTopLeftBoxBottomHBar;
Sprite borderTopRightBoxTopHBar;
Sprite borderTopRightBoxMiddleVBar;
Sprite borderTopRightBoxBottomHBar;

// Bottom border sprites
Sprite borderBottomLeftBoxTopHBar;
Sprite borderBottomLeftBoxMiddleVBar;
Sprite borderBottomLeftBoxBottomHBar;
Sprite borderBottomRightBoxTopHBar;
Sprite borderBottomRightBoxMiddleVBar;
Sprite borderBottomRightBoxBottomHBar;
Sprite borderBottomLeftVBar;
Sprite borderBottomRightVBar;
Sprite borderBottomLeftMiddleHBar;
Sprite borderBottomRightMiddleHBar;
Sprite borderBottomHBar;

// Middle box sprite
Sprite middleBoxTopHBar;
Sprite middleBoxBottomHBar;
Sprite middleBoxLeftVBar;
Sprite middleBoxRightVBar;
Sprite middleBoxTopLeftGateHBar;
Sprite middleBoxTopRightGateHBar;

void initWalls() {
  // Init wallArray
  wallArray = new ArrayList<Sprite>();
  
  // Top border
  borderTopHBar = new Sprite(this, "borderTopAndBottomHBar.png", 0);
  borderTopHBar.setXY(width/2,65);
  wallArray.add(borderTopHBar);
  
  borderBottomHBar = new Sprite(this, "borderTopAndBottomHBar.png", 0);
  borderBottomHBar.setXY(width/2,height-2-(borderBottomHBar.getHeight()/2));
  wallArray.add(borderBottomHBar);
  
  borderTopLeftVBar = new Sprite(this, "borderTopLeftAndRightVBar.png", 0);
  borderTopLeftVBar.setXY(borderTopLeftVBar.getWidth()/2, 155);
  wallArray.add(borderTopLeftVBar);
  
  borderTopRightVBar = new Sprite(this, "borderTopLeftAndRightVBar.png", 0);
  borderTopRightVBar.setXY(width-(borderTopRightVBar.getWidth()/2), 155);
  wallArray.add(borderTopRightVBar);
  
  borderTopMiddleVBar = new Sprite(this, "borderTopMiddleVBar.png", 0);
  borderTopMiddleVBar.setXY(width/2,(borderTopMiddleVBar.getHeight()/2)+55);
  wallArray.add(borderTopMiddleVBar);
  
  borderTopLeftBoxTopHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderTopLeftBoxTopHBar.setXY(borderTopLeftBoxTopHBar.getWidth()/2, 245);
  wallArray.add(borderTopLeftBoxTopHBar);
  
  borderTopLeftBoxMiddleVBar = new Sprite(this, "borderBoxVBar.png", 10);
  borderTopLeftBoxMiddleVBar.setXY(110, 285);
  wallArray.add(borderTopLeftBoxMiddleVBar);
  
  borderTopLeftBoxBottomHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderTopLeftBoxBottomHBar.setXY(borderTopLeftBoxBottomHBar.getWidth()/2, 322);
  wallArray.add(borderTopLeftBoxBottomHBar);
  
  borderTopRightBoxTopHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderTopRightBoxTopHBar.setXY(width-(borderTopRightBoxTopHBar.getWidth()/2), 245);
  wallArray.add(borderTopRightBoxTopHBar);
  
  borderTopRightBoxMiddleVBar = new Sprite(this, "borderBoxVBar.png", 0);
  borderTopRightBoxMiddleVBar.setXY(460, 285);
  wallArray.add(borderTopRightBoxMiddleVBar);
  
  borderTopRightBoxBottomHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderTopRightBoxBottomHBar.setXY((width-borderTopRightBoxBottomHBar.getWidth()/2), 322);
  wallArray.add(borderTopRightBoxBottomHBar);
  
  // Bottom border
  borderBottomLeftBoxTopHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderBottomLeftBoxTopHBar.setXY(borderBottomLeftBoxTopHBar.getWidth()/2, 400);
  wallArray.add(borderBottomLeftBoxTopHBar);
  
  borderBottomLeftBoxMiddleVBar = new Sprite(this, "borderBoxVBar.png", 0);
  borderBottomLeftBoxMiddleVBar.setXY(110, 440);
  wallArray.add(borderBottomLeftBoxMiddleVBar);
  
  borderBottomLeftBoxBottomHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderBottomLeftBoxBottomHBar.setXY(borderBottomLeftBoxBottomHBar.getWidth()/2, 477);
  wallArray.add(borderBottomLeftBoxBottomHBar);
  
  borderBottomRightBoxTopHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderBottomRightBoxTopHBar.setXY(width-(borderBottomRightBoxTopHBar.getWidth()/2), 400);
  wallArray.add(borderBottomRightBoxTopHBar);
  
  borderBottomRightBoxMiddleVBar = new Sprite(this, "borderBoxVBar.png", 0);
  borderBottomRightBoxMiddleVBar.setXY(460, 440);
  wallArray.add(borderBottomRightBoxMiddleVBar);
  
  borderBottomRightBoxBottomHBar = new Sprite(this, "borderBoxHBar.png", 0);
  borderBottomRightBoxBottomHBar.setXY((width-borderBottomRightBoxBottomHBar.getWidth()/2), 477);
  wallArray.add(borderBottomRightBoxBottomHBar);
  
  borderBottomLeftVBar = new Sprite(this, "borderBottomLeftAndRightVBar.png", 0);
  borderBottomLeftVBar.setXY(borderBottomLeftVBar.getWidth()/2, 595);
  wallArray.add(borderBottomLeftVBar);
  
  borderBottomRightVBar = new Sprite(this, "borderBottomLeftAndRightVBar.png", 0);
  borderBottomRightVBar.setXY(width-(borderBottomRightVBar.getWidth()/2), 595);
  wallArray.add(borderBottomRightVBar);
  
  borderBottomLeftMiddleHBar = new Sprite(this, "borderBottomLeftAndRightMiddleHBar.png", 0);
  borderBottomLeftMiddleHBar.setXY(borderBottomLeftMiddleHBar.getWidth()/2, 595);
  wallArray.add(borderBottomLeftMiddleHBar);
  
  borderBottomRightMiddleHBar = new Sprite(this, "borderBottomLeftAndRightMiddleHBar.png", 0);
  borderBottomRightMiddleHBar.setXY(width-(borderBottomRightMiddleHBar.getWidth()/2), 595);
  wallArray.add(borderBottomRightMiddleHBar);
  
  // Middle Box
  middleBoxTopHBar = new Sprite(this, "middleBoxTopHBar.png", 0);
  middleBoxTopHBar.setXY(width/2, (height/2)-105);
  //wallArray.add(middleBoxTopHBar);
  
  middleBoxBottomHBar = new Sprite(this, "middleBoxBottomHBar.png", 0);
  middleBoxBottomHBar.setXY(width/2, (height/2)+50);
  wallArray.add(middleBoxBottomHBar);
  
  middleBoxLeftVBar = new Sprite(this, "middleBoxVBar.png", 0);
  middleBoxLeftVBar.setXY(middleBoxBottomHBar.getX()-(middleBoxBottomHBar.getWidth()/2)+(middleBoxLeftVBar.getWidth()/2)+2, middleBoxBottomHBar.getY()-(middleBoxLeftVBar.getHeight()/2)+10);
  wallArray.add(middleBoxLeftVBar);
  
  middleBoxRightVBar = new Sprite(this, "middleBoxVBar.png", 0);
  middleBoxRightVBar.setXY(middleBoxBottomHBar.getX()+(middleBoxBottomHBar.getWidth()/2)-(middleBoxRightVBar.getWidth()/2)-2, middleBoxBottomHBar.getY()-(middleBoxLeftVBar.getHeight()/2)+10);
  wallArray.add(middleBoxRightVBar);
  
  middleBoxTopLeftGateHBar = new Sprite(this, "middleBoxTopLeftAndRightGateHBar.png", 0);
  middleBoxTopLeftGateHBar.setXY(middleBoxLeftVBar.getX()+(middleBoxTopLeftGateHBar.getWidth()/2)-(middleBoxLeftVBar.getWidth()/2), middleBoxLeftVBar.getY()-(middleBoxLeftVBar.getHeight()/2)+(middleBoxTopLeftGateHBar.getHeight()/2));
  wallArray.add(middleBoxTopLeftGateHBar);
  
  middleBoxTopRightGateHBar = new Sprite(this, "middleBoxTopLeftAndRightGateHBar.png", 0);
  middleBoxTopRightGateHBar.setXY(middleBoxRightVBar.getX()-(middleBoxTopRightGateHBar.getWidth()/2)+(middleBoxRightVBar.getWidth()/2), middleBoxRightVBar.getY()-(middleBoxRightVBar.getHeight()/2)+(middleBoxTopRightGateHBar.getHeight()/2));
  wallArray.add(middleBoxTopRightGateHBar);
  
}

void collisionDetection() {
  for (Sprite character : spriteArray) {
    for (Sprite wall : wallArray) {
      // Check if a character hit a wall
      if (wall.bb_collision(character)) {
        // Check if the character is PacMan
        if (spriteArray.indexOf(character) == 0) {
          // Determine the direction of PacMan
          if ((int)character.getDirection() == 0) {
            // PacMan was moving right
            // Stop PacMan
            character.setSpeed(0);
            character.setX(character.getX()-5);
          } else if ((int)character.getDirection() == 3) {
            // PacMan was moving left
            // Stop PacMan
            character.setSpeed(0);
            character.setX(character.getX()+5);
          } else if ((int)character.getDirection() == -1) {
            // PacMan was moving up
            // Stop PacMan
            character.setSpeed(0);
            character.setY(character.getY()+5);
          } else if ((int)character.getDirection() == 1) {
            // PacMan was moving down
            // Stop PacMan
            character.setSpeed(0);
            character.setY(character.getY()-5);
          }
        } else {
          // Character is a ghost
          // Check if ghosts are in the middle box
            if (character.getX() > middleBoxLeftVBar.getX() && character.getX() < middleBoxRightVBar.getX() && character.getY() < middleBoxBottomHBar.getY() && character.getY() > middleBoxTopHBar.getY()) {
              character.setSpeed(0);
              
              // Determine the direction that the ghosts are moving in the box
              if ((int)character.getDirection() == 0) {
                // Ghosts were moving right
                character.setX(character.getX()-5);
                character.setSpeed(ghostSpeed,convertDegreesToRadians(180));
              
                if (spriteArray.indexOf(character) == 2) {
                  // Change PINK ghost direction
                  character.setFrameSequence(28,29,gifSpeed);
                } else if (spriteArray.indexOf(character) == 3) {
                  // Change BLUE ghost direction
                  character.setFrameSequence(36,37,gifSpeed);
                } else if (spriteArray.indexOf(character) == 4) {
                  // Change TAN ghost direction
                  character.setFrameSequence(44,45,gifSpeed);
                }
              } else if ((int)character.getDirection() == 3) {
                // Ghosts were moving left
                character.setX(character.getX()+5);
                character.setSpeed(ghostSpeed,convertDegreesToRadians(0));
              
                if (spriteArray.indexOf(character) == 2) {
                  // Change PINK ghost direction
                  character.setFrameSequence(30,31,gifSpeed);
                } else if (spriteArray.indexOf(character) == 3) {
                  // Change BLUE ghost direction
                  character.setFrameSequence(38,39,gifSpeed);
                } else if (spriteArray.indexOf(character) == 4) {
                  // Change TAN ghost direction
                  character.setFrameSequence(46,47,gifSpeed);
                }
              }
              
            } else {
              // Determine the direction of the ghost
              if ((int)character.getDirection() == 0) {
                // The ghost was moving right
                // Stop the ghost
                character.setSpeed(0);
                character.setX(character.getX()-5);
              } else if ((int)character.getDirection() == 3) {
                // The ghost was moving left
                // Stop the ghost
                character.setSpeed(0);
                character.setX(character.getX()+5);
              } else if ((int)character.getDirection() == -1) {
                // The ghost was moving up
                // Stop the ghost
                character.setSpeed(0);
                character.setY(character.getY()+5);
              } else if ((int)character.getDirection() == 1) {
                // The ghost was moving down
                // Stop the ghost
                character.setSpeed(0);
                character.setY(character.getY()-5);
              }
              
              // Create a random direction variable
              // 1 = right
              // 2 = left
              // 3 = up
              // 4 = down
              int randDirection;
              
              // Determine which ghost hit the wall and randomly change direction(not inside middle box)
              if(spriteArray.indexOf(character) == 1) {
                // RED ghost
                randDirection = (int)random(1,5);
                if (randDirection == 1) {
                  // Move RED ghost right
                  moveRedGhostRight();
                } else if (randDirection == 2) {
                  // Move RED ghost left
                  moveRedGhostLeft();
                } else if (randDirection == 3) {
                  // Move RED ghost up
                  moveRedGhostUp();
                } else if (randDirection == 4) {
                  // Move RED ghost down
                  moveRedGhostDown();
                }
              } else if (spriteArray.indexOf(character) == 2) {
                // PINK ghost
                // Has the PINK Ghost left the box already?
                if (isPinkGhostLeavingBox) {
                  randDirection = (int)random(1,5);
                } else {
                  randDirection = (int)random(1,3);
                }
                
                if (randDirection == 1) {
                  // Move PINK ghost right
                  isPinkGhostLeavingBox = true;
                  movePinkGhostRight();
                } else if (randDirection == 2) {
                  // Move PINK ghost left
                  isPinkGhostLeavingBox = true;
                  movePinkGhostLeft();
                } else if (randDirection == 3) {
                  // Move PINK ghost up
                  movePinkGhostUp();
                } else if (randDirection == 4) {
                  // Move PINK ghost down
                  movePinkGhostDown();
                }
              } else if (spriteArray.indexOf(character) == 3) {
                // BLUE ghost
                // Has the BLUE Ghost left the box already?
                if (isBlueGhostLeavingBox) {
                  randDirection = (int)random(1,5);
                } else {
                  randDirection = (int)random(1,3);
                }
                
                if (randDirection == 1) {
                  // Move BLUE ghost right
                  isBlueGhostLeavingBox = true;
                  moveBlueGhostRight();
                } else if (randDirection == 2) {
                  // Move BLUE ghost left
                  isBlueGhostLeavingBox = true;
                  moveBlueGhostLeft();
                } else if (randDirection == 3) {
                  // Move BLUE ghost up
                  moveBlueGhostUp();
                } else if (randDirection == 4) {
                  // Move BLUE ghost down
                  moveBlueGhostDown();
                }
              } else if (spriteArray.indexOf(character) == 4) {
                // TAN ghost
                // Has the TAN Ghost left the box already?
                if (isTanGhostLeavingBox) {
                  randDirection = (int)random(1,5);
                } else {
                  randDirection = (int)random(1,3);
                }
                
                if (randDirection == 1) {
                  // Move TAN ghost right
                  isTanGhostLeavingBox = true;
                  moveTanGhostRight();
                } else if (randDirection == 2) {
                  // Move TAN ghost left
                  isTanGhostLeavingBox = true;
                  moveTanGhostLeft();
                } else if (randDirection == 3) {
                  // Move TAN ghost up
                  moveTanGhostUp();
                } else if (randDirection == 4) {
                  // Move TAN ghost down
                  moveTanGhostDown();
                }
              }
            }
        }
      }
    }
  }
}