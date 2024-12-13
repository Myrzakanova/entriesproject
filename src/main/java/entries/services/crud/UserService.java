package entries.services.crud;

import entries.dto.UserDTO;
import entries.entities.User;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    User getCurrentUser();
    void deleteUser();
    void deleteUserById(Long id);
    UserDTO findUserByID(Long id);
    List<UserDTO> getAllUsers();
}
