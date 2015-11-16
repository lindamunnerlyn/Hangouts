// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bda
    implements gxq
{

    private final gms a;
    private final alw b;
    private final Context c;

    bda(Context context)
    {
        a = (gms)hgx.a(context, gms);
        b = (alw)hgx.a(context, alw);
        c = context;
    }

    public void a(int i)
    {
        String s;
        ani ani1;
        ebw.e("Babel_StickerModule", (new StringBuilder(34)).append("Account change update: ").append(i).toString());
        if (!a.d(i))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        s = b.a("babel_stickers_account_id", "108618507921641169817");
        ani1 = dbf.e(i);
        if (!ani1.q() && !dbf.g(ani1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l;
        l = ank.p(c, ani1);
        if (l > 0L && !g.a(c, "babel_stickers_auto_update", true))
        {
            ebw.c("Babel_StickerModule", (new StringBuilder(59)).append("Skip stickers auto update. Last update:").append(l).toString());
            return;
        }
        if (g.a(c, "babel_stickers_query_limit_ms", djk.i) + l >= System.currentTimeMillis()) goto _L1; else goto _L3
_L3:
        ebw.e("Babel_StickerModule", (new StringBuilder(63)).append("Sticker update initiated. last:").append(l).append(" empty:false").toString());
        RealTimeChatService.q(ani1, s);
        return;
        ebw.f("Babel_StickerModule", "Null account update.");
        return;
    }
}
