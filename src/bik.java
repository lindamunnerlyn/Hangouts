// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.AbsListView;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;

public final class bik
    implements android.widget.AbsListView.OnScrollListener
{

    final ConversationInviteListFragment a;

    public bik(ConversationInviteListFragment conversationinvitelistfragment)
    {
        a = conversationinvitelistfragment;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (ConversationInviteListFragment.c())
        {
            boolean flag = ConversationInviteListFragment.f(a);
            boolean flag1 = ConversationInviteListFragment.g(a);
            boolean flag2 = ConversationInviteListFragment.h(a);
            ConversationInviteListFragment.a((new StringBuilder(103)).append("onScroll initialLoadFinished=").append(flag).append(" mExhaustedConversationsToLoad=").append(flag1).append(" mLoadingOlderConversations=").append(flag2).toString());
        }
        if (ConversationInviteListFragment.f(a) && i + j == k)
        {
            ConversationInviteListFragment.b("Checking for more conversations");
            if (ConversationInviteListFragment.i(a))
            {
                ConversationInviteListFragment.a(a, a.getView());
            }
        }
        ConversationInviteListFragment.j(a);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
