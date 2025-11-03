package ale.learning.demo.presentation.rest.player.mapper;

import ale.learning.demo.application.player.domain.Player;
import ale.learning.demo.presentation.rest.player.dto.PlayerResponseDto;

public class PlayerResponseMapper {
    public PlayerResponseDto fromDomain(Player player) {
        return PlayerResponseDto.builder().accountStatus(player.getAccountStatus())
                .accountVerified(player.isAccountVerified()).birthDate(player.getBirthDate())
                .countryCode(player.getCountryCode()).createdAt(player.getCreatedAt())
                .email(player.getEmail())
                .fullName(player.getFullName())
                .lastLogin(player.getLastLogin())
                .nickName(player.getNickName())
                .online(player.isOnline())
                .playTimeMinutes(player.getPlayTimeMinutes())
                .playerId(player.getPlayerId())
                .build();
    }
}
