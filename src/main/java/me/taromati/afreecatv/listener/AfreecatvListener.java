package me.taromati.afreecatv.listener;

import me.taromati.afreecatv.event.implement.DonationChatEvent;
import me.taromati.afreecatv.event.implement.MessageChatEvent;

public interface AfreecatvListener {

    default void onMessageChat(final MessageChatEvent e) { }
    default void onDonationChat(final DonationChatEvent e) { }

}