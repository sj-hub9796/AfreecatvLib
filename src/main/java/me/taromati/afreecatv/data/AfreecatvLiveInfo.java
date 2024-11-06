package me.taromati.afreecatv.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class AfreecatvLiveInfo {

    private final String bjId;
    private final String bjName;

    private final String liveTitle;
    private final List<String> categoryTags;
    private final boolean isBroadcasting;

}