// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

final class bkp
    implements aqb
{

    final bko a;

    bkp(bko bko1)
    {
        a = bko1;
        super();
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(eab);
        if (flag && ebh1 != null)
        {
            ebh1 = ebh1.d();
            if (InvitationFragment.b(a.a) != null && InvitationFragment.b(a.a).equals(apw1.l()))
            {
                InvitationFragment.d(a.a).setImageBitmap(ebh1);
                return;
            }
        }
    }
}
