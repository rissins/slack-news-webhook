package com.rissins.newswebhook.domain;


import com.rissins.newswebhook.dto.NewsResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    String content;

    String url;

    public NewsResponse toResponse() {
        return NewsResponse.builder()
                .title(title)
                .content(content)
                .url(url)
                .build();
    }
}
