// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public class cyo extends cxr
{

    private static final long serialVersionUID = 1L;
    private final Map g = new HashMap();

    private cyo(jfz jfz1)
    {
        super(jfz1.responseHeader, -1L);
        jfz1 = jfz1.a;
        int j = jfz1.length;
        for (int i = 0; i < j; i++)
        {
            String s = jfz1[i];
            Object obj = ((jfw) (s)).a;
            if (((jfw) (s)).b != null && obj != null && ((jfx) (obj)).b != null)
            {
                s = ((jfw) (s)).b;
                obj = ((jfx) (obj)).b;
                g.put(obj, s);
            }
        }

    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jfz)kws.mergeFrom(new jfz(), abyte0);
        if (a(((jfz) (abyte0)).responseHeader))
        {
            return new cyd(((jfz) (abyte0)).responseHeader);
        } else
        {
            return new cyo(abyte0);
        }
    }

    public Map k()
    {
        return g;
    }
}
