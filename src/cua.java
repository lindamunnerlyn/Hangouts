// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class cua extends ctu
{

    private static final long serialVersionUID = 1L;
    public final String j;

    public cua(String s, String s1)
    {
        super(s);
        j = s1;
    }

    public String a()
    {
        return "event_queue";
    }

    public void a(ani ani1, dbo dbo1)
    {
        if (ctr.e)
        {
            String s = String.valueOf(this);
            String s3 = c;
            String s6 = j;
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s3).length() + String.valueOf(s6).length())).append("onFailed ").append(s).append(" ").append(s3).append(" ").append(s6).toString());
        }
        super.a(ani1, dbo1);
        if (!d)
        {
            if (ctr.e && (this instanceof cut))
            {
                String s1 = ((cut)this).e();
                if (s1 != null)
                {
                    String s4 = String.valueOf("Sending stress message permanently failed with error=");
                    int i = dbo1.c();
                    ebw.b("Babel_Stress", (new StringBuilder(String.valueOf(s4).length() + 12 + String.valueOf(s1).length())).append(s4).append(i).append(":").append(s1).toString());
                }
            }
            String s2 = c;
            String s5 = j;
            int k;
            if (dbo1 != null)
            {
                k = dbo1.c();
            } else
            {
                k = 0;
            }
            RealTimeChatService.a(ani1, s2, s5, k);
            cej.c(g.nS, ani1.h());
        }
    }

    public boolean a(cci cci, dbo dbo1)
    {
        boolean flag = super.a(cci, dbo1);
        if (dbo1.c() == 101)
        {
            if (ebw.a("Babel_RequestWriter", 3))
            {
                ebw.c("Babel_RequestWriter", "Do not retry for EventRequest if network is not available.");
            }
            flag = false;
        }
        return flag;
    }
}
