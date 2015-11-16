// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyp extends cxr
{

    private static final long serialVersionUID = 1L;
    private final String g;

    private cyp(jhx jhx1)
    {
        g = jhx1.a;
        if (cxr.a)
        {
            jhx1 = String.valueOf(jhx1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jhx1).length() + 26)).append("GetHangoutIdResponse from:").append(jhx1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jhx)kws.mergeFrom(new jhx(), abyte0);
        if (a(((jhx) (abyte0)).responseHeader))
        {
            return new cyd(((jhx) (abyte0)).responseHeader);
        } else
        {
            return new cyp(abyte0);
        }
    }

    public String k()
    {
        return g;
    }

    public String l()
    {
        return ((cvj)b).a;
    }
}
