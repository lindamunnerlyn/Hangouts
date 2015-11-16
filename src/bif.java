// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;

final class bif extends DataSetObserver
{

    final ConversationInviteListFragment a;
    final bie b;

    bif(bie bie1, ConversationInviteListFragment conversationinvitelistfragment)
    {
        b = bie1;
        a = conversationinvitelistfragment;
        super();
    }

    public void onChanged()
    {
        b.notifyDataSetChanged();
        bie.a(b, bie.a(b).a());
    }

    public void onInvalidated()
    {
        b.notifyDataSetInvalidated();
        bie.a(b, bie.a(b).a());
    }
}
