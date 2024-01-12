package example.aws_study.service;

import example.aws_study.domain.Users;
import example.aws_study.domain.dto.UserRequestDTO;
import example.aws_study.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public boolean save(UserRequestDTO dto) {
        Users users = Users.builder().userId(dto.getUserId()).password(dto.getPassword()).build();

        try {
            userRepository.save(users);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
        return true;
    }
}
