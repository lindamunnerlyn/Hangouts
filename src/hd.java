// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hd
    implements Cloneable
{

    private static final Object a = new Object();
    private boolean b;
    private long c[];
    private Object d[];
    private int e;

    public hd()
    {
        this((byte)0);
    }

    private hd(byte byte0)
    {
        b = false;
        byte0 = hb.b(10);
        c = new long[byte0];
        d = new Object[byte0];
        e = 0;
    }

    private long b(int i)
    {
        if (b)
        {
            c();
        }
        return c[i];
    }

    private hd b()
    {
        Object obj;
        try
        {
            obj = (hd)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.c = (long[])c.clone();
            obj.d = (Object[])((Object []) (d)).clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((hd) (obj));
        }
        return ((hd) (obj));
    }

    private void c()
    {
        int l = e;
        long al[] = c;
        Object aobj[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            Object obj = aobj[i];
            k = j;
            if (obj != a)
            {
                if (i != j)
                {
                    al[j] = al[i];
                    aobj[j] = obj;
                    aobj[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    public int a()
    {
        if (b)
        {
            c();
        }
        return e;
    }

    public Object a(int i)
    {
        if (b)
        {
            c();
        }
        return d[i];
    }

    public Object a(long l)
    {
        return b(l);
    }

    public void a(long l, Object obj)
    {
        int i = hb.a(c, e, l);
        if (i >= 0)
        {
            d[i] = obj;
            return;
        }
        int j = ~i;
        if (j < e && d[j] == a)
        {
            c[j] = l;
            d[j] = obj;
            return;
        }
        i = j;
        if (b)
        {
            i = j;
            if (e >= c.length)
            {
                c();
                i = ~hb.a(c, e, l);
            }
        }
        if (e >= c.length)
        {
            int k = hb.b(e + 1);
            long al[] = new long[k];
            Object aobj[] = new Object[k];
            System.arraycopy(c, 0, al, 0, c.length);
            System.arraycopy(((Object) (d)), 0, ((Object) (aobj)), 0, d.length);
            c = al;
            d = aobj;
        }
        if (e - i != 0)
        {
            System.arraycopy(c, i, c, i + 1, e - i);
            System.arraycopy(((Object) (d)), i, ((Object) (d)), i + 1, e - i);
        }
        c[i] = l;
        d[i] = obj;
        e = e + 1;
    }

    public Object b(long l)
    {
        int i = hb.a(c, e, l);
        if (i < 0 || d[i] == a)
        {
            return null;
        } else
        {
            return d[i];
        }
    }

    public void b(long l, Object obj)
    {
        if (e != 0 && l <= c[e - 1])
        {
            a(l, obj);
            return;
        }
        if (b && e >= c.length)
        {
            c();
        }
        int i = e;
        if (i >= c.length)
        {
            int j = hb.b(i + 1);
            long al[] = new long[j];
            Object aobj[] = new Object[j];
            System.arraycopy(c, 0, al, 0, c.length);
            System.arraycopy(((Object) (d)), 0, ((Object) (aobj)), 0, d.length);
            c = al;
            d = aobj;
        }
        c[i] = l;
        d[i] = obj;
        e = i + 1;
    }

    public void c(long l)
    {
        int i = hb.a(c, e, l);
        if (i >= 0 && d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public Object clone()
    {
        return b();
    }

    public String toString()
    {
        if (a() <= 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(e * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < e) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(b(i));
            stringbuilder.append('=');
            Object obj = a(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
