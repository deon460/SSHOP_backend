package dmon.SSHOP_springboot_backend.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountResponse {
    String accountId;
    String username;
    String email;
    String phone;
    Set<String> roles;
}
