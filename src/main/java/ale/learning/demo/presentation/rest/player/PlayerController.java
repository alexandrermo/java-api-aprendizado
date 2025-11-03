package ale.learning.demo.presentation.rest.player;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ale.learning.demo.application.player.domain.PlayerAccountStatusEnum;
import ale.learning.demo.application.player.usecase.PlayerUseCase;
import ale.learning.demo.presentation.rest.player.dto.PlayerResponseDto;
import ale.learning.demo.presentation.rest.player.mapper.PlayerRequestMapper;
import ale.learning.demo.presentation.rest.player.mapper.PlayerResponseMapper;
import ale.learning.demo.presentation.shared.domain.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.Max;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {

        private final PlayerUseCase playerUseCase;
        private final PlayerRequestMapper playerRequestMapper;
        private final PlayerResponseMapper playerResponseMapper;

        @GetMapping
        @Operation(summary = "Lista de jogadores", description = "Retorna os jogadores cadastrados", responses = {
                        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PlayerResponseDto.class))),
                        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
                        @ApiResponse(responseCode = "403", description = "Sem permissão", content = @Content),
                        @ApiResponse(responseCode = "404", description = "Jogador não encontrado", content = @Content),
                        @ApiResponse(responseCode = "500", description = "Erro interno", content = @Content)
        })
        @Parameters({
                        @Parameter(name = "playerId", description = "ID do jogador"),
                        @Parameter(name = "countryCode", description = "Código ISO do país do jogador (formato ISO 3166-1 alpha-2, ex: BR, US, JP)"),
                        @Parameter(name = "online", description = "Jogador online ou não"),
                        @Parameter(name = "page", description = "Offset (0-based)", schema = @Schema(type = "integer", minimum = "0", defaultValue = "0")),
                        @Parameter(name = "pageSize", description = "Quantidade por página. Default 10", schema = @Schema(type = "integer", minimum = "10", maximum = "100", defaultValue = "10")),
                        @Parameter(name = "accountStatus", description = "Filtro de status", schema = @Schema(implementation = PlayerAccountStatusEnum.class))
        })
        public Page<PlayerResponseDto> getPlayers(
                        @RequestParam(required = false) Long playerId,
                        @RequestParam(required = false) String countryCode,
                        @RequestParam(required = false) boolean online,
                        @RequestParam(required = false, defaultValue = "1") Long page,
                        @RequestParam(required = false, defaultValue = "10") @Max(100) Long pageSize,
                        @RequestParam(required = false) PlayerAccountStatusEnum accountStatus) {

                var result = playerUseCase.getPlayers(playerRequestMapper.toDomain(playerId, countryCode, online, page,
                                pageSize, accountStatus));

                return result.map(playerResponseMapper::fromDomain);
        }

}
