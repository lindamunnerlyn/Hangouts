// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jxe extends jsa
{

    static final jxe b;
    private final transient jss c[];
    private final transient jss d[];
    private final transient java.util.Map.Entry e[];
    private final transient int f;
    private final transient int g;
    private transient jsa h;

    private jxe(jss ajss[], jss ajss1[], java.util.Map.Entry aentry[], int j, int k)
    {
        c = ajss;
        d = ajss1;
        e = aentry;
        f = j;
        g = k;
    }

    static jxe a(int j, java.util.Map.Entry aentry[])
    {
        n.b(j, aentry.length);
        int k = jrx.b(j);
        int i1 = k - 1;
        jss ajss[] = new jss[k];
        jss ajss1[] = new jss[k];
        Object aobj[];
        int l;
        if (j == aentry.length)
        {
            aobj = aentry;
        } else
        {
            aobj = new jss[j];
        }
        l = 0;
        k = 0;
        while (k < j) 
        {
            java.util.Map.Entry entry = aentry[k];
            Object obj1 = entry.getKey();
            Object obj2 = entry.getValue();
            g.f(obj1, obj2);
            int j1 = obj1.hashCode();
            int k1 = obj2.hashCode();
            int l1 = jrx.a(j1) & i1;
            int i2 = jrx.a(k1) & i1;
            jss jss2 = ajss[l1];
            jxk.a(obj1, entry, jss2);
            jss jss1 = ajss1[i2];
            Object obj = jss1;
            while (obj != null) 
            {
                boolean flag1;
                if (!obj2.equals(((jss) (obj)).getValue()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(flag1, "value", entry, ((java.util.Map.Entry) (obj)));
                obj = ((jss) (obj)).b();
            }
            if (jss1 == null && jss2 == null)
            {
                boolean flag;
                if ((entry instanceof jss) && ((jss)entry).c())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    obj = (jss)entry;
                } else
                {
                    obj = new jss(obj1, obj2);
                }
            } else
            {
                obj = new jst(obj1, obj2, jss2, jss1);
            }
            ajss[l1] = ((jss) (obj));
            ajss1[i2] = ((jss) (obj));
            aobj[k] = obj;
            l += j1 ^ k1;
            k++;
        }
        return new jxe(ajss, ajss1, ((java.util.Map.Entry []) (aobj)), i1, l);
    }

    static jss[] a(jxe jxe1)
    {
        return jxe1.d;
    }

    static int b(jxe jxe1)
    {
        return jxe1.f;
    }

    static int c(jxe jxe1)
    {
        return jxe1.g;
    }

    static java.util.Map.Entry[] d(jxe jxe1)
    {
        return jxe1.e;
    }

    public jsa a()
    {
        Object obj;
        if (isEmpty())
        {
            obj = b;
        } else
        {
            jsa jsa1 = h;
            obj = jsa1;
            if (jsa1 == null)
            {
                jxf jxf1 = new jxf(this);
                h = jxf1;
                return jxf1;
            }
        }
        return ((jsa) (obj));
    }

    jth e()
    {
        if (isEmpty())
        {
            return jxl.a;
        } else
        {
            return new jsx(this, e);
        }
    }

    public Object get(Object obj)
    {
        if (c == null)
        {
            return null;
        } else
        {
            return jxk.a(obj, c, f);
        }
    }

    public int hashCode()
    {
        return g;
    }

    boolean i()
    {
        return true;
    }

    public int size()
    {
        return e.length;
    }

    static 
    {
        b = new jxe(null, null, jso.a, 0, 0);
    }
}
