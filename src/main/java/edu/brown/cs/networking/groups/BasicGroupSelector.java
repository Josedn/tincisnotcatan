package edu.brown.cs.networking.groups;

import java.util.Collection;

import edu.brown.cs.networking.users.User;
import edu.brown.cs.networking.users.UserGroup.UserGroupBuilder;
import edu.brown.cs.networking.apis.BasicAPI;

// a simple sorter that takes no preferences of the end user into account,
// and simply filters groups by whether or not they're full.
public class BasicGroupSelector implements GroupSelector {

  @Override
  public Group selectFor(User u, Collection<Group> coll) {
    for(Group ug : coll) {
      if (!ug.isFull()) {
        return ug;
      }
    }
    UserGroupBuilder b = new UserGroupBuilder(BasicAPI.class);
    return b.build();
  }

}
