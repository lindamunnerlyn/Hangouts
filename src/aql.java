// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class aql
{

    public static final String a[] = {
        "_id", "message_id", "conversation_id", "author_chat_id", "author_gaia_id", "text", "timestamp", "status", "type", "local_url", 
        "remote_url", "width_pixels", "height_pixels", "attachment_name", "latitude", "longitude", "address", "attachment_target_url", "expiration_timestamp", "off_the_record", 
        "attachment_content_type", "sms_message_size", "sms_priority", "sms_timestamp_sent", "external_ids", "mms_subject", "sms_raw_sender", "sms_raw_recipients", "persisted", "sms_message_status", 
        "image_id", "stream_url", "stream_expiration", "sms_type", "new_conversation_name", "participant_keys", "transport_type", "sending_error", "call_media_type", "voicemail_length", 
        "image_rotation"
    };

    public static String[] a()
    {
        return (new String[] {
            Integer.toString(dqc.h.ordinal()), Long.toString(SystemClock.elapsedRealtime() * 1000L)
        });
    }

}
