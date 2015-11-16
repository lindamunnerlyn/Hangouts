// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bdq
    implements hcb
{

    private final gqz a;
    private final amo b;
    private final Context c;

    bdq(Context context)
    {
        a = (gqz)hlp.a(context, gqz);
        b = (amo)hlp.a(context, amo);
        c = context;
    }

    public void a(int i)
    {
        String s;
        aoa aoa1;
        eev.e("Babel_StickerModule", (new StringBuilder(34)).append("Account change update: ").append(i).toString());
        if (!a.d(i))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        s = b.a("babel_stickers_account_id", "108618507921641169817");
        aoa1 = dcn.e(i);
        if (!aoa1.o() && !dcn.f(aoa1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l;
        l = aoc.n(c, aoa1);
        if (l > 0L && !g.a(c, "babel_stickers_auto_update", true))
        {
            eev.c("Babel_StickerModule", (new StringBuilder(59)).append("Skip stickers auto update. Last update:").append(l).toString());
            return;
        }
        if (g.a(c, "babel_stickers_query_limit_ms", dlb.i) + l >= System.currentTimeMillis()) goto _L1; else goto _L3
_L3:
        eev.e("Babel_StickerModule", (new StringBuilder(63)).append("Sticker update initiated. last:").append(l).append(" empty:false").toString());
        RealTimeChatService.q(aoa1, s);
        return;
        eev.f("Babel_StickerModule", "Null account update.");
        return;
    }
}
