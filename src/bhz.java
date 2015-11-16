// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;

public final class bhz extends AsyncTask
{

    final int a;
    final ConversationInviteListFragment b;

    public bhz(ConversationInviteListFragment conversationinvitelistfragment, int i)
    {
        b = conversationinvitelistfragment;
        a = i;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        (new aoe(ConversationInviteListFragment.i(b), ConversationInviteListFragment.j(b).h())).w();
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        if (ConversationInviteListFragment.d() == a && b.getActivity() != null)
        {
            ConversationInviteListFragment.k(b);
            b.getLoaderManager().b(1, null, b);
            ((bia)b.g).notifyDataSetChanged();
            ConversationInviteListFragment.h(b);
        }
    }
}
