package ale.learning.demo.presentation.rest.player.mapper;

import org.springframework.stereotype.Component;

import ale.learning.demo.application.player.domain.PlayerAccountStatusEnum;
import ale.learning.demo.application.player.domain.PlayerFilter;

@Component
public class PlayerRequestMapper {
    public PlayerFilter toDomain(Long playerId, String countryCode, boolean online, Long page, Long pageSize,
            PlayerAccountStatusEnum accountStatus) {

        return PlayerFilter.builder().accountStatus(accountStatus).countryCode(countryCode).online(online).page(page)
                .pageSize(pageSize).playerId(playerId).build();
    }
}
