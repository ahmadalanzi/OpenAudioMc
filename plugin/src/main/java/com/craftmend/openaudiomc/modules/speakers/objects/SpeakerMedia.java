package com.craftmend.openaudiomc.modules.speakers.objects;

import com.craftmend.openaudiomc.OpenAudioMc;
import com.craftmend.openaudiomc.modules.media.enums.MediaFlag;
import com.craftmend.openaudiomc.modules.media.objects.Media;
import lombok.Getter;
import lombok.Setter;

public class SpeakerMedia extends Media {

    @Getter @Setter
    private Boolean distanceFading = false;

    public SpeakerMedia(String source) {
        super(source);
        setLoop(true);
        setDoPickup(!OpenAudioMc.getInstance().getConfigurationModule().getMainConfig().contains("options.sync-speakers") || OpenAudioMc.getInstance().getConfigurationModule().getMainConfig().getBoolean("options.sync-speakers"));
        setFadeTime(500);
        setFlag(MediaFlag.SPEAKER);
    }

}
