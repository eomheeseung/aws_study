package example.aws_study.controller;

import example.aws_study.domain.dto.UserRequestDTO;
import example.aws_study.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @PostMapping("join")
    public ResponseEntity<Object> join(@RequestBody UserRequestDTO dto) {
        log.info("userId:{}", dto.getUserId());
        boolean flag;

        try{
            flag = userService.save(dto);
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(flag);
    }
}
