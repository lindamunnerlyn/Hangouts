// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czp extends cyc
{

    private static final long serialVersionUID = 1L;

    private czp(jde jde1)
    {
        super(jde1.responseHeader, g.a(jde1.a.c, 0L), g.a(jde1.a.n, 0L), jde1.a.d);
        if (cxr.a)
        {
            jde1 = String.valueOf(jde1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jde1).length() + 32)).append("RenameConversationResponse from:").append(jde1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jde)kws.mergeFrom(new jde(), abyte0);
        if (a(((jde) (abyte0)).responseHeader))
        {
            return new cyd(((jde) (abyte0)).responseHeader);
        } else
        {
            return new czp(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
    }
}
