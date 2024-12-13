package entries.mappers;

import entries.dto.UserDTO;
import entries.dto.authorization.AuthRegistrationDTO;
import entries.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User userDtoToUser(UserDTO dto);
    User authRegistrationDtoToUserEntity(AuthRegistrationDTO dto);
    UserDTO userToUserDto(User user);
}
