/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess3d;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author mherber2
 */
public class ChessBoard extends Group{

    private int layerNumber = 0;
    private int boardSize = 300;
    private final int padding = 100;

    public ChessBoard() {
       super();
       Rectangle background = new Rectangle(boardSize,boardSize,Color.GRAY);
       background.setX(padding);
       background.setY(padding);
       background.setArcHeight(20);
       background.setArcWidth(20);
       super.getChildren().add(background);
       
       int squareNumber = 0;
       
       for (int row = 0; row < 5; row++){
           for (int column = 0; column < 5; column++){
               ChessBoardSquare chessBoardSquare = new ChessBoardSquare();
               chessBoardSquare.setSquareNumber(squareNumber);
               chessBoardSquare.setSquareSize(boardSize/5);
               chessBoardSquare.setColumn(column);
               chessBoardSquare.setRow(row);
               chessBoardSquare.setHasPiece(false);
               chessBoardSquare.addColor(squareNumber);
               chessBoardSquare.setX(chessBoardSquare.getSquareSize() * row + padding);
               chessBoardSquare.setY(chessBoardSquare.getSquareSize() * column + padding);
               
               super.getChildren().add(chessBoardSquare);
               squareNumber++;
               
           }
       }
     
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSquareSize) {
        this.boardSize = boardSquareSize;
    }
    
    public int getLayerNumber() {
        return layerNumber;
    }

    public void setLayerNumber(int layerNumber) {
        this.layerNumber = layerNumber;
    }
    
}
