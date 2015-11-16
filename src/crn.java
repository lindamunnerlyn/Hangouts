// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class crn
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

    public crn(koz koz1, String s, String s1, String s2, String s3, String s4)
    {
        a = koz1.a;
        String s5;
        if (!TextUtils.isEmpty(koz1.b))
        {
            s5 = koz1.b;
        } else
        {
            s5 = null;
        }
        b = s5;
        if (!TextUtils.isEmpty(koz1.c))
        {
            koz1 = koz1.c;
        } else
        {
            koz1 = null;
        }
        c = koz1;
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

    private crn(koz koz1, kqv kqv1)
    {
        this(koz1, kqv1.e, kqv1.f, a(kqv1.o), kqv1.c, "hangouts/*");
    }

    protected crn(int ai[], String s, String s1, String s2, String s3, String s4, String s5, 
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

    static crn a(kuj kuj1, int i)
    {
        kuj1 = kuj1.a;
        for (int j = 0; j < ((koz) (kuj1)).a.length; j++)
        {
            int k = ((koz) (kuj1)).a[j];
            if (k == 249)
            {
                kqp kqp1 = (kqp)kuj1.getExtension(kqp.a);
                if (kqp1 != null)
                {
                    return new crq(kuj1, kqp1);
                }
                continue;
            }
            if (k == 340)
            {
                kpv kpv1 = (kpv)kuj1.getExtension(kpv.a);
                if (kpv1 != null && kpv1.o != null)
                {
                    return new crp(kuj1, kpv1);
                }
                continue;
            }
            if (k == 339)
            {
                kpp kpp1 = (kpp)kuj1.getExtension(kpp.a);
                if (kpp1 != null)
                {
                    return new crq(kuj1, kpp1);
                }
                continue;
            }
            if (k == 438)
            {
                kpw kpw1 = (kpw)kuj1.getExtension(kpw.a);
                if (kpw1 == null || kpw1.X == null)
                {
                    continue;
                }
                if (i == 3)
                {
                    return new crs(kuj1, kpw1);
                } else
                {
                    return new cro(kuj1, kpw1);
                }
            }
            if (k != 335)
            {
                continue;
            }
            kqv kqv1 = (kqv)kuj1.getExtension(kqv.a);
            if (kqv1 != null)
            {
                return new crn(kuj1, kqv1);
            }
        }

        ebw.f("Babel", "Received invalid attachment");
        return null;
    }

    protected static String a(koz koz1)
    {
        if (koz1 != null)
        {
            koz1 = (kpp)koz1.getExtension(kpp.a);
            if (koz1 != null)
            {
                return ((kpp) (koz1)).c;
            }
        }
        return null;
    }

    public static List a(kur akur[], int i)
    {
        ArrayList arraylist;
        int j;
        int k;
        arraylist = new ArrayList();
        k = akur.length;
        j = 0;
_L14:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj = akur[j];
        if (!((kur) (obj)).hasExtension(jfw.a)) goto _L4; else goto _L3
_L3:
        obj = (jfw)((kur) (obj)).getExtension(jfw.a);
        if (obj == null) goto _L4; else goto _L5
_L5:
        int l = g.a(((jfw) (obj)).b, 0);
        if (l != 1 || !((jfw) (obj)).hasExtension(jfy.a)) goto _L7; else goto _L6
_L6:
        obj = ((jfy)((jfw) (obj)).getExtension(jfy.a)).b;
        if (!((koz) (obj)).hasExtension(kqp.a)) goto _L9; else goto _L8
_L8:
        kqp kqp1 = (kqp)((koz) (obj)).getExtension(kqp.a);
        if (kqp1 == null) goto _L11; else goto _L10
_L10:
        obj = new crq(((koz) (obj)), kqp1);
_L12:
        if (obj != null)
        {
            arraylist.add(obj);
        }
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L9:
        if (((koz) (obj)).hasExtension(kpp.a))
        {
            kpp kpp1 = (kpp)((koz) (obj)).getExtension(kpp.a);
            if (kpp1 != null)
            {
                obj = new crq(((koz) (obj)), kpp1);
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L11
_L7:
        if (l == 2 && ((jfw) (obj)).hasExtension(jfx.a))
        {
            obj = ((jfx)((jfw) (obj)).getExtension(jfx.a)).b;
            kpv kpv1 = (kpv)((koz) (obj)).getExtension(kpv.a);
            if (kpv1 != null && kpv1.o != null)
            {
                obj = new crp(((koz) (obj)), kpv1);
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (l == 3 && ((jfw) (obj)).hasExtension(jfv.a))
        {
            obj = ((jfv)((jfw) (obj)).getExtension(jfv.a)).b;
            kpw kpw1 = (kpw)((koz) (obj)).getExtension(kpw.a);
            if (kpw1 != null && kpw1.X != null)
            {
                if (i == 3)
                {
                    obj = new crs(((koz) (obj)), kpw1);
                } else
                {
                    obj = new cro(((koz) (obj)), kpw1);
                }
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (l == 5 && ((jfw) (obj)).hasExtension(jfz.a))
        {
            obj = ((jfz)((jfw) (obj)).getExtension(jfz.a)).b;
            kqv kqv1 = (kqv)((koz) (obj)).getExtension(kqv.a);
            if (kqv1 != null)
            {
                obj = new crn(((koz) (obj)), kqv1);
                continue; /* Loop/switch isn't completed */
            }
        }
_L11:
        ebw.f("Babel", "Received invalid attachment");
        obj = null;
        if (true) goto _L12; else goto _L2
_L2:
        return arraylist;
        if (true) goto _L14; else goto _L13
_L13:
    }
}
