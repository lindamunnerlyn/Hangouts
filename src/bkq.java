// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class bkq extends AsyncTask
{

    final String a;
    final InvitationFragment b;

    public bkq(InvitationFragment invitationfragment)
    {
        b = invitationfragment;
        super();
        a = InvitationFragment.f(b);
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new aoe(InvitationFragment.i(b), InvitationFragment.j(b).h());
        ((aoe) (aobj)).D(InvitationFragment.f(b));
        ((aoe) (aobj)).i(InvitationFragment.f(b));
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute((Void)obj);
        if (InvitationFragment.g(b) != null && TextUtils.equals(InvitationFragment.f(b), a))
        {
            obj = new aih(InvitationFragment.f(b), InvitationFragment.h(b));
            b.restartFragment(((aih) (obj)));
        }
    }
}
