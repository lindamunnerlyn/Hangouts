// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.ProximityCoverView;

final class avw
    implements edc
{

    final ave a;

    avw(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a(int i)
    {
        i;
        JVM INSTR tableswitch 3 4: default 24
    //                   3 42
    //                   4 55;
           goto _L1 _L2 _L3
_L1:
        ave.Y(a).c();
_L5:
        ave.Z(a);
        return;
_L2:
        ave.Y(a).a();
        continue; /* Loop/switch isn't completed */
_L3:
        ave.Y(a).b();
        if (true) goto _L5; else goto _L4
_L4:
    }
}
