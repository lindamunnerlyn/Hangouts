// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyi extends cvn
{

    private static final long serialVersionUID = 1L;
    private final boolean g;

    private cyi(iyr iyr1)
    {
        super(iyr1.responseHeader, -1L);
        g = g.a(iyr1.b, false);
        if (cvn.a)
        {
            iyr1 = String.valueOf(iyr1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iyr1).length() + 36)).append("StartPhoneVerificationResponse from:").append(iyr1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iyr)kop.mergeFrom(new iyr(), abyte0);
        if (a(((iyr) (abyte0)).responseHeader))
        {
            return new cvz(((iyr) (abyte0)).responseHeader);
        } else
        {
            return new cyi(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        if (g)
        {
            ebw.c("Babel", "Rate limit exceeded for phone verification");
            aoe = (cpt)hgx.b(g.nS, cpt);
            if (aoe != null)
            {
                aoe.a(105, true);
            }
        }
    }
}
