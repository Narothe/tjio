package org.example

class LunarRover {
    int originalPositionX
    int originalPositionY
    int positionX
    int positionY
    int orientation = 0

    LunarRover(int startX, int startY) {
        originalPositionX = startX
        originalPositionY = startY
        positionX = startX
        positionY = startY
    }

    int move(String direction, int fields) {
        if (direction == 'forward') {
            positionY += fields
        } else if (direction == 'backward') {
            positionY -= fields
        }
        return positionY
    }

    String rotate(String direction) {
        return 'no traditional turning mechanism'
    }

    int rotateAroundOwnAxis(String direction) {
        if (direction == 'left') {
            orientation -= 90
        } else if (direction == 'right') {
            orientation += 90
        }
        return orientation
    }

    void resetPosition() {
        positionX = originalPositionX
        positionY = originalPositionY
    }

    int getPositionX() {
        return positionX
    }

    int getPositionY() {
        return positionY
    }
}
