// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public interface cdt
{

    public static final String a[] = {
        "author_first_name", "author_full_name", "author_chat_id", "text", "type", "local_url", "remote_url", "conversation_id", "conversation_name", "generated_name", 
        "conversation_type", "timestamp", "status", "attachment_content_type", "transport_type", "author_gaia_id", "new_conversation_name", "participant_keys", "merge_key", "sms_type", 
        "chat_watermark", "chat_ringtone_uri", "otr_status", "call_media_type", "author_profile_photo_url", "_id", "message_id"
    };
    public static final String b = (new StringBuilder(String.valueOf(s).length() + 61 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append(s).append(i).append(" AND ").append(s1).append("!=").append(j).append(" AND ").append(s2).append("!=1 AND ").append(s3).append(">").append(s4).append(" AND ").append(s5).append(" > ").append(s6).toString();
    public static final String c = (new StringBuilder(String.valueOf(s).length() + 76 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append(s).append(i).append(" AND ").append(s1).append("!=").append(j).append(" AND ").append(s2).append("!=1 AND ").append(s3).append("=0 AND ").append(s4).append("<0) OR (").append(s5).append(" AND ").append(s6).append(">=0)").toString();
    public static final String d = (new StringBuilder(String.valueOf(s).length() + 62 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s).append(i).append(" AND ").append(s1).append("!=").append(j).append(" AND ").append(s2).append("!=1 AND ").append(s3).append(">? AND ").append(s4).append(" > ").append(s5).toString();

    
    {
        String s = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_chat_notifications) AND (author_chat_id is NULL OR author_chat_id!=?) AND conversation_notification_level!=10 AND notification_level!=10 AND conversation_pending_leave!=1 AND type!=");
        int i = dqc.h.ordinal();
        String s1 = String.valueOf("type");
        int j = dqc.i.ordinal();
        String s2 = String.valueOf("conversation_status");
        String s3 = String.valueOf("timestamp");
        String s4 = String.valueOf("chat_watermark");
        String s5 = String.valueOf("timestamp");
        String s6 = String.valueOf("1355097600000000");
        s = String.valueOf("((author_chat_id is NULL OR author_chat_id!=?) AND conversation_notification_level!=10 AND notification_level!=10 AND conversation_pending_leave!=1 AND type!=");
        i = dqc.h.ordinal();
        s1 = String.valueOf("type");
        j = dqc.i.ordinal();
        s2 = String.valueOf("conversation_status");
        s3 = String.valueOf("last_seen_timestamp");
        s4 = String.valueOf("sms_type");
        s5 = b;
        s6 = String.valueOf("sms_type");
        s = String.valueOf("conversation_id=? AND(author_chat_id is NULL OR author_chat_id!=?) AND conversation_notification_level!=10 AND notification_level!=10 AND conversation_pending_leave!=1 AND type!=");
        i = dqc.h.ordinal();
        s1 = String.valueOf("type");
        j = dqc.i.ordinal();
        s2 = String.valueOf("conversation_status");
        s3 = String.valueOf("timestamp");
        s4 = String.valueOf("timestamp");
        s5 = String.valueOf("1355097600000000");
    }
}
