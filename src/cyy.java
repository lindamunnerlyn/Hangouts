// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cyy extends cxr
{

    private static final long serialVersionUID = 1L;
    private final List g = new ArrayList();

    private cyy(hyr hyr1)
    {
        super(hyr1.apiHeader);
        if (hyr1.a != null && hyr1.a.b != null)
        {
            idi aidi[] = hyr1.a.b;
            int k = aidi.length;
            for (int i = 0; i < k; i++)
            {
                Object obj = aidi[i];
                if (obj == null)
                {
                    continue;
                }
                cyz cyz1 = new cyz();
                cyz1.a = ((idi) (obj)).i;
                cyz1.b = ((idi) (obj)).f;
                if (((idi) (obj)).b == null)
                {
                    hyr1 = null;
                } else
                {
                    hyr1 = ((idi) (obj)).b.h;
                }
                cyz1.e = new ArrayList();
                if (((idi) (obj)).p != null)
                {
                    obj = ((idi) (obj)).p;
                    int l = obj.length;
                    for (int j = 0; j < l; j++)
                    {
                        Object obj1 = obj[j];
                        if (obj1 == null || ((idr) (obj1)).c == null)
                        {
                            continue;
                        }
                        cza cza1 = new cza();
                        cza1.a = ((idr) (obj1)).h;
                        cza1.b = ((idr) (obj1)).c.a;
                        if (cza1.b != null)
                        {
                            cza1.b = cza1.b.replace("s0-d/photo.jpg", "");
                        }
                        if (cza1.a.equals(hyr1))
                        {
                            cyz1.c = cza1;
                        }
                        cyz1.e.add(cza1);
                    }

                }
                g.add(cyz1);
            }

        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyr)kws.mergeFrom(new hyr(), abyte0);
        if (a(((hyr) (abyte0)).apiHeader))
        {
            return new cyd(((hyr) (abyte0)).apiHeader);
        } else
        {
            return new cyy(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (g.size() == 0)
        {
            eev.g("Babel", "Missing sticker response data.");
            if (!g.a(g.nU, "babel_stickers_retry_on_fail", true))
            {
                aoc.b(g.nU, aow1.f(), System.currentTimeMillis());
            }
            return;
        }
        if (cxr.a)
        {
            int i = g.size();
            eev.b("Babel", (new StringBuilder(24)).append("Albums found:").append(i).toString());
            String s;
            int j;
            for (dgk = g.iterator(); dgk.hasNext(); eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 19)).append("Album:").append(s).append(": ").append(j).toString()))
            {
                cyz cyz1 = (cyz)dgk.next();
                s = cyz1.b;
                j = cyz1.e.size();
            }

        }
        aow1.c(g);
        aoc.b(g.nU, aow1.f(), System.currentTimeMillis());
    }
}
