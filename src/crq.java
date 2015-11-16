// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public final class crq extends crn
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

    public crq(koz koz1, kpp kpp1)
    {
        super(koz1, null, kpp1.f, kpp1.c, a(kpp1.j), "image/image_search");
        koz1 = kpp1.h;
        koz akoz[];
        int i1;
        boolean flag;
        int k1;
        if (koz1 != null)
        {
            l = g.a(((kpl) (koz1)).b, 0);
            m = g.a(((kpl) (koz1)).c, 0);
        } else
        {
            l = 0;
            m = 0;
        }
        akoz = kpp1.j;
        k1 = akoz.length;
        koz1 = null;
        flag = false;
        i1 = 0;
label0:
        do
        {
            kpp1 = koz1;
            if (i1 < k1)
            {
                koz koz2 = akoz[i1];
                int ai[] = koz2.a;
                int l1 = ai.length;
                int j1 = 0;
                kpp1 = koz1;
label1:
                do
                {
label2:
                    {
                        koz1 = kpp1;
                        boolean flag1 = flag;
                        if (j1 < l1)
                        {
                            if (ai[j1] != 337)
                            {
                                break label2;
                            }
                            koz1 = (kqz)koz2.getExtension(kqz.a);
                            kpp1 = koz1;
                            if (koz1 == null)
                            {
                                break label2;
                            }
                            flag1 = true;
                        }
                        kpp1 = koz1;
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
            if (kpp1 != null)
            {
                koz1 = ((kqz) (kpp1)).f;
            } else
            {
                koz1 = null;
            }
            p = koz1;
            if (kpp1 != null)
            {
                koz1 = ((kqz) (kpp1)).e;
            } else
            {
                koz1 = null;
            }
            o = koz1;
            i = null;
            k = null;
            n = 1;
            return;
        } while (true);
    }

    public crq(koz koz1, kqp kqp1)
    {
        String s;
        String s2;
        int i1;
        s2 = kqp1.h;
        i1 = g.a(kqp1.o, 0);
        s = kqp1.h;
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
        super(koz1, null, null, s2, null, s);
        String s1;
        if (!TextUtils.isEmpty(kqp1.e))
        {
            koz1 = kqp1.e;
        } else
        {
            koz1 = null;
        }
        i = koz1;
        j = kqp1.c;
        if (!TextUtils.isEmpty(kqp1.d))
        {
            koz1 = kqp1.d;
        } else
        {
            koz1 = null;
        }
        k = koz1;
        if (kqp1.b != null)
        {
            l = g.a(kqp1.b.k, 0);
            m = g.a(kqp1.b.l, 0);
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

    public crq(int ai[], String s, String s1, int i1, int j1, String s2, int k1)
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

    private static String a(koz akoz[])
    {
        int k1 = akoz.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            koz koz1 = akoz[i1];
            int ai[] = koz1.a;
            int l1 = ai.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                if (ai[j1] != 337)
                {
                    continue;
                }
                kqz kqz1 = (kqz)koz1.getExtension(kqz.a);
                if (kqz1 != null)
                {
                    return kqz1.c;
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
