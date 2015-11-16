// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxs extends cxr
{

    private static final long serialVersionUID = 1L;
    private final byte g[];
    private final byte h[];

    private cxs(jgn jgn1)
    {
        super(jgn1.responseHeader, -1L);
        if (cxr.a)
        {
            String s = String.valueOf(jgn1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 26)).append("AddBroadcastResponse from:").append(s).toString());
        }
        g = jgc.toByteArray(jgn1.a);
        h = jif.toByteArray(jgn1.b);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jgn)kws.mergeFrom(new jgn(), abyte0);
        if (a(((jgn) (abyte0)).responseHeader))
        {
            return new cyd(((jgn) (abyte0)).responseHeader);
        } else
        {
            return new cxs(abyte0);
        }
    }
}
