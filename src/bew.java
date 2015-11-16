// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bew extends dgp
{

    int a;
    aik b;
    final ben c;

    bew(ben ben1)
    {
        c = ben1;
        super();
    }

    public void a(int i, ani ani1, dcg dcg1, dgu dgu1)
    {
        if (i != a)
        {
            return;
        }
        if (dgu1.b() != 1) goto _L2; else goto _L1
_L1:
        dcg1 = new aih(dcg1.a, 1);
        dcg1.d = false;
        dcg1.k = 2148;
        ani1 = g.a(ani1.h(), ((aih) (dcg1)).a, ((aih) (dcg1)).b);
        ani1.putExtra("conversation_parameters", dcg1);
        ani1.putExtra("opened_from_impression", ((aih) (dcg1)).k);
        ben.r(c).startActivity(ani1);
_L4:
        RealTimeChatService.b(ben.D(c));
        return;
_L2:
        i = dgu1.b();
        dgu1 = String.valueOf(dcg1);
        if (dcg1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ani1 = dcg1.a;
_L5:
        ani1 = String.valueOf(ani1);
        ebw.g("Babel_FAB", (new StringBuilder(String.valueOf(dgu1).length() + 55 + String.valueOf(ani1).length())).append("couldn't create conversation; error code: ").append(i).append(" ").append(dgu1).append(" ").append(ani1).toString());
        if (true) goto _L4; else goto _L3
        ani1;
        RealTimeChatService.b(ben.D(c));
        throw ani1;
_L3:
        ani1 = "NULL";
          goto _L5
    }
}
