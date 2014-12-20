/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess3d;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 *
 * @author mherber2
 */
public class ChessBoardSquare extends Rectangle{
    
    final private Color color1 = Color.BLACK;
    final private Color color2 = Color.LIGHTGRAY;
    
    private int squareNumber;
    private int squareSize;
    private int row;
    private int column;
    private boolean hasPiece;
    
    public ChessBoardSquare() {
        this.setArcHeight(20);
        this.setArcWidth(20);
    }

    public ChessBoardSquare(double width, double height) {
        super(width, height);
    }

    public ChessBoardSquare(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public void setSquareNumber(int squareNumber) {
        this.squareNumber = squareNumber;
    }

    public int getSquareSize() {
        return squareSize;
    }

    public void setSquareSize(int squareSize) {
        this.setHeight(squareSize);
        this.setWidth(squareSize);
        this.squareSize = squareSize;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isHasPiece() {
        return hasPiece;
    }

    public void setHasPiece(boolean hasPiece) {
        this.hasPiece = hasPiece;
    }

    public void addColor(int squareNumber) {
        if (squareNumber%2==0){
           super.setFill(color1);
        }else{
           super.setFill(color2);
        }
    }

}
