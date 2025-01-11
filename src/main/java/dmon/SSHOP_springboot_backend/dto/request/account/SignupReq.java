package dmon.SSHOP_springboot_backend.dto.request.account;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignupReq {
    String username;
    String password;
}
