// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class bis
    implements bze
{

    final ConversationListFragment a;

    public bis(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public void a(bzd bzd)
    {
        ConversationListFragment.a(a, bzd);
        ConversationListFragment.a(a).v();
    }

    public void b(bzd bzd)
    {
        if (ConversationListFragment.b(a) == bzd)
        {
            ConversationListFragment.a(a, null);
            ConversationListFragment.a(a).s();
        }
    }
}
