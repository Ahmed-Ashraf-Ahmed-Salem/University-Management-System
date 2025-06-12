package com.example.ums.dto;


import lombok.*;

@Data  // includes @Getter, @Setter, @ToString, @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollmentRequest {
    private Long studentId;
    private Long courseId;
}
