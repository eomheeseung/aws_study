package example.aws_study.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserRequestDTO {
    @JsonProperty(value = "user_id")
    @Schema(example = "test1234",description = "사용자 id")
    private String userId;

    @JsonProperty(value = "user_password")
    @Schema(example = "1234", description = "사용자 패스워드")
    private String password;

}
