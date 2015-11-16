// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class alc
    implements ddm
{

    private final Context a;

    alc(Context context)
    {
        a = context;
    }

    public void a(gmw gmw1, cws cws1)
    {
        int j;
        j = ((gms)hgx.a(a, gms)).b(gmw1.b("account_name"), gmw1.b("effective_gaia_id"));
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        gmw1 = new iqq[cws1.m().length];
        int i = 0;
_L2:
        if (i >= gmw1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        gmw1[i] = (iqq)kop.mergeFrom(new iqq(), cws1.m()[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            for (cws1 = hgx.c(a, dcd).iterator(); cws1.hasNext(); gbk.execute(new ald(this, (dcd)cws1.next(), j, gmw1))) { }
        }
        // Misplaced declaration of an exception variable
        catch (gmw gmw1) { }
    }
}
