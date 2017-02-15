package client;

import client.model.*;

import java.util.Random;

/**
 * AI class.
 * You should fill body of the method {@link #doTurn}.
 * Do not change name or modifiers of the methods or fields
 * and do not add constructor for this class.
 * You can add as many methods or fields as you want!
 * Use world parameter to access and modify game's
 * world!
 * See World interface for more details.
 */
public class AI {

    public static void distance(Beetle a , int rowDest , int colDest){
        int t = 0;
        int rowDef = Math.abs(rowDest - a.getRow());
        int colDef = Math.abs(colDest - a.getColumn());
        t += row

    }

    public void doTurn(World game) {
        // fill this method, we've presented a stupid AI for example!
        System.out.println(game.getCurrentTurn());
        Random rand = new Random();


        Cell[][] cells = game.getMap().getCells();

        if (game.getCurrentTurn() == 0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 3; k++) {
                        game.changeStrategy(BeetleType.LOW, CellState.values()[i], CellState.values()[j], CellState.values()[k], Move.values()[1]);
                        game.changeStrategy(BeetleType.HIGH, CellState.values()[i], CellState.values()[j], CellState.values()[k], Move.values()[1]);
                    }
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    Random r = new Random();
                    int kk = r.nextInt() % 3;
                    while(kk<0) kk+=3;
                    game.changeStrategy(BeetleType.LOW, CellState.values()[i], CellState.values()[j], CellState.values()[k], Move.values()[kk]);
                    game.changeStrategy(BeetleType.HIGH, CellState.values()[i], CellState.values()[j], CellState.values()[k], Move.values()[kk]);
                }
            }
        }
        }

    }

}
