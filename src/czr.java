// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czr extends cxr
{

    private static final long serialVersionUID = 1L;

    private czr(jdj jdj1)
    {
        super(jdj1.responseHeader, -1L);
        if (cxr.a)
        {
            jdj1 = String.valueOf(jdj1);
            eev.b("Babel", (new StringBuilder(String.valueOf(jdj1).length() + 31)).append("ReportAbuseConversationResponse").append(jdj1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdj)kws.mergeFrom(new jdj(), abyte0);
        if (a(((jdj) (abyte0)).responseHeader))
        {
            return new cyd(((jdj) (abyte0)).responseHeader);
        } else
        {
            return new czr(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        if (eev.a("Babel", 3))
        {
            aow = String.valueOf("processReportAbuseConversationResponse response status: ");
            int i = c.b;
            dgk = c.a;
            eev.d("Babel", (new StringBuilder(String.valueOf(aow).length() + 30 + String.valueOf(dgk).length())).append(aow).append(i).append(" error description ").append(dgk).toString());
        }
    }
}
