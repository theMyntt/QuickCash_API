package br.com.gjsoftware.quickcash.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandardResponse {
    private String message;
    private int statusCode;
}
