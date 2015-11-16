// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxl extends cvy
{

    private static final long serialVersionUID = 1L;

    private cxl(iwz iwz1)
    {
        super(iwz1.responseHeader, g.a(iwz1.a.c, 0L), g.a(iwz1.a.n, 0L), iwz1.a.d);
        if (cvn.a)
        {
            iwz1 = String.valueOf(iwz1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iwz1).length() + 32)).append("RenameConversationResponse from:").append(iwz1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iwz)kop.mergeFrom(new iwz(), abyte0);
        if (a(((iwz) (abyte0)).responseHeader))
        {
            return new cvz(((iwz) (abyte0)).responseHeader);
        } else
        {
            return new cxl(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
    }
}
