// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxn extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxn(ixe ixe1)
    {
        super(ixe1.responseHeader, -1L);
        if (cvn.a)
        {
            ixe1 = String.valueOf(ixe1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(ixe1).length() + 31)).append("ReportAbuseConversationResponse").append(ixe1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixe)kop.mergeFrom(new ixe(), abyte0);
        if (a(((ixe) (abyte0)).responseHeader))
        {
            return new cvz(((ixe) (abyte0)).responseHeader);
        } else
        {
            return new cxn(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        if (ebw.a("Babel", 3))
        {
            aoe = String.valueOf("processReportAbuseConversationResponse response status: ");
            int i = c.b;
            dfb = c.a;
            ebw.d("Babel", (new StringBuilder(String.valueOf(aoe).length() + 30 + String.valueOf(dfb).length())).append(aoe).append(i).append(" error description ").append(dfb).toString());
        }
    }
}
