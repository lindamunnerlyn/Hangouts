// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class aeh
    implements adx
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final String i;
    private boolean j;
    private int k;

    private aeh(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            int l, String s7, boolean flag, int i1)
    {
        h = l;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        i = s7;
        j = flag;
        k = i1;
    }

    public static aeh a(List list, int l, String s, boolean flag, int i1)
    {
        String as[] = new String[7];
        int k1 = list.size();
        if (k1 > 7)
        {
            k1 = 7;
        }
        list = list.iterator();
        int j1 = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            as[j1] = (String)list.next();
            j1++;
        } while (j1 < k1);
        for (; j1 < 7; j1++)
        {
            as[j1] = null;
        }

        return new aeh(as[0], as[1], as[2], as[3], as[4], as[5], as[6], l, s, flag, i1);
    }

    public final adz a()
    {
        return adz.d;
    }

    public String a(int l)
    {
        int i1 = 6;
        int k1 = 1;
        boolean flag = true;
        StringBuilder stringbuilder = new StringBuilder();
        String as[] = new String[7];
        as[0] = a;
        as[1] = b;
        as[2] = c;
        as[3] = d;
        as[4] = e;
        as[5] = f;
        as[6] = g;
        if (adr.e(l))
        {
            l = ((flag) ? 1 : 0);
            while (i1 >= 0) 
            {
                String s = as[i1];
                k1 = l;
                if (!TextUtils.isEmpty(s))
                {
                    if (l == 0)
                    {
                        stringbuilder.append(' ');
                    } else
                    {
                        l = 0;
                    }
                    stringbuilder.append(s);
                    k1 = l;
                }
                i1--;
                l = k1;
            }
        } else
        {
            int j1 = 0;
            l = k1;
            while (j1 < 7) 
            {
                String s1 = as[j1];
                int l1 = l;
                if (!TextUtils.isEmpty(s1))
                {
                    if (l == 0)
                    {
                        stringbuilder.append(' ');
                    } else
                    {
                        l = 0;
                    }
                    stringbuilder.append(s1);
                    l1 = l;
                }
                j1++;
                l = l1;
            }
        }
        return stringbuilder.toString().trim();
    }

    public String b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aeh))
            {
                return false;
            }
            obj = (aeh)obj;
            if (h != ((aeh) (obj)).h || h == 0 && !TextUtils.equals(i, ((aeh) (obj)).i) || j != ((aeh) (obj)).j || !TextUtils.equals(a, ((aeh) (obj)).a) || !TextUtils.equals(b, ((aeh) (obj)).b) || !TextUtils.equals(c, ((aeh) (obj)).c) || !TextUtils.equals(d, ((aeh) (obj)).d) || !TextUtils.equals(e, ((aeh) (obj)).e) || !TextUtils.equals(f, ((aeh) (obj)).f) || !TextUtils.equals(g, ((aeh) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        return e;
    }

    public String g()
    {
        return f;
    }

    public String h()
    {
        return g;
    }

    public int hashCode()
    {
        int j1 = h;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        int l;
        int i1;
        if (i != null)
        {
            l = i.hashCode();
        } else
        {
            l = 0;
        }
        if (j)
        {
            i1 = 1231;
        } else
        {
            i1 = 1237;
        }
        l = i1 + (l + j1 * 31) * 31;
        s = a;
        s1 = b;
        s2 = c;
        s3 = d;
        s4 = e;
        s5 = f;
        s6 = g;
        i1 = 0;
        while (i1 < 7) 
        {
            String s7 = (new String[] {
                s, s1, s2, s3, s4, s5, s6
            })[i1];
            int k1;
            if (s7 != null)
            {
                k1 = s7.hashCode();
            } else
            {
                k1 = 0;
            }
            i1++;
            l = l * 31 + k1;
        }
        return l;
    }

    public int i()
    {
        return h;
    }

    public String j()
    {
        return i;
    }

    public String toString()
    {
        return String.format("type: %d, label: %s, isPrimary: %s, pobox: %s, extendedAddress: %s, street: %s, localty: %s, region: %s, postalCode %s, country: %s", new Object[] {
            Integer.valueOf(h), i, Boolean.valueOf(j), a, b, c, d, e, f, g
        });
    }
}
