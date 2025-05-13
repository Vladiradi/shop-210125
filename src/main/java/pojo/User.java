package pojo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder

public class User {
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String passwordHash;
    private String role;
}
