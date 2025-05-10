package pojo;
import lombok.*;
@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder

public class Card {
    private Long cardId;
    private Long userId;
}
