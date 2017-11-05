// RED GHOST
void moveRedGhostLeft() {
  spriteArray.get(1).setSpeed(ghostSpeed, convertDegreesToRadians(180));
  if (!isPacManInvincible) {
    spriteArray.get(1).setFrameSequence(20, 21, gifSpeed);
  } else {
    spriteArray.get(1).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveRedGhostRight() {
  spriteArray.get(1).setSpeed(ghostSpeed, convertDegreesToRadians(0));
  if (!isPacManInvincible) {
    spriteArray.get(1).setFrameSequence(22, 23, gifSpeed);
  } else {
    spriteArray.get(1).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveRedGhostUp() {
  spriteArray.get(1).setSpeed(ghostSpeed, convertDegreesToRadians(270));
  if (!isPacManInvincible) {
    spriteArray.get(1).setFrameSequence(16, 17, gifSpeed);
  } else {
    spriteArray.get(1).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveRedGhostDown() {
  spriteArray.get(1).setSpeed(ghostSpeed, convertDegreesToRadians(90));
  if (!isPacManInvincible) {
    spriteArray.get(1).setFrameSequence(18, 19, gifSpeed);
  } else {
    spriteArray.get(1).setFrameSequence(12, 13, gifSpeed);
  }
}

// PINK GHOST
void movePinkGhostLeft() {
  spriteArray.get(2).setSpeed(ghostSpeed, convertDegreesToRadians(180));
  if (!isPacManInvincible) {
    spriteArray.get(2).setFrameSequence(28, 29, gifSpeed);
  } else {
    spriteArray.get(2).setFrameSequence(12, 13, gifSpeed);
  }
}

void movePinkGhostRight() {
  spriteArray.get(2).setSpeed(ghostSpeed, convertDegreesToRadians(0));
  if (!isPacManInvincible) {
    spriteArray.get(2).setFrameSequence(30, 31, gifSpeed);
  } else {
    spriteArray.get(2).setFrameSequence(12, 13, gifSpeed);
  }
}

void movePinkGhostUp() {
  spriteArray.get(2).setSpeed(ghostSpeed, convertDegreesToRadians(270));
  if (!isPacManInvincible) {
    spriteArray.get(2).setFrameSequence(24, 25, gifSpeed);
  } else {
    spriteArray.get(2).setFrameSequence(12, 13, gifSpeed);
  }
}

void movePinkGhostDown() {
  spriteArray.get(2).setSpeed(ghostSpeed, convertDegreesToRadians(90));
  if (!isPacManInvincible) {
    spriteArray.get(2).setFrameSequence(26, 27, gifSpeed);
  } else {
    spriteArray.get(2).setFrameSequence(12, 13, gifSpeed);
  }
}

// BLUE GHOST
void moveBlueGhostLeft() {
  spriteArray.get(3).setSpeed(ghostSpeed, convertDegreesToRadians(180));
  if (!isPacManInvincible) {
    spriteArray.get(3).setFrameSequence(36, 37, gifSpeed);
  } else {
    spriteArray.get(3).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveBlueGhostRight() {
  spriteArray.get(3).setSpeed(ghostSpeed, convertDegreesToRadians(0));
  if (!isPacManInvincible) {
    spriteArray.get(3).setFrameSequence(38, 39, gifSpeed);
  } else {
    spriteArray.get(3).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveBlueGhostUp() {
  spriteArray.get(3).setSpeed(ghostSpeed, convertDegreesToRadians(270));
  if (!isPacManInvincible) {
    spriteArray.get(3).setFrameSequence(32, 33, gifSpeed);
  } else {
    spriteArray.get(3).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveBlueGhostDown() {
  spriteArray.get(3).setSpeed(ghostSpeed, convertDegreesToRadians(90));
  if (!isPacManInvincible) {
    spriteArray.get(3).setFrameSequence(34, 35, gifSpeed);
  } else {
    spriteArray.get(3).setFrameSequence(12, 13, gifSpeed);
  }
}

// TAN GHOST
void moveTanGhostLeft() {
  spriteArray.get(4).setSpeed(ghostSpeed, convertDegreesToRadians(180));
  if (!isPacManInvincible) {
    spriteArray.get(4).setFrameSequence(44, 45, gifSpeed);
  } else {
    spriteArray.get(4).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveTanGhostRight() {
  spriteArray.get(4).setSpeed(ghostSpeed, convertDegreesToRadians(0));
  if (!isPacManInvincible) {
    spriteArray.get(4).setFrameSequence(46, 47, gifSpeed);
  } else {
    spriteArray.get(4).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveTanGhostUp() {
  spriteArray.get(4).setSpeed(ghostSpeed, convertDegreesToRadians(270));
  if (!isPacManInvincible) {
    spriteArray.get(4).setFrameSequence(40, 41, gifSpeed);
  } else {
    spriteArray.get(4).setFrameSequence(12, 13, gifSpeed);
  }
}

void moveTanGhostDown() {
  spriteArray.get(4).setSpeed(ghostSpeed, convertDegreesToRadians(90));
  if (!isPacManInvincible) {
    spriteArray.get(4).setFrameSequence(42, 43, gifSpeed);
  } else {
    spriteArray.get(4).setFrameSequence(12, 13, gifSpeed);
  }
}