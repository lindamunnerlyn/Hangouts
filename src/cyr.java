// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class cyr extends cxr
{

    private static final long serialVersionUID = 1L;
    private final List g = new ArrayList();

    private cyr(jhr jhr1)
    {
        jhh ajhh[] = jhr1.a;
        int j = ajhh.length;
        for (int i = 0; i < j; i++)
        {
            jhh jhh1 = ajhh[i];
            g.add(cgd.a(jhh1.c));
        }

        if (cxr.a)
        {
            jhr1 = String.valueOf(jhr1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jhr1).length() + 36)).append("GetHangoutParticipantsResponse from:").append(jhr1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jhr)kws.mergeFrom(new jhr(), abyte0);
        if (a(((jhr) (abyte0)).responseHeader))
        {
            return new cyd(((jhr) (abyte0)).responseHeader);
        } else
        {
            return new cyr(abyte0);
        }
    }

    public String k()
    {
        return ((cvl)b).b;
    }

    public List l()
    {
        return g;
    }
}
