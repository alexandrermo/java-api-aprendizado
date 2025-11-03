package ale.learning.demo.application.player.adapter;

import ale.learning.demo.application.player.domain.Player;
import ale.learning.demo.application.player.domain.PlayerFilter;
import ale.learning.demo.presentation.shared.domain.Page;

public interface PlayerHttpAdapter {
    Page<Player> getPlayers(PlayerFilter playerFilter);
}
