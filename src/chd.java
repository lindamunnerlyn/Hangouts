// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class chd extends dhy
{

    final cgy a;

    chd(cgy cgy1)
    {
        a = cgy1;
        super();
    }

    public void a(int i, aoa aoa, ddo ddo1, did did1, int j)
    {
        super.a(i, aoa, ddo1, did1, j);
        if (i != cgy.k(a))
        {
            return;
        }
        aoa = a.getActivity();
        if (aoa == null)
        {
            RealTimeChatService.b(cgy.m(a));
            return;
        }
        if (did1.b() != 1) goto _L2; else goto _L1
_L1:
        gdv.b(cov.e, cgy.l(a));
        gdv.b(cov.f, cgy.l(a));
        cgy.e(a).a(ddo1.a, ddo1.b, ddo1.c, cgy.b(a).a());
_L4:
        RealTimeChatService.b(cgy.m(a));
        return;
_L2:
        i = did1.b();
        did1 = String.valueOf(ddo1);
        if (ddo1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aoa = ddo1.a;
_L5:
        aoa = String.valueOf(aoa);
        eev.g("Babel", (new StringBuilder(String.valueOf(did1).length() + 55 + String.valueOf(aoa).length())).append("couldn't create conversation; error code: ").append(i).append(" ").append(did1).append(" ").append(aoa).toString());
        if (true) goto _L4; else goto _L3
        aoa;
        RealTimeChatService.b(cgy.m(a));
        throw aoa;
_L3:
        aoa = "NULL";
          goto _L5
    }
}
