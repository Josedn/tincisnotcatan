package edu.brown.cs.board;

import static org.junit.Assert.assertTrue;

import edu.brown.cs.board.entities.Road;
import org.junit.Test;

import edu.brown.cs.catan.player.HumanPlayer;
import edu.brown.cs.catan.player.Player;

public class RoadTest {

  @Test
  public void InitializationTest() {
    Player p = new HumanPlayer(1, "name", "000000");
    Road r = new Road(p);

    assertTrue(r != null);
    assertTrue(r.getPlayer().equals(p));
  }

}
