// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxu extends cxr
{

    private static final long serialVersionUID = 1L;

    private cxu()
    {
    }

    private cxu(jbt jbt1)
    {
        super(jbt1.responseHeader, 0L);
        if (cxr.a)
        {
            jbt1 = String.valueOf(jbt1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jbt1).length() + 33)).append("ArchiveConversationResponse from:").append(jbt1).toString());
        }
    }

    public static cxu k()
    {
        return new cxu();
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jbt)kws.mergeFrom(new jbt(), abyte0);
        if (a(((jbt) (abyte0)).responseHeader))
        {
            return new cyd(((jbt) (abyte0)).responseHeader);
        } else
        {
            return new cxu(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
    }
}
