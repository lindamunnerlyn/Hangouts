// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class blc extends AsyncTask
{

    final String a;
    final InvitationFragment b;

    public blc(InvitationFragment invitationfragment)
    {
        b = invitationfragment;
        super();
        a = InvitationFragment.e(b);
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new aow(InvitationFragment.h(b), InvitationFragment.i(b).h());
        ((aow) (aobj)).D(InvitationFragment.e(b));
        ((aow) (aobj)).i(InvitationFragment.e(b));
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute((Void)obj);
        if (InvitationFragment.f(b) != null && TextUtils.equals(InvitationFragment.e(b), a))
        {
            obj = new aia(InvitationFragment.e(b), InvitationFragment.g(b));
            b.restartFragment(((aia) (obj)));
        }
    }
}
