// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;
import java.util.concurrent.TimeUnit;

public final class bhx
    implements Runnable
{

    final ConversationInviteListFragment a;

    public bhx(ConversationInviteListFragment conversationinvitelistfragment)
    {
        a = conversationinvitelistfragment;
        super();
    }

    public void run()
    {
        ((bia)a.g).notifyDataSetChanged();
        ConversationInviteListFragment.c(a).postDelayed(ConversationInviteListFragment.b(a), TimeUnit.SECONDS.toMillis(60L));
    }
}
