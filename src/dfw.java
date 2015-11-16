// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class dfw extends cxr
{

    private static final long serialVersionUID = 1L;
    public final Map g;
    hyl h;

    private dfw(hyl hyl1)
    {
        super(hyl1.apiHeader);
        h = hyl1;
        HashMap hashmap = new HashMap();
        hyl1 = hyl1.a.a;
        int l = hyl1.length;
        for (int i = 0; i < l; i++)
        {
            String as[] = hyl1[i];
            if (!TextUtils.isEmpty(((hww) (as)).b) && ((hww) (as)).b.startsWith("c"))
            {
                continue;
            }
            dfx dfx1 = new dfx();
            dfx1.a = false;
            Object aobj[] = ((hww) (as)).R;
            int i1 = aobj.length;
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j < i1)
                    {
                        hwf hwf1 = aobj[j];
                        if (g.a(hwf1.b, 0) != 1 || g.a(hwf1.c, 0) != 1)
                        {
                            break label1;
                        }
                        dfx1.a = true;
                    }
                    dfx1.b = ((hww) (as)).c.d;
                    aobj = ((hww) (as)).e;
                    i1 = aobj.length;
                    j = 0;
                    do
                    {
                        if (j >= i1)
                        {
                            break;
                        }
                        hxa hxa1 = aobj[j];
                        dfx1.c = hxa1.b;
                        if (g.a(hxa1.c, false))
                        {
                            break;
                        }
                        j++;
                    } while (true);
                    break label0;
                }
                j++;
            } while (true);
            aobj = ((hww) (as)).d;
            if (aobj.length > 0)
            {
                dfx1.d = aobj[0].b;
            }
            if (((hww) (as)).c.u == null || ((hww) (as)).c.u.b == null)
            {
                continue;
            }
            as = ((hww) (as)).c.u.b;
            i1 = as.length;
            for (int k = 0; k < i1; k++)
            {
                hashmap.put(as[k], dfx1);
            }

        }

        g = Collections.unmodifiableMap(hashmap);
    }

    public static cxr a(hyl hyl1)
    {
        if (a(hyl1.apiHeader))
        {
            String s = String.valueOf(hyl1);
            eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 65)).append("OzMergedPersonLookupResponse.processResponse: request failed for ").append(s).toString());
            return new cyd(hyl1.apiHeader);
        } else
        {
            return new dfw(hyl1);
        }
    }

    public String toString()
    {
        String s = String.valueOf(g);
        return (new StringBuilder(String.valueOf(s).length() + 37)).append("OzMergedPersonLookupResponse{people=").append(s).append("}").toString();
    }
}
