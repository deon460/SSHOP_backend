package dmon.SSHOP_springboot_backend.dto.request;

import dmon.SSHOP_springboot_backend.util.enumerate.GenderEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateRequest {
    String name;
    String photo;
    Date dob;
    GenderEnum gender;
}
