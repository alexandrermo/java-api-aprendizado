package ale.learning.demo.presentation.rest.player.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerResponseDto {
    private Long playerId;
    private String fullName;
    private String nickName;
    private String email;
    private LocalDate birthDate;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
    private long playTimeMinutes;
    private List<String> accountAchievements;
    private boolean online;
    private String country;
    private String region;
    private String language;
    private String timezone;
    private boolean accountVerified;
    private String accountStatus;
}
