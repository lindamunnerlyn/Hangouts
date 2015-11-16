// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Locale;

public final class lgf
{

    ldd a;
    Integer b;
    lgg c[];
    int d;
    boolean e;
    private final lcw f;
    private final long g = 0L;
    private Locale h;
    private Integer i;
    private int j;
    private Object k;

    public lgf(lcw lcw1, Locale locale, Integer integer, int l)
    {
        c = new lgg[8];
        lcw1 = ldb.a(lcw1);
        a = lcw1.a();
        f = lcw1.b();
        lcw1 = locale;
        if (locale == null)
        {
            lcw1 = Locale.getDefault();
        }
        h = lcw1;
        i = integer;
        j = l;
    }

    static int a(ldh ldh1, ldh ldh2)
    {
        if (ldh1 == null || !ldh1.b())
        {
            return ldh2 != null && ldh2.b() ? -1 : 0;
        }
        if (ldh2 == null || !ldh2.b())
        {
            return 1;
        } else
        {
            return -ldh1.compareTo(ldh2);
        }
    }

    private void a(lgg lgg1)
    {
        lgg algg[] = c;
        int i1 = d;
        if (i1 == algg.length || e)
        {
            lgg algg1[];
            int l;
            if (i1 == algg.length)
            {
                l = i1 << 1;
            } else
            {
                l = algg.length;
            }
            algg1 = new lgg[l];
            System.arraycopy(algg, 0, algg1, 0, i1);
            c = algg1;
            e = false;
            algg = algg1;
        }
        k = null;
        algg[i1] = lgg1;
        d = i1 + 1;
    }

    public long a(boolean flag, String s)
    {
        Object obj;
        int k1;
        long l1;
        obj = c;
        k1 = d;
        if (e)
        {
            obj = (lgg[])c.clone();
            c = ((lgg []) (obj));
            e = false;
        }
        ldh ldh1;
        ldh ldh2;
        ldh ldh3;
        if (k1 > 10)
        {
            Arrays.sort(((Object []) (obj)), 0, k1);
        } else
        {
            int l = 0;
            while (l < k1) 
            {
                for (int j1 = l; j1 > 0 && obj[j1 - 1].a(obj[j1]) > 0; j1--)
                {
                    lgg lgg1 = obj[j1];
                    obj[j1] = obj[j1 - 1];
                    obj[j1 - 1] = lgg1;
                }

                l++;
            }
        }
        if (k1 <= 0) goto _L2; else goto _L1
_L1:
        ldh1 = ldi.i().a(f);
        ldh2 = ldi.f().a(f);
        ldh3 = obj[0].a.d();
        if (a(ldh3, ldh1) < 0 || a(ldh3, ldh2) > 0) goto _L2; else goto _L3
_L3:
        a(lcz.s(), j);
        l1 = a(flag, s);
_L7:
        return l1;
_L2:
        Object obj1;
        int i1;
        long l2;
        l1 = g;
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            try
            {
                l1 = obj[i1].a(l1, flag);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (s != null)
                {
                    ((ldk) (obj)).a((new StringBuilder(String.valueOf(s).length() + 15)).append("Cannot parse \"").append(s).append("\"").toString());
                }
                throw obj;
            }
            i1++;
        } while (true);
        l2 = l1;
          goto _L4
_L6:
        l1 = ((lgg) (obj1)).a(l1, flag);
        i1++;
          goto _L5
_L12:
        flag = false;
          goto _L6
_L9:
        if (b != null)
        {
            return l2 - (long)b.intValue();
        }
        l1 = l2;
        if (a != null)
        {
            i1 = a.c(l2);
            l2 -= i1;
            l1 = l2;
            if (i1 != a.b(l2))
            {
                obj = String.valueOf(a);
                obj1 = (new StringBuilder(String.valueOf(obj).length() + 53)).append("Illegal instant due to time zone offset transition (").append(((String) (obj))).append(")").toString();
                obj = obj1;
                if (s != null)
                {
                    obj = (new StringBuilder(String.valueOf(s).length() + 17 + String.valueOf(obj1).length())).append("Cannot parse \"").append(s).append("\": ").append(((String) (obj1))).toString();
                }
                throw new ldl(((String) (obj)));
            }
        }
          goto _L7
_L4:
        if (!flag) goto _L9; else goto _L8
_L8:
        i1 = 0;
_L5:
        l2 = l1;
        if (i1 >= k1) goto _L9; else goto _L10
_L10:
        obj1 = obj[i1];
        if (i1 != k1 - 1) goto _L12; else goto _L11
_L11:
        flag = true;
          goto _L6
    }

    public lcw a()
    {
        return f;
    }

    public void a(Integer integer)
    {
        k = null;
        b = integer;
    }

    public void a(lcy lcy1, int l)
    {
        a(new lgg(lcy1, l));
    }

    public void a(lcz lcz1, int l)
    {
        a(new lgg(lcz1.a(f), l));
    }

    public void a(lcz lcz1, String s, Locale locale)
    {
        a(new lgg(lcz1.a(f), s, locale));
    }

    public void a(ldd ldd1)
    {
        k = null;
        a = ldd1;
    }

    public boolean a(Object obj)
    {
        if ((obj instanceof lgh) && ((lgh)obj).a(this))
        {
            k = obj;
            return true;
        } else
        {
            return false;
        }
    }

    public Locale b()
    {
        return h;
    }

    public Integer c()
    {
        return i;
    }

    public Object d()
    {
        if (k == null)
        {
            k = new lgh(this);
        }
        return k;
    }
}
