// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyf extends cxr
{

    private static final long serialVersionUID = 1L;

    private cyf(izt izt1)
    {
        super(izt1.responseHeader, -1L);
        if (cxr.a)
        {
            izt1 = String.valueOf(izt1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(izt1).length() + 37)).append("FinishPhoneVerificationResponse from:").append(izt1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (izt)kws.mergeFrom(new izt(), abyte0);
        if (a(((izt) (abyte0)).responseHeader))
        {
            return new cyd(((izt) (abyte0)).responseHeader);
        } else
        {
            return new cyf(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        dcn.b(true);
        aow = (crk)hlp.b(g.nU, crk);
        if (aow != null)
        {
            aow.a(104, false);
        }
    }
}
