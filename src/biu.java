// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class biu
    implements Runnable
{

    final dup a;
    final Context b;
    final ConversationListFragment c;

    public biu(ConversationListFragment conversationlistfragment, dup dup1, Context context)
    {
        c = conversationlistfragment;
        a = dup1;
        b = context;
        super();
    }

    public void run()
    {
        if (a.c())
        {
            ConversationListFragment.a(c, b);
            RealTimeChatService.f();
            a.a(false);
        }
    }
}
