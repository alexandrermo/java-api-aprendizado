package ale.learning.demo.application.player.usecase;

import org.springframework.stereotype.Service;

import ale.learning.demo.application.player.adapter.PlayerHttpAdapter;
import ale.learning.demo.application.player.domain.Player;
import ale.learning.demo.application.player.domain.PlayerFilter;
import ale.learning.demo.presentation.shared.domain.Page;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerUseCase {
    private final PlayerHttpAdapter playerHttpAdapter;

    public Page<Player> getPlayers(PlayerFilter playerFilter) {

        return playerHttpAdapter.getPlayers(playerFilter);
    }
}
