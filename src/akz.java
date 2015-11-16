// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class akz
    implements deu
{

    private final Context a;

    akz(Context context)
    {
        a = context;
    }

    public void a(grd grd1, cyw cyw1)
    {
        int j;
        j = ((gqz)hlp.a(a, gqz)).b(grd1.b("account_name"), grd1.b("effective_gaia_id"));
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        grd1 = new iwv[cyw1.m().length];
        int i = 0;
_L2:
        if (i >= grd1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        grd1[i] = (iwv)kws.mergeFrom(new iwv(), cyw1.m()[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            for (cyw1 = hlp.c(a, ddl).iterator(); cyw1.hasNext(); gdy.execute(new ala(this, (ddl)cyw1.next(), j, grd1))) { }
        }
        // Misplaced declaration of an exception variable
        catch (grd grd1) { }
    }
}
