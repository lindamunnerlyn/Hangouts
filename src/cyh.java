// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyh extends cxr
{

    private static final long serialVersionUID = 1L;
    private final byte g[];
    private final byte h[];

    private cyh(jgr jgr1)
    {
        super(jgr1.responseHeader, -1L);
        if (cxr.a)
        {
            String s = String.valueOf(jgr1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 30)).append("GetBroadcastInfoResponse from:").append(s).toString());
        }
        g = jgc.toByteArray(jgr1.a);
        h = jif.toByteArray(jgr1.b);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jgr)kws.mergeFrom(new jgr(), abyte0);
        if (a(((jgr) (abyte0)).responseHeader) || ((jgr) (abyte0)).a == null)
        {
            return new cyd(((jgr) (abyte0)).responseHeader);
        } else
        {
            return new cyh(abyte0);
        }
    }
}
