// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.content.EsProvider;

public interface aoi
{

    public static final String a[] = {
        "is_draft", "conversation_type", "name", "metadata_present", "continuation_token", "continuation_event_timestamp", "disposition", "inviter_gaia_id", "inviter_chat_id", "status", 
        "is_pending_leave", "otr_status", "otr_toggle", "generated_name", "has_oldest_message", "transport_type", "sort_timestamp", "(select merge_key FROM merge_keys WHERE merge_keys.conversation_id=conversations.conversation_id) as merge_key", "latest_message_timestamp", "view", 
        "conversation_id", EsProvider.b(EsProvider.a("gaia_id")), EsProvider.b(EsProvider.a("chat_id")), EsProvider.b(EsProvider.a("phone_id")), EsProvider.b(EsProvider.a("circle_id")), EsProvider.b(EsProvider.a("fallback_name")), EsProvider.b(EsProvider.a("full_name")), EsProvider.b(EsProvider.a("participant_type")), EsProvider.b(EsProvider.a("active")), EsProvider.b(EsProvider.a("first_name")), 
        EsProvider.b(EsProvider.a("profile_photo_url")), EsProvider.b(EsProvider.a("batch_gebi_tag"))
    };

}
