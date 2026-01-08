package edu.brown.cs.board;

import static org.junit.Assert.assertTrue;

import edu.brown.cs.board.entities.Settlement;
import org.junit.Test;

import edu.brown.cs.catan.player.HumanPlayer;
import edu.brown.cs.catan.player.Player;

public class SettlementTest {

  @Test
  public void InitializationTest() {
    Player p = new HumanPlayer(1, "name", "000000");
    Settlement s = new Settlement(p);

    assertTrue(s != null);
    assertTrue(s.getPlayer().equals(p));
  }

}
