// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.List;

public class czw extends cxr
{

    private static final long serialVersionUID = 1L;
    private final List g = new ArrayList();

    private czw(jdq jdq1)
    {
        super(jdq1.responseHeader, -1L);
        if (!ActivityManager.isUserAMonkey()) goto _L2; else goto _L1
_L1:
_L4:
        if (cxr.a)
        {
            jdq1 = String.valueOf(jdq1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jdq1).length() + 28)).append("SearchEntitiesResponse from:").append(jdq1).toString());
        }
        return;
_L2:
        g = g.a(jdq1.a);
        if (cxr.a)
        {
            int i = g.size();
            eev.b("Babel", (new StringBuilder(54)).append("SearchEntitiesResponse. Number of entities:").append(i).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdq)kws.mergeFrom(new jdq(), abyte0);
        if (a(((jdq) (abyte0)).responseHeader))
        {
            return new cyd(((jdq) (abyte0)).responseHeader);
        } else
        {
            return new czw(abyte0);
        }
    }

    public List k()
    {
        return g;
    }
}
