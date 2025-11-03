package ale.learning.demo.application.player.domain;

import ale.learning.demo.presentation.shared.domain.Pageable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class PlayerFilter extends Pageable {
    private Long playerId;
    private String countryCode;
    private boolean online;
    private PlayerAccountStatusEnum accountStatus;
}
