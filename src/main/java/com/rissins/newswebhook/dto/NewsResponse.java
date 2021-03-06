package com.rissins.newswebhook.dto;

import com.rissins.newswebhook.domain.News;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewsResponse {

    private String title;
    private String content;
    private String url;

    public News toEntity() {
        return News.builder()
                .title(title)
                .content(content)
                .url(url)
                .build();
    }
}
