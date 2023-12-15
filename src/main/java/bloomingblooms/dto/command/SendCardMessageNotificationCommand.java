package bloomingblooms.dto.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ModifyOrderStateCommand {
    private Long cardId;
    private String password;
    private String senderName;
    private String recipientPhoneNumber;

}