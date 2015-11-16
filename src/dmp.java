// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class dmp
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final int a[];
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public dmp(kxc kxc1, String s, String s1, String s2, String s3, String s4)
    {
        a = kxc1.a;
        String s5;
        if (!TextUtils.isEmpty(kxc1.b))
        {
            s5 = kxc1.b;
        } else
        {
            s5 = null;
        }
        b = s5;
        if (!TextUtils.isEmpty(kxc1.c))
        {
            kxc1 = kxc1.c;
        } else
        {
            kxc1 = null;
        }
        c = kxc1;
        if (TextUtils.isEmpty(s))
        {
            s = null;
        }
        d = s;
        if (TextUtils.isEmpty(s1))
        {
            s1 = null;
        }
        e = s1;
        if (TextUtils.isEmpty(s2))
        {
            s2 = null;
        }
        f = s2;
        if (TextUtils.isEmpty(s3))
        {
            s3 = null;
        }
        g = s3;
        h = s4;
    }

    private dmp(kxc kxc1, kyy kyy1)
    {
        this(kxc1, kyy1.e, kyy1.f, a(kyy1.o), kyy1.c, "hangouts/*");
    }

    protected dmp(int ai[], String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        a = ai;
        b = null;
        c = null;
        d = s2;
        e = null;
        f = s4;
        g = s5;
        h = s6;
    }

    static dmp a(lcn lcn1, int i)
    {
        lcn1 = lcn1.a;
        for (int j = 0; j < ((kxc) (lcn1)).a.length; j++)
        {
            int k = ((kxc) (lcn1)).a[j];
            if (k == 249)
            {
                kys kys1 = (kys)lcn1.getExtension(kys.a);
                if (kys1 != null)
                {
                    return new dms(lcn1, kys1);
                }
                continue;
            }
            if (k == 340)
            {
                kxy kxy1 = (kxy)lcn1.getExtension(kxy.a);
                if (kxy1 != null && kxy1.o != null)
                {
                    return new dmr(lcn1, kxy1);
                }
                continue;
            }
            if (k == 339)
            {
                kxs kxs1 = (kxs)lcn1.getExtension(kxs.a);
                if (kxs1 != null)
                {
                    return new dms(lcn1, kxs1);
                }
                continue;
            }
            if (k == 438)
            {
                kxz kxz1 = (kxz)lcn1.getExtension(kxz.a);
                if (kxz1 == null || kxz1.X == null)
                {
                    continue;
                }
                if (i == 3)
                {
                    return new dmu(lcn1, kxz1);
                } else
                {
                    return new dmq(lcn1, kxz1);
                }
            }
            if (k != 335)
            {
                continue;
            }
            kyy kyy1 = (kyy)lcn1.getExtension(kyy.a);
            if (kyy1 != null)
            {
                return new dmp(lcn1, kyy1);
            }
        }

        eev.f("Babel", "Received invalid attachment");
        return null;
    }

    protected static String a(kxc kxc1)
    {
        if (kxc1 != null)
        {
            kxc1 = (kxs)kxc1.getExtension(kxs.a);
            if (kxc1 != null)
            {
                return ((kxs) (kxc1)).c;
            }
        }
        return null;
    }

    public static List a(lcv alcv[], int i)
    {
        ArrayList arraylist;
        int j;
        int k;
        arraylist = new ArrayList();
        k = alcv.length;
        j = 0;
_L14:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj = alcv[j];
        if (!((lcv) (obj)).hasExtension(jmm.a)) goto _L4; else goto _L3
_L3:
        obj = (jmm)((lcv) (obj)).getExtension(jmm.a);
        if (obj == null) goto _L4; else goto _L5
_L5:
        int l = g.a(((jmm) (obj)).b, 0);
        if (l != 1 || !((jmm) (obj)).hasExtension(jmo.a)) goto _L7; else goto _L6
_L6:
        obj = ((jmo)((jmm) (obj)).getExtension(jmo.a)).b;
        if (!((kxc) (obj)).hasExtension(kys.a)) goto _L9; else goto _L8
_L8:
        kys kys1 = (kys)((kxc) (obj)).getExtension(kys.a);
        if (kys1 == null) goto _L11; else goto _L10
_L10:
        obj = new dms(((kxc) (obj)), kys1);
_L12:
        if (obj != null)
        {
            arraylist.add(obj);
        }
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L9:
        if (((kxc) (obj)).hasExtension(kxs.a))
        {
            kxs kxs1 = (kxs)((kxc) (obj)).getExtension(kxs.a);
            if (kxs1 != null)
            {
                obj = new dms(((kxc) (obj)), kxs1);
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L11
_L7:
        if (l == 2 && ((jmm) (obj)).hasExtension(jmn.a))
        {
            obj = ((jmn)((jmm) (obj)).getExtension(jmn.a)).b;
            kxy kxy1 = (kxy)((kxc) (obj)).getExtension(kxy.a);
            if (kxy1 != null && kxy1.o != null)
            {
                obj = new dmr(((kxc) (obj)), kxy1);
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (l == 3 && ((jmm) (obj)).hasExtension(jml.a))
        {
            obj = ((jml)((jmm) (obj)).getExtension(jml.a)).b;
            kxz kxz1 = (kxz)((kxc) (obj)).getExtension(kxz.a);
            if (kxz1 != null && kxz1.X != null)
            {
                if (i == 3)
                {
                    obj = new dmu(((kxc) (obj)), kxz1);
                } else
                {
                    obj = new dmq(((kxc) (obj)), kxz1);
                }
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (l == 5 && ((jmm) (obj)).hasExtension(jmp.a))
        {
            obj = ((jmp)((jmm) (obj)).getExtension(jmp.a)).b;
            kyy kyy1 = (kyy)((kxc) (obj)).getExtension(kyy.a);
            if (kyy1 != null)
            {
                obj = new dmp(((kxc) (obj)), kyy1);
                continue; /* Loop/switch isn't completed */
            }
        }
_L11:
        eev.f("Babel", "Received invalid attachment");
        obj = null;
        if (true) goto _L12; else goto _L2
_L2:
        return arraylist;
        if (true) goto _L14; else goto _L13
_L13:
    }
}
