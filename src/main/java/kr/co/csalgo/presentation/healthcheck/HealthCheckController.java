package kr.co.csalgo.presentation.healthcheck;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator")
@Tag(name = "Health Check", description = "서버 상태 확인 API")
public class HealthCheckController {

    @GetMapping("/health")
    @Operation(summary = "헬스 체크 조회", description = "서버의 작동 여부 확인을 위해 헬스 체크를 조회한다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "헬스 체크 조회 성공"),
            @ApiResponse(responseCode = "503", description = "헬스 체크 조회 실패")
    })
    public Health healthCheck() {
        return Health.up().build();
    }
}
