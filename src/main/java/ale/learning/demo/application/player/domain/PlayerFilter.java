package ale.learning.demo.application.player.domain;

import ale.learning.demo.presentation.shared.domain.Pageable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerFilter extends Pageable {
    private Long playerId;
    private String countryCode;
    private boolean online;
    private PlayerAccountStatusEnum accountStatus;
}
