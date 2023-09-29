package com.example.springbootchatgpt.dto;

import com.example.springbootchatgpt.model.ChatGPTChoice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatGPTResponse {
    private List<ChatGPTChoice> choices;
}
