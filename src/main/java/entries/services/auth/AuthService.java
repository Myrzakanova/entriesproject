package entries.services.auth;


import entries.dto.UserDTO;
import entries.dto.authorization.AuthRegistrationDTO;
import entries.dto.reset.PasswordResetDTO;

public interface AuthService {
    UserDTO register(AuthRegistrationDTO authRegistrationDTO);

    String verifyEmail(String token);

    void sendPasswordResetRequest(PasswordResetDTO passwordResetDTO);

    String resetPassword(String token, String newPassword);
}
