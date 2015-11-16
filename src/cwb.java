// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwb extends cvn
{

    private static final long serialVersionUID = 1L;

    private cwb(ito ito1)
    {
        super(ito1.responseHeader, -1L);
        if (cvn.a)
        {
            ito1 = String.valueOf(ito1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ito1).length() + 37)).append("FinishPhoneVerificationResponse from:").append(ito1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ito)kop.mergeFrom(new ito(), abyte0);
        if (a(((ito) (abyte0)).responseHeader))
        {
            return new cvz(((ito) (abyte0)).responseHeader);
        } else
        {
            return new cwb(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        dbf.b(true);
        aoe = (cpt)hgx.b(g.nS, cpt);
        if (aoe != null)
        {
            aoe.a(104, false);
        }
    }
}
