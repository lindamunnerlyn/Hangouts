// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class egr
    implements Runnable
{

    final ConversationListItemWrapper a;

    public egr(ConversationListItemWrapper conversationlistitemwrapper)
    {
        a = conversationlistitemwrapper;
        super();
    }

    public void run()
    {
        if (a.a instanceof efx)
        {
            ((efx)a.a).a();
        } else
        if (a.a instanceof com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem)
        {
            ((com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem)a.a).a();
            return;
        }
    }
}
