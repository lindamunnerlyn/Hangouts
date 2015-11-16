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

final class dgl
{

    private final aoa a;
    private final String b = eep.c();
    private final Set c = new HashSet();

    public dgl(aoa aoa)
    {
        a = aoa;
    }

    public void a()
    {
        if (c.size() > 0)
        {
            ano ano1 = new ano(new ArrayList(c), b);
            dny.a(a).c(ano1);
            c.clear();
        }
    }

    public boolean a(Context context, aow aow1, String s, List list)
    {
        boolean flag;
        flag = false;
        aow1.a();
        long l;
        long l2;
        l = SystemClock.elapsedRealtime();
        l2 = ((amo)hlp.a(context, amo)).a("babel_yieldtime", 2000L);
        context = list.iterator();
_L2:
        if (!context.hasNext())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        list = (cgd)context.next();
        long l1 = l;
        if (SystemClock.elapsedRealtime() - l >= l2)
        {
            aow1.d();
            l1 = SystemClock.elapsedRealtime();
        }
        l = l1;
        if (!aow1.a(list, b, s)) goto _L2; else goto _L1
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
        eev.g("Babel", "RealTimeChatOperationState: invalid spec");
        l = l1;
          goto _L2
        context;
        aow1.c();
        throw context;
        aow1.b();
        aow1.c();
        return flag;
    }
}
