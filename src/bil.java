// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import java.util.concurrent.TimeUnit;

public final class bil
    implements Runnable
{

    final ConversationListFragment a;

    public bil(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public void run()
    {
        if (ConversationListFragment.b(a) == null)
        {
            ((bit)a.g).notifyDataSetChanged();
        }
        ConversationListFragment.e(a).postDelayed(ConversationListFragment.d(a), TimeUnit.SECONDS.toMillis(60L));
    }
}
