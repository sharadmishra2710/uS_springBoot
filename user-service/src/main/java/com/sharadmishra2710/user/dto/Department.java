package com.sharadmishra2710.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
}
