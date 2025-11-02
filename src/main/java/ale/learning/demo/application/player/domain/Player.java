package ale.learning.demo.application.player.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {
    private Long playerId;
    private String fullName;
    private String nickName;
    private String email;
    private LocalDate birthDate;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
    private long playTimeMinutes;
    // private List<String> accountAchievements;
    private boolean online;
    private String countryCode;
    private boolean accountVerified;
    private PlayerAccountStatusEnum accountStatus;
}
