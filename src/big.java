// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class big
    implements byb
{

    final ConversationListFragment a;

    public big(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public void a(bya bya)
    {
        ConversationListFragment.a(a, bya);
        ConversationListFragment.a(a).v();
    }

    public void b(bya bya)
    {
        if (ConversationListFragment.b(a) == bya)
        {
            ConversationListFragment.a(a, null);
            ConversationListFragment.a(a).s();
        }
    }
}
