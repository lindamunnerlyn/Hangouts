// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.List;

public class cxs extends cvn
{

    private static final long serialVersionUID = 1L;
    private final List g = new ArrayList();

    private cxs(ixl ixl1)
    {
        super(ixl1.responseHeader, -1L);
        if (!ActivityManager.isUserAMonkey()) goto _L2; else goto _L1
_L1:
_L4:
        if (cvn.a)
        {
            ixl1 = String.valueOf(ixl1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ixl1).length() + 28)).append("SearchEntitiesResponse from:").append(ixl1).toString());
        }
        return;
_L2:
        g = g.a(ixl1.a);
        if (cvn.a)
        {
            int i = g.size();
            ebw.b("Babel", (new StringBuilder(54)).append("SearchEntitiesResponse. Number of entities:").append(i).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixl)kop.mergeFrom(new ixl(), abyte0);
        if (a(((ixl) (abyte0)).responseHeader))
        {
            return new cvz(((ixl) (abyte0)).responseHeader);
        } else
        {
            return new cxs(abyte0);
        }
    }

    public List k()
    {
        return g;
    }
}
