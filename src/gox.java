// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class gox
    implements gpp
{

    final gow a;

    gox(gow gow1)
    {
        a = gow1;
        super();
    }

    public void a(int i, int j)
    {
        Object obj = gow.a(a).a(j);
        if (!((List) (obj)).isEmpty())
        {
            got got1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); gow.a(a, i, got1))
            {
                got1 = (got)((Iterator) (obj)).next();
            }

        }
    }
}
