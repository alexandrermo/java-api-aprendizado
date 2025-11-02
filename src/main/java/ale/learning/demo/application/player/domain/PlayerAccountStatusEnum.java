package ale.learning.demo.application.player.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlayerAccountStatusEnum {
    ACTIVE,
    INACTIVE,
    SUSPENDED,
    DELETED
}
