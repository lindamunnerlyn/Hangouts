// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.InvitationFragment;
import java.util.Map;

public final class bku
    implements dmd
{

    final InvitationFragment a;

    public bku(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(fqr fqr1)
    {
        gz gz1;
        int i;
        gz1 = new gz();
        i = fqr1.a() - 1;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        fqq fqq1 = fqr1.b(i);
        gz1.put(fqq1.a(), fqq1.b());
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        a.myCircles = gz1;
        InvitationFragment.m(a);
        fqr1.b();
        return;
        Exception exception;
        exception;
        fqr1.b();
        throw exception;
    }
}
