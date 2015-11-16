// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cfx extends dgp
{

    final cfs a;

    cfx(cfs cfs1)
    {
        a = cfs1;
        super();
    }

    public void a(int i, ani ani, dcg dcg1, dgu dgu1, int j)
    {
        super.a(i, ani, dcg1, dgu1, j);
        if (i != cfs.k(a))
        {
            return;
        }
        ani = a.getActivity();
        if (ani == null)
        {
            RealTimeChatService.b(cfs.m(a));
            return;
        }
        if (dgu1.b() != 1) goto _L2; else goto _L1
_L1:
        gbh.b(cnd.e, cfs.l(a));
        gbh.b(cnd.f, cfs.l(a));
        cfs.e(a).a(dcg1.a, dcg1.b, dcg1.c, cfs.b(a).a());
_L4:
        RealTimeChatService.b(cfs.m(a));
        return;
_L2:
        i = dgu1.b();
        dgu1 = String.valueOf(dcg1);
        if (dcg1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ani = dcg1.a;
_L5:
        ani = String.valueOf(ani);
        ebw.g("Babel", (new StringBuilder(String.valueOf(dgu1).length() + 55 + String.valueOf(ani).length())).append("couldn't create conversation; error code: ").append(i).append(" ").append(dgu1).append(" ").append(ani).toString());
        if (true) goto _L4; else goto _L3
        ani;
        RealTimeChatService.b(cfs.m(a));
        throw ani;
_L3:
        ani = "NULL";
          goto _L5
    }
}
