// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

final class blb
    implements aqs
{

    final bla a;

    blb(bla bla1)
    {
        a = bla1;
        super();
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (flag && eef1 != null)
        {
            eef1 = eef1.d();
            if (InvitationFragment.a(a.a) != null && InvitationFragment.a(a.a).equals(aqn1.m()))
            {
                InvitationFragment.c(a.a).setImageBitmap(eef1);
                return;
            }
        }
    }
}
