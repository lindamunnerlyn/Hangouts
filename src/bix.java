// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import java.util.concurrent.TimeUnit;

public final class bix
    implements Runnable
{

    final ConversationListFragment a;

    public bix(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public void run()
    {
        if (ConversationListFragment.b(a) == null)
        {
            ((bjf)a.f).notifyDataSetChanged();
        }
        ConversationListFragment.g(a).postDelayed(ConversationListFragment.f(a), TimeUnit.SECONDS.toMillis(60L));
    }
}
