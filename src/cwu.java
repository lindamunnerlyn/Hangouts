// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cwu extends cvn
{

    private static final long serialVersionUID = 1L;
    private final List g = new ArrayList();

    private cwu(htn htn1)
    {
        super(htn1.apiHeader);
        if (htn1.a != null && htn1.a.b != null)
        {
            hye ahye[] = htn1.a.b;
            int k = ahye.length;
            for (int i = 0; i < k; i++)
            {
                Object obj = ahye[i];
                if (obj == null)
                {
                    continue;
                }
                cwv cwv1 = new cwv();
                cwv1.a = ((hye) (obj)).i;
                cwv1.b = ((hye) (obj)).f;
                if (((hye) (obj)).b == null)
                {
                    htn1 = null;
                } else
                {
                    htn1 = ((hye) (obj)).b.h;
                }
                cwv1.e = new ArrayList();
                if (((hye) (obj)).p != null)
                {
                    obj = ((hye) (obj)).p;
                    int l = obj.length;
                    for (int j = 0; j < l; j++)
                    {
                        Object obj1 = obj[j];
                        if (obj1 == null || ((hyn) (obj1)).c == null)
                        {
                            continue;
                        }
                        cww cww1 = new cww();
                        cww1.a = ((hyn) (obj1)).h;
                        cww1.b = ((hyn) (obj1)).c.a;
                        if (cww1.b != null)
                        {
                            cww1.b = cww1.b.replace("s0-d/photo.jpg", "");
                        }
                        if (cww1.a.equals(htn1))
                        {
                            cwv1.c = cww1;
                        }
                        cwv1.e.add(cww1);
                    }

                }
                g.add(cwv1);
            }

        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (htn)kop.mergeFrom(new htn(), abyte0);
        if (a(((htn) (abyte0)).apiHeader))
        {
            return new cvz(((htn) (abyte0)).apiHeader);
        } else
        {
            return new cwu(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (g.size() == 0)
        {
            ebw.g("Babel", "Missing sticker response data.");
            if (!g.a(g.nS, "babel_stickers_retry_on_fail", true))
            {
                ank.b(g.nS, aoe1.f(), System.currentTimeMillis());
            }
            return;
        }
        if (cvn.a)
        {
            int i = g.size();
            ebw.b("Babel", (new StringBuilder(24)).append("Albums found:").append(i).toString());
            String s;
            int j;
            for (dfb = g.iterator(); dfb.hasNext(); ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 19)).append("Album:").append(s).append(": ").append(j).toString()))
            {
                cwv cwv1 = (cwv)dfb.next();
                s = cwv1.b;
                j = cwv1.e.size();
            }

        }
        aoe1.c(g);
        ank.b(g.nS, aoe1.f(), System.currentTimeMillis());
    }
}
