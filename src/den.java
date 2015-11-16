// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class den extends cvn
{

    private static final long serialVersionUID = 1L;
    public final Map g;
    hth h;

    private den(hth hth1)
    {
        super(hth1.apiHeader);
        h = hth1;
        HashMap hashmap = new HashMap();
        hth1 = hth1.a.a;
        int l = hth1.length;
        for (int i = 0; i < l; i++)
        {
            String as[] = hth1[i];
            if (!TextUtils.isEmpty(((hrt) (as)).a) && ((hrt) (as)).a.startsWith("c"))
            {
                continue;
            }
            deo deo1 = new deo();
            deo1.a = false;
            Object aobj[] = ((hrt) (as)).Q;
            int i1 = aobj.length;
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j < i1)
                    {
                        hrh hrh1 = aobj[j];
                        if (g.a(hrh1.b, 0) != 1 || g.a(hrh1.c, 0) != 1)
                        {
                            break label1;
                        }
                        deo1.a = true;
                    }
                    deo1.b = ((hrt) (as)).b.d;
                    aobj = ((hrt) (as)).d;
                    i1 = aobj.length;
                    j = 0;
                    do
                    {
                        if (j >= i1)
                        {
                            break;
                        }
                        hrx hrx1 = aobj[j];
                        deo1.c = hrx1.b;
                        if (g.a(hrx1.c, false))
                        {
                            break;
                        }
                        j++;
                    } while (true);
                    break label0;
                }
                j++;
            } while (true);
            aobj = ((hrt) (as)).c;
            if (aobj.length > 0)
            {
                deo1.d = aobj[0].b;
            }
            if (((hrt) (as)).b.u == null || ((hrt) (as)).b.u.b == null)
            {
                continue;
            }
            as = ((hrt) (as)).b.u.b;
            i1 = as.length;
            for (int k = 0; k < i1; k++)
            {
                hashmap.put(as[k], deo1);
            }

        }

        g = Collections.unmodifiableMap(hashmap);
    }

    public static cvn a(hth hth1)
    {
        if (a(hth1.apiHeader))
        {
            String s = String.valueOf(hth1);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 65)).append("OzMergedPersonLookupResponse.processResponse: request failed for ").append(s).toString());
            return new cvz(hth1.apiHeader);
        } else
        {
            return new den(hth1);
        }
    }

    public String toString()
    {
        String s = String.valueOf(g);
        return (new StringBuilder(String.valueOf(s).length() + 37)).append("OzMergedPersonLookupResponse{people=").append(s).append("}").toString();
    }
}
