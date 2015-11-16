// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;

final class fcr
    implements fda
{

    final fcq a;

    fcr(fcq fcq1)
    {
        a = fcq1;
        super();
    }

    public void a(fcp fcp)
    {
        a.a = fcp;
        for (fcp = a.c.iterator(); fcp.hasNext(); ((fcv)fcp.next()).b()) { }
        a.c.clear();
        a.b = null;
    }
}
