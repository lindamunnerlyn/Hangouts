// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


interface ces
{

    public static final String a[] = {
        "author_first_name", "type", "conversation_id", "conversation_name", "generated_name", "conversation_type", "timestamp", "participant_keys", "call_media_type"
    };
    public static final String b = (new StringBuilder(String.valueOf(s).length() + 93 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append(s).append(i).append(" OR ").append(s1).append("=").append(j).append(") AND ").append(s2).append("!=1 AND ").append(s3).append(">").append(s4).append(" AND ").append(s5).append(" IS NOT NULL AND ").append(s6).append(" > 1355097600000000").toString();

    
    {
        String s = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_video_notifications=1) AND author_chat_id!=? AND conversation_notification_level!=10 AND conversation_pending_leave!=1 AND (type=");
        int i = dsv.h.ordinal();
        String s1 = String.valueOf("type");
        int j = dsv.i.ordinal();
        String s2 = String.valueOf("conversation_status");
        String s3 = String.valueOf("timestamp");
        String s4 = String.valueOf("hangout_watermark");
        String s5 = String.valueOf("author_full_name");
        String s6 = String.valueOf("timestamp");
    }
}
