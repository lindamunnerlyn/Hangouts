// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dam extends cxr
{

    private static final long serialVersionUID = 1L;
    private final boolean g;

    private dam(jew jew1)
    {
        super(jew1.responseHeader, -1L);
        g = g.a(jew1.b, false);
        if (cxr.a)
        {
            jew1 = String.valueOf(jew1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jew1).length() + 36)).append("StartPhoneVerificationResponse from:").append(jew1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jew)kws.mergeFrom(new jew(), abyte0);
        if (a(((jew) (abyte0)).responseHeader))
        {
            return new cyd(((jew) (abyte0)).responseHeader);
        } else
        {
            return new dam(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        if (g)
        {
            eev.c("Babel", "Rate limit exceeded for phone verification");
            aow = (crk)hlp.b(g.nU, crk);
            if (aow != null)
            {
                aow.a(105, true);
            }
        }
    }
}
