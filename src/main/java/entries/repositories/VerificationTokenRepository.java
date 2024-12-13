package entries.repositories;


import entries.entities.tokens.VerificationToken;
import entries.enums.TokenType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByTokenAndTokenType(String token, TokenType tokenType);
}

