// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class hby
    implements gpp
{

    final hbx a;

    hby(hbx hbx1)
    {
        a = hbx1;
        super();
    }

    public void a(int i, int j)
    {
        Object obj = hbx.a(a).a(j);
        if (!((List) (obj)).isEmpty())
        {
            hcc hcc1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hbx.a(a, i, hcc1))
            {
                hcc1 = (hcc)((Iterator) (obj)).next();
            }

        }
    }
}
