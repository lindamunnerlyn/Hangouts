// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class cgr
    implements android.widget.AdapterView.OnItemClickListener
{

    final cgo a;

    cgr(cgo cgo1)
    {
        a = cgo1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (gqn)(gqk)((cgl)cgo.g(a)).getItem(i);
        cgs.b[cgt.a()[adapterview.c()] - 1];
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
        cgo.a(a, atu.a);
        i = 2506;
_L7:
        g.a(cgo.d(a), i);
        cgo.a(a, new aii());
        cgo.a(a, ((asp)cgo.f(a).a(asp)).a(cgo.e(a), cgo.h(a), 0, a, cgo.a(a), cgo.c(a)));
        cgo.b(a).a(cgo.i(a));
        return;
_L3:
        cgo.a(a, atu.b);
        i = 2507;
        continue; /* Loop/switch isn't completed */
_L4:
        cgo.a(a, atu.c);
        i = 2508;
        continue; /* Loop/switch isn't completed */
_L5:
        cgo.a(a, atu.d);
        i = 2509;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
