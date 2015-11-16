// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;

public final class bil extends AsyncTask
{

    final int a;
    final ConversationInviteListFragment b;

    public bil(ConversationInviteListFragment conversationinvitelistfragment, int i)
    {
        b = conversationinvitelistfragment;
        a = i;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        (new aow(ConversationInviteListFragment.k(b), ConversationInviteListFragment.l(b).h())).w();
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        if (ConversationInviteListFragment.d() == a && b.getActivity() != null)
        {
            ConversationInviteListFragment.m(b);
            b.getLoaderManager().b(1, null, b);
            ((bim)b.f).notifyDataSetChanged();
            ConversationInviteListFragment.j(b);
        }
    }
}
