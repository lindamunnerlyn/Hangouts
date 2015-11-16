// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxw extends cxr
{

    private static final long serialVersionUID = 1L;
    private final String g;

    private cxw(jhe jhe1)
    {
        if (jhe1.a != null)
        {
            g = jhe1.a.a;
        } else
        {
            g = null;
        }
        if (cxr.a)
        {
            jhe1 = String.valueOf(jhe1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jhe1).length() + 29)).append("CreateHangoutIdResponse from:").append(jhe1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jhe)kws.mergeFrom(new jhe(), abyte0);
        if (a(((jhe) (abyte0)).responseHeader))
        {
            return new cyd(((jhe) (abyte0)).responseHeader);
        } else
        {
            return new cxw(abyte0);
        }
    }

    public String k()
    {
        return g;
    }
}
