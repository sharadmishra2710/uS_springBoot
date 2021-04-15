package com.sharadmishra2710.user.dto;

import com.sharadmishra2710.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    private User user;
    private Department department;
}
