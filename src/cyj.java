// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class cyj extends cxr
{

    private static final long serialVersionUID = 1L;
    private int g;
    private int h;
    private int i;
    private final List j;

    private cyj(hyd hyd1)
    {
        super(hyd1.apiHeader);
        hyu hyu1 = hyd1.a.a;
        if (cxr.a)
        {
            hyd1 = String.valueOf(hyd1.a.a);
            eev.b("Babel", (new StringBuilder(String.valueOf(hyd1).length() + 64)).append("GetChatAclSettingsResponse.processResponse: retrieved chat ACLs ").append(hyd1).toString());
        }
        if (hyu1 != null)
        {
            g = g.a(hyu1.a, 0);
            h = g.a(hyu1.f, 0);
            i = g.a(hyu1.e, 0);
            if (hyu1.c.length > 0)
            {
                j = new ArrayList();
                hyd1 = hyu1.c;
                int l = hyd1.length;
                for (int k = 0; k < l; k++)
                {
                    Object obj = hyd1[k];
                    cyk cyk1 = new cyk();
                    cyk1.b = ((hyv) (obj)).b;
                    cyk1.a = ((hyv) (obj)).a;
                    cyk1.c = g.a(((hyv) (obj)).c, 0);
                    j.add(cyk1);
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

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyd)kws.mergeFrom(new hyd(), abyte0);
        if (a(((hyd) (abyte0)).apiHeader))
        {
            return new cyd(((hyd) (abyte0)).apiHeader);
        } else
        {
            return new cyj(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        ard.a(aow1.f().h(), g, h, i, j);
    }
}
