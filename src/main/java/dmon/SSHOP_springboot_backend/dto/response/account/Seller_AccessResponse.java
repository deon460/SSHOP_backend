package dmon.SSHOP_springboot_backend.dto.response.account;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Seller_AccessResponse {
    boolean authenticated;
    String token;
}
