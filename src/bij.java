// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;
import java.util.concurrent.TimeUnit;

public final class bij
    implements Runnable
{

    final ConversationInviteListFragment a;

    public bij(ConversationInviteListFragment conversationinvitelistfragment)
    {
        a = conversationinvitelistfragment;
        super();
    }

    public void run()
    {
        ((bim)a.f).notifyDataSetChanged();
        ConversationInviteListFragment.e(a).postDelayed(ConversationInviteListFragment.d(a), TimeUnit.SECONDS.toMillis(60L));
    }
}
