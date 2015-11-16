// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jxk extends jso
{

    private static final long serialVersionUID = 0L;
    private final transient java.util.Map.Entry b[];
    private final transient jss c[];
    private final transient int d;

    private jxk(java.util.Map.Entry aentry[], jss ajss[], int i)
    {
        b = aentry;
        c = ajss;
        d = i;
    }

    static Object a(Object obj, jss ajss[], int i)
    {
        if (obj != null)
        {
            ajss = ajss[jrx.a(obj.hashCode()) & i];
            while (ajss != null) 
            {
                if (obj.equals(ajss.getKey()))
                {
                    return ajss.getValue();
                }
                ajss = ajss.a();
            }
        }
        return null;
    }

    static jxk a(int i, java.util.Map.Entry aentry[])
    {
        n.b(i, aentry.length);
        Object aobj[];
        jss ajss[];
        int j;
        int k;
        if (i == aentry.length)
        {
            aobj = aentry;
        } else
        {
            aobj = new jss[i];
        }
        j = jrx.b(i);
        ajss = new jss[j];
        k = j - 1;
        j = 0;
        while (j < i) 
        {
            Object obj = aentry[j];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            Object obj2 = ((java.util.Map.Entry) (obj)).getValue();
            g.f(obj1, obj2);
            int l = jrx.a(obj1.hashCode()) & k;
            jss jss1 = ajss[l];
            if (jss1 == null)
            {
                boolean flag;
                if ((obj instanceof jss) && ((jss)obj).c())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    obj = (jss)obj;
                } else
                {
                    obj = new jss(obj1, obj2);
                }
            } else
            {
                obj = new jsu(obj1, obj2, jss1);
            }
            ajss[l] = ((jss) (obj));
            aobj[j] = ((java.util.Map.Entry) (obj));
            a(obj1, ((java.util.Map.Entry) (obj)), jss1);
            j++;
        }
        return new jxk(((java.util.Map.Entry []) (aobj)), ajss, k);
    }

    static void a(Object obj, java.util.Map.Entry entry, jss jss1)
    {
        while (jss1 != null) 
        {
            boolean flag;
            if (!obj.equals(jss1.getKey()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag, "key", entry, ((java.util.Map.Entry) (jss1)));
            jss1 = jss1.a();
        }
    }

    jth e()
    {
        return new jsx(this, b);
    }

    public Object get(Object obj)
    {
        return a(obj, c, d);
    }

    public int size()
    {
        return b.length;
    }
}
