package ng.mkaychuks.authify.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProfileRequest {

    private String name;
    private String email;
    private String password;
}
