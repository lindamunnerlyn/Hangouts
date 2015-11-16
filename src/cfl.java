// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class cfl
    implements android.widget.AdapterView.OnItemClickListener
{

    final cfj a;

    cfl(cfj cfj1)
    {
        a = cfj1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (gmh)(gme)((cfg)cfj.e(a)).getItem(i);
        cfm.b[cfn.a()[adapterview.c()] - 1];
        JVM INSTR tableswitch 1 4: default 64
    //                   1 98
    //                   2 220
    //                   3 238
    //                   4 256;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i = adapterview.c();
        throw new IllegalStateException((new StringBuilder(37)).append("Unknown action sheet item ").append(i).toString());
_L2:
        cfj.a(a, atd.a);
        i = 2506;
_L7:
        g.a(cfj.d(a), i);
        cfj.a(a, new aip());
        cfj.a(a, ((asa)cfj.h(a).a(asa)).a(cfj.f(a), cfj.g(a), 0, a, cfj.a(a), cfj.c(a)));
        cfj.b(a).a(cfj.i(a));
        return;
_L3:
        cfj.a(a, atd.b);
        i = 2507;
        continue; /* Loop/switch isn't completed */
_L4:
        cfj.a(a, atd.c);
        i = 2508;
        continue; /* Loop/switch isn't completed */
_L5:
        cfj.a(a, atd.d);
        i = 2509;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
