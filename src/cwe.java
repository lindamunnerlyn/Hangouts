// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class cwe extends cvy
{

    private static final long serialVersionUID = 1L;
    public final String j;

    public cwe(String s, String s1)
    {
        super(s);
        j = s1;
    }

    public String a()
    {
        return "event_queue";
    }

    public void a(aoa aoa1, dcx dcx1)
    {
        if (cvv.e)
        {
            String s = String.valueOf(this);
            String s3 = c;
            String s6 = j;
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s3).length() + String.valueOf(s6).length())).append("onFailed ").append(s).append(" ").append(s3).append(" ").append(s6).toString());
        }
        super.a(aoa1, dcx1);
        if (!d)
        {
            if (cvv.e && (this instanceof cwx))
            {
                String s1 = ((cwx)this).e();
                if (s1 != null)
                {
                    String s4 = String.valueOf("Sending stress message permanently failed with error=");
                    int i = dcx1.c();
                    eev.b("Babel_Stress", (new StringBuilder(String.valueOf(s4).length() + 12 + String.valueOf(s1).length())).append(s4).append(i).append(":").append(s1).toString());
                }
            }
            String s2 = c;
            String s5 = j;
            int k;
            if (dcx1 != null)
            {
                k = dcx1.c();
            } else
            {
                k = 0;
            }
            RealTimeChatService.a(aoa1, s2, s5, k);
            cfo.c(g.nU, aoa1.h());
        }
    }

    public boolean a(cdn cdn, dcx dcx1)
    {
        boolean flag = super.a(cdn, dcx1);
        if (dcx1.c() == 101)
        {
            if (eev.a("Babel_RequestWriter", 3))
            {
                eev.c("Babel_RequestWriter", "Do not retry for EventRequest if network is not available.");
            }
            flag = false;
        }
        return flag;
    }
}
