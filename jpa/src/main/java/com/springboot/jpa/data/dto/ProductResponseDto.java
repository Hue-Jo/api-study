package com.springboot.jpa.data.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductResponseDto {

    private Long number;
    private String name;
    private int price;
    private int stock;

}
