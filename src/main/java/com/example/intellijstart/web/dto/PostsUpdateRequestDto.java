package com.example.intellijstart.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content){ //이건 그냥 방법만 다른건가? 생성자와 빌더를 그냥 클래스 위에 붙이지 않고?
        this.title = title;
        this.content = content;
    }

}
