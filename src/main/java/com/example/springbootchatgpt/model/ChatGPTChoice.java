package com.example.springbootchatgpt.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatGPTChoice {
    private String text;
}
