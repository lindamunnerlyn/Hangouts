// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.AbsListView;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class bin
    implements android.widget.AbsListView.OnScrollListener
{

    final ConversationListFragment a;

    public bin(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (ConversationListFragment.q())
        {
            boolean flag = ConversationListFragment.i(a);
            boolean flag1 = ConversationListFragment.j(a);
            boolean flag2 = ConversationListFragment.k(a);
            ConversationListFragment.d((new StringBuilder(103)).append("onScroll initialLoadFinished=").append(flag).append(" mExhaustedConversationsToLoad=").append(flag1).append(" mLoadingOlderConversations=").append(flag2).toString());
        }
        if (ConversationListFragment.i(a) && i + j == k)
        {
            ConversationListFragment.e("Checking for more conversations");
            if (ConversationListFragment.l(a))
            {
                ConversationListFragment.a(a, a.getView());
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
