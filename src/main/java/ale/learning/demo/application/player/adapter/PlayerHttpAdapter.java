package ale.learning.demo.application.player.adapter;

import java.util.List;

import ale.learning.demo.application.player.domain.Player;
import ale.learning.demo.application.player.domain.PlayerFilter;

public interface PlayerHttpAdapter {
    List<Player> getPlayers(PlayerFilter playerFilter);
}
