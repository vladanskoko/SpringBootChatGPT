package com.example.springbootchatgpt.dto;

import com.example.springbootchatgpt.model.Message;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatGPTRequest {
    private String model;
    private List<Message> messages;
    private int temperature;

    @SerializedName(value = "max_tokens")
    private int maxTokens;
}
