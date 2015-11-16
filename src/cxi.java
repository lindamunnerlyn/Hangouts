// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cxi extends cvn
{

    private static final long serialVersionUID = 1L;
    private int g;
    private String h;
    private final String i;

    private cxi(iwv iwv1)
    {
        super(iwv1.responseHeader, -1L);
        g = g.a(iwv1.a, 0);
        h = iwv1.b;
        i = iwv1.c;
        if (cvn.a)
        {
            iwv1 = String.valueOf(iwv1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iwv1).length() + 28)).append("RegisterDeviceResponse from:").append(iwv1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iwv)kop.mergeFrom(new iwv(), abyte0);
        if (a(((iwv) (abyte0)).responseHeader))
        {
            return new cvz(((iwv) (abyte0)).responseHeader);
        } else
        {
            return new cxi(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        ebw.e("Babel", "ProcessRegisterDeviceResponse");
        if (aoe1 != null)
        {
            aoe1 = aoe1.f();
        } else
        {
            aoe1 = null;
        }
        if (aoe1 != null && dbf.d(aoe1))
        {
            dfb = String.valueOf("Perform warm sync in case there are messages missed before the device is registered for account ");
            String s = String.valueOf(ebw.b(aoe1.a()));
            if (s.length() != 0)
            {
                dfb = dfb.concat(s);
            } else
            {
                dfb = new String(dfb);
            }
            ebw.e("Babel", dfb);
            RealTimeChatService.a(aoe1.h(), false, false, 0, false);
        }
    }

    public void a(dko dko)
    {
        super.a(dko);
        dko = (cun)b;
        if (((cun) (dko)).u != null)
        {
            g = 2;
            h = ((cun) (dko)).u;
        }
    }

    public int k()
    {
        return ((cun)b).a;
    }

    public String l()
    {
        return ((cun)b).m;
    }

    public String m()
    {
        return i;
    }

    public int n()
    {
        return g;
    }

    public String o()
    {
        return h;
    }

    public boolean p()
    {
        return ((cun)b).k;
    }
}
