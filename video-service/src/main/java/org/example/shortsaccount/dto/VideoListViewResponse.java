package org.example.shortsaccount.dto;

import lombok.Getter;
import org.example.shortsaccount.domain.Video;

@Getter
public class VideoListViewResponse {
    private final int id;
    private final String title;
    private final int length;
    private final int memberId;

    public VideoListViewResponse(Video video) {
        this.id = video.getVideoId();
        this.title = video.getTitle();
        this.length = video.getLength();
        this.memberId = video.getMemberId();
    }
}