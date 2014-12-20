/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess3d;

import java.util.ArrayList;

/**
 *
 * @author mherber2
 */
public abstract class ChessPiece {
    
    private Position position;
    private ArrayList<Position> availableMoves = new ArrayList<>();

    public void setPosition(Position position){
        this.position=position;
        calculateMoves();
    }
    
    public Position getPosition(){
        return position;
    }
    
    public abstract String getDisplayImage();
    public abstract void calculateMoves();
}
