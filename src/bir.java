// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;

final class bir extends DataSetObserver
{

    final ConversationInviteListFragment a;
    final biq b;

    bir(biq biq1, ConversationInviteListFragment conversationinvitelistfragment)
    {
        b = biq1;
        a = conversationinvitelistfragment;
        super();
    }

    public void onChanged()
    {
        b.notifyDataSetChanged();
        b.a(b.a.a());
    }

    public void onInvalidated()
    {
        b.notifyDataSetInvalidated();
        b.a(b.a.a());
    }
}
