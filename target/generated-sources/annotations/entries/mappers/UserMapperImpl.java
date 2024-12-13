package entries.mappers;

import entries.dto.UserDTO;
import entries.dto.authorization.AuthRegistrationDTO;
import entries.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T17:42:09+0600",
    comments = "version: 1.6.2, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDtoToUser(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.username( dto.getUsername() );
        user.email( dto.getEmail() );
        user.createdAt( dto.getCreatedAt() );

        return user.build();
    }

    @Override
    public User authRegistrationDtoToUserEntity(AuthRegistrationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.username( dto.getUsername() );
        user.password( dto.getPassword() );
        user.email( dto.getEmail() );

        return user.build();
    }

    @Override
    public UserDTO userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( user.getId() );
        userDTO.username( user.getUsername() );
        userDTO.email( user.getEmail() );
        userDTO.createdAt( user.getCreatedAt() );

        return userDTO.build();
    }
}
