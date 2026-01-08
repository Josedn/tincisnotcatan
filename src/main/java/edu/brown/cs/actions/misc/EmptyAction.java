package edu.brown.cs.actions.misc;

import edu.brown.cs.actions.Action;
import edu.brown.cs.actions.ActionResponse;

import java.util.Collections;
import java.util.Map;

/**
 * EmptyAction in order to get game state update.
 *
 * @author anselvahle
 *
 */
public class EmptyAction implements Action {

  @Override
  public Map<Integer, ActionResponse> execute() {
    return Collections.emptyMap();
  }

}
