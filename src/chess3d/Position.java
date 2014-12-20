/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess3d;

/**
 *
 * @author mherber2
 */
public class Position {

    private int level;
    private int row;
    private int column;
    
    public Position(int level){
        this.level = level;
    }
    
    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }
    
    public Position(int row, int column, int level){
        this.level = level;
        this.row = row;
        this.column = column;
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
}
