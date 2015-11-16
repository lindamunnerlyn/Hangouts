// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czf extends cxr
{

    private static final long serialVersionUID = 1L;

    private czf(jgp jgp1)
    {
        super(jgp1.responseHeader, -1L);
        if (cxr.a)
        {
            jgp1 = String.valueOf(jgp1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jgp1).length() + 33)).append("ModifyBroadcastInfoResponse from:").append(jgp1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jgp)kws.mergeFrom(new jgp(), abyte0);
        if (g.a(((jgp) (abyte0)).responseHeader.a, 0) != 9 && a(((jgp) (abyte0)).responseHeader))
        {
            return new cyd(((jgp) (abyte0)).responseHeader);
        } else
        {
            return new czf(abyte0);
        }
    }
}
