// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class gtf
    implements gua
{

    final gte a;

    gtf(gte gte1)
    {
        a = gte1;
        super();
    }

    public void a(int i, int j)
    {
        Object obj = a.a.a(j);
        if (!((List) (obj)).isEmpty())
        {
            gtb gtb1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); gte.a(a, i, gtb1))
            {
                gtb1 = (gtb)((Iterator) (obj)).next();
            }

        }
    }
}
