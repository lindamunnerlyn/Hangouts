// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.phone.ConversationUrlHandlerActivity;

public final class clq
    implements android.content.DialogInterface.OnCancelListener
{

    final ConversationUrlHandlerActivity a;

    public clq(ConversationUrlHandlerActivity conversationurlhandleractivity)
    {
        a = conversationurlhandleractivity;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
    }
}
