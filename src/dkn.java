// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class dkn extends dgj
{

    private byte a[];
    private Map e;
    private boolean f;

    public dkn(aoa aoa, byte abyte0[], String s, boolean flag)
    {
        super(aoa);
        a = abyte0;
        e = new HashMap();
        abyte0 = e;
        if (flag)
        {
            aoa = null;
        } else
        {
            aoa = Integer.valueOf(0);
        }
        abyte0.put(s, aoa);
        f = flag;
    }

    public void a()
    {
        a(((dmf) (new cxn(a, e, f))));
    }
}
