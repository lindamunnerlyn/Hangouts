// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public final class dms extends dmp
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public String i;
    public String j;
    public String k;
    public final int l;
    public final int m;
    public int n;
    public String o;
    public String p;

    public dms(kxc kxc1, kxs kxs1)
    {
        super(kxc1, null, kxs1.f, kxs1.c, a(kxs1.j), "image/image_search");
        kxc1 = kxs1.h;
        kxc akxc[];
        int i1;
        boolean flag;
        int k1;
        if (kxc1 != null)
        {
            l = g.a(((kxo) (kxc1)).b, 0);
            m = g.a(((kxo) (kxc1)).c, 0);
        } else
        {
            l = 0;
            m = 0;
        }
        akxc = kxs1.j;
        k1 = akxc.length;
        kxc1 = null;
        flag = false;
        i1 = 0;
label0:
        do
        {
            kxs1 = kxc1;
            if (i1 < k1)
            {
                kxc kxc2 = akxc[i1];
                int ai[] = kxc2.a;
                int l1 = ai.length;
                int j1 = 0;
                kxs1 = kxc1;
label1:
                do
                {
label2:
                    {
                        kxc1 = kxs1;
                        boolean flag1 = flag;
                        if (j1 < l1)
                        {
                            if (ai[j1] != 337)
                            {
                                break label2;
                            }
                            kxc1 = (kzc)kxc2.getExtension(kzc.a);
                            kxs1 = kxc1;
                            if (kxc1 == null)
                            {
                                break label2;
                            }
                            flag1 = true;
                        }
                        kxs1 = kxc1;
                        if (flag1)
                        {
                            break label1;
                        }
                        i1++;
                        flag = flag1;
                        continue label0;
                    }
                    j1++;
                } while (true);
            }
            if (kxs1 != null)
            {
                kxc1 = ((kzc) (kxs1)).f;
            } else
            {
                kxc1 = null;
            }
            p = kxc1;
            if (kxs1 != null)
            {
                kxc1 = ((kzc) (kxs1)).e;
            } else
            {
                kxc1 = null;
            }
            o = kxc1;
            i = null;
            k = null;
            n = 1;
            return;
        } while (true);
    }

    public dms(kxc kxc1, kys kys1)
    {
        String s;
        String s2;
        int i1;
        s2 = kys1.h;
        i1 = g.a(kys1.o, 0);
        s = kys1.h;
        i1;
        JVM INSTR tableswitch 1 4: default 52
    //                   1 166
    //                   2 182
    //                   3 52
    //                   4 176;
           goto _L1 _L2 _L3 _L1 _L4
_L3:
        break MISSING_BLOCK_LABEL_182;
_L1:
        s = null;
_L5:
        super(kxc1, null, null, s2, null, s);
        String s1;
        if (!TextUtils.isEmpty(kys1.e))
        {
            kxc1 = kys1.e;
        } else
        {
            kxc1 = null;
        }
        i = kxc1;
        j = kys1.c;
        if (!TextUtils.isEmpty(kys1.d))
        {
            kxc1 = kys1.d;
        } else
        {
            kxc1 = null;
        }
        k = kxc1;
        if (kys1.b != null)
        {
            l = g.a(kys1.b.k, 0);
            m = g.a(kys1.b.l, 0);
        } else
        {
            l = 0;
            m = 0;
        }
        n = 1;
        p = null;
        o = null;
        return;
_L2:
        s = g.a(s, "image/*");
          goto _L5
_L4:
        s = "image/gif";
          goto _L5
        s1 = g.a(s, "video/*");
        s = s1;
        if (!g.d(s1))
        {
            s = "video/*";
        }
          goto _L5
    }

    public dms(int ai[], String s, String s1, int i1, int j1, String s2, int k1)
    {
        super(ai, null, null, null, null, s1, null, s2);
        i = s;
        j = null;
        k = null;
        l = i1;
        m = j1;
        n = k1;
        p = null;
        o = null;
    }

    private static String a(kxc akxc[])
    {
        int k1 = akxc.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            kxc kxc1 = akxc[i1];
            int ai[] = kxc1.a;
            int l1 = ai.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                if (ai[j1] != 337)
                {
                    continue;
                }
                kzc kzc1 = (kzc)kxc1.getExtension(kzc.a);
                if (kzc1 != null)
                {
                    return kzc1.c;
                }
            }

        }

        return null;
    }

    public String toString()
    {
        String s = b;
        String s1 = c;
        String s2 = i;
        String s3 = j;
        String s4 = f;
        int i1 = l;
        int j1 = m;
        String s5 = h;
        return (new StringBuilder(String.valueOf(s).length() + 106 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append("id: ").append(s).append(" canonicalId ").append(s1).append(" photoId: ").append(s2).append(" photoOwnerId: ").append(s3).append(" imageUrl: ").append(s4).append(" width: ").append(i1).append(" height: ").append(j1).append(" contentType: ").append(s5).toString();
    }
}
