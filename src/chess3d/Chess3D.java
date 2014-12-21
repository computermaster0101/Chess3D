/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess3d;


import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.scene.transform.Rotate.Z_AXIS;

import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author mherber2
 */
public class Chess3D extends Application{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene(root, 700, 700, Color.GHOSTWHITE);

        final Group gameArea = new Group();

        gameArea.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isPrimaryButtonDown()){

                }
            }
        });

        root.getChildren().add(gameArea);
        
        for(int board = 0;board < 5;board++){
            ChessBoard chessBoard = new ChessBoard();
            //chessBoard.getTransforms().add(new Rotate(45,250,250));

            //chessBoard.getTransforms().add(new Rotate(0, Rotate.Z_AXIS));
            //chessBoard.getTransforms().add(new Rotate(0, Rotate.Y_AXIS));
            //chessBoard.getTransforms().add(new Rotate(0, Rotate.X_AXIS));

            chessBoard.getTransforms().add(new Rotate(45, new Point3D(1,1,1)));

            gameArea.getChildren().add(chessBoard);
        }   
        
        primaryStage.setScene(scene);        
        primaryStage.show();
    }
    
}
