package com.snake_and_ladder.model;

import static com.snake_and_ladder.OutputWriter.printWithNewLine;

public class Cell {
    private final int number;
    private Cell snake;
    private Cell ladder;

    public Cell(int number) {
        this.number = number;
        this.snake = null;
        this.ladder = null;
    }

    public void setSnake(Cell snake) {
        this.snake = snake;
    }

    public void setLadder(Cell ladder) {
        this.ladder = ladder;
    }

    public Cell processSnakeAndLadder() {
        return this.processSnake().processLadder();
    }

    private Cell processSnake() {
        Cell cell = this;
        while (cell.snake != null) {
            printWithNewLine("Caught Snake at position: " + cell.number);
            cell = cell.snake;
        }
        return cell;
    }

    private Cell processLadder() {
        Cell cell = this;
        while (cell.ladder != null) {
            printWithNewLine("Caught Ladder at position: " + cell.number);
            cell = cell.ladder;
        }
        return cell;
    }

    public int getNumber() {
        return number;
    }
}
