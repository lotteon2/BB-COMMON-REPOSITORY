package bloomingblooms.dto.command;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class CartDeleteCommand {
  List<CartDeleteDto> cartDeleteDtoList;
}
