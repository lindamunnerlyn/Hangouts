// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class asf extends dhy
{

    final ase a;

    asf(ase ase1)
    {
        a = ase1;
        super();
    }

    public void a(int i, aoa aoa1, dmf dmf, dcx dcx)
    {
        if (dmf instanceof cvz)
        {
            dcx = ((cvz)dmf).j;
            if (dcx != null)
            {
                i = aoa1.h();
                dmf = (Set)a.a.get(Integer.valueOf(i));
                aoa1 = dmf;
                if (dmf == null)
                {
                    dmf = a.a;
                    aoa1 = new HashSet();
                    dmf.put(Integer.valueOf(i), aoa1);
                }
                aoa1.add(dcx);
            }
        }
    }
}
