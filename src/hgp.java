// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class hgp
    implements gua
{

    final hgo a;

    hgp(hgo hgo1)
    {
        a = hgo1;
        super();
    }

    public void a(int i, int j)
    {
        Object obj = a.a.a(j);
        if (!((List) (obj)).isEmpty())
        {
            hgt hgt1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hgo.a(a, i, hgt1))
            {
                hgt1 = (hgt)((Iterator) (obj)).next();
            }

        }
    }
}
