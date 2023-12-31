package bloomingblooms.dto.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ModifyOrderProductStateCommand {
    private Long orderProductId;
    private String type;

}
