// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import java.util.Arrays;
import java.util.HashSet;

public final class bkt
    implements ekh
{

    final InvitationFragment a;

    public bkt(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(ekg ekg)
    {
        ekg = ((fmf)ekg).c();
        a.inviterCircleIds = new HashSet();
        if (ekg.a() == 1)
        {
            fqx fqx1 = ekg.b(0);
            if (TextUtils.equals(fqx1.e(), InvitationFragment.b(a).a))
            {
                a.inviterCircleIds.addAll(Arrays.asList(fqx1.i()));
            }
        }
        InvitationFragment.m(a);
        ekg.b();
        return;
        Exception exception;
        exception;
        ekg.b();
        throw exception;
    }
}
