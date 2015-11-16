// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class bkm
    implements eka
{

    final InvitationFragment a;

    public bkm(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(int i)
    {
    }

    public void a_(Bundle bundle)
    {
        if (a.getActivity() == null)
        {
            ebw.c("Babel", "People client connected but InvitationFragment is detached.");
            return;
        } else
        {
            InvitationFragment.a(a);
            return;
        }
    }
}
