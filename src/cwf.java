// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class cwf extends cvn
{

    private static final long serialVersionUID = 1L;
    private int g;
    private int h;
    private int i;
    private final List j;

    private cwf(hsz hsz1)
    {
        super(hsz1.apiHeader);
        htq htq1 = hsz1.a.a;
        if (cvn.a)
        {
            hsz1 = String.valueOf(hsz1.a.a);
            ebw.b("Babel", (new StringBuilder(String.valueOf(hsz1).length() + 64)).append("GetChatAclSettingsResponse.processResponse: retrieved chat ACLs ").append(hsz1).toString());
        }
        if (htq1 != null)
        {
            g = g.a(htq1.a, 0);
            h = g.a(htq1.f, 0);
            i = g.a(htq1.e, 0);
            if (htq1.c.length > 0)
            {
                j = new ArrayList();
                hsz1 = htq1.c;
                int l = hsz1.length;
                for (int k = 0; k < l; k++)
                {
                    Object obj = hsz1[k];
                    cwg cwg1 = new cwg();
                    cwg1.b = ((htr) (obj)).b;
                    cwg1.a = ((htr) (obj)).a;
                    cwg1.c = g.a(((htr) (obj)).c, 0);
                    j.add(cwg1);
                }

            } else
            {
                j = null;
            }
            return;
        } else
        {
            j = null;
            return;
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (hsz)kop.mergeFrom(new hsz(), abyte0);
        if (a(((hsz) (abyte0)).apiHeader))
        {
            return new cvz(((hsz) (abyte0)).apiHeader);
        } else
        {
            return new cwf(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        aqm.a(aoe1.f().h(), g, h, i, j);
    }
}
