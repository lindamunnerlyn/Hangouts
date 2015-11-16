// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class dfc
{

    private final ani a;
    private final String b = ebr.c();
    private final Set c = new HashSet();

    public dfc(ani ani)
    {
        a = ani;
    }

    public void a()
    {
        if (c.size() > 0)
        {
            amw amw1 = new amw(new ArrayList(c), b, a);
            dlb.a(a).c(amw1);
            c.clear();
        }
    }

    public boolean a(Context context, aoe aoe1, String s, List list)
    {
        boolean flag;
        flag = false;
        aoe1.a();
        long l;
        long l2;
        l = SystemClock.elapsedRealtime();
        l2 = ((alw)hgx.a(context, alw)).a("babel_yieldtime", 2000L);
        context = list.iterator();
_L2:
        if (!context.hasNext())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        list = (cey)context.next();
        long l1 = l;
        if (SystemClock.elapsedRealtime() - l >= l2)
        {
            aoe1.d();
            l1 = SystemClock.elapsedRealtime();
        }
        l = l1;
        if (!aoe1.a(list, b, s)) goto _L2; else goto _L1
_L1:
        list = g.a(list);
        if (!list.a())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        c.add(list);
        flag = true;
        l = l1;
          goto _L2
        ebw.g("Babel", "RealTimeChatOperationState: invalid spec");
        l = l1;
          goto _L2
        context;
        aoe1.c();
        throw context;
        aoe1.b();
        aoe1.c();
        return flag;
    }
}
