// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.ProximityCoverView;

final class awm
    implements ege
{

    final avv a;

    awm(avv avv1)
    {
        a = avv1;
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
        avv.Z(a).c();
_L5:
        avv.aa(a);
        return;
_L2:
        avv.Z(a).a();
        continue; /* Loop/switch isn't completed */
_L3:
        avv.Z(a).b();
        if (true) goto _L5; else goto _L4
_L4:
    }
}
