// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jqa extends jlr
{

    private static final long serialVersionUID = 0L;
    private final transient jlu a[];
    private final transient jlu b[];
    private final transient int c;

    jqa(int i, jlv ajlv[])
    {
        a = new jlu[i];
        int j = jky.b(i);
        b = new jlu[j];
        c = j - 1;
        for (int k = 0; k < i; k++)
        {
            Object obj = ajlv[k];
            Object obj1 = ((jlv) (obj)).getKey();
            int l = jky.a(obj1.hashCode()) & c;
            jlu jlu1 = b[l];
            if (jlu1 != null)
            {
                obj = new jqc(((jlu) (obj)), jlu1);
            }
            b[l] = ((jlu) (obj));
            a[k] = ((jlu) (obj));
            while (jlu1 != null) 
            {
                boolean flag;
                if (!obj1.equals(jlu1.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag, "key", ((java.util.Map.Entry) (obj)), jlu1);
                jlu1 = jlu1.a();
            }
        }

    }

    transient jqa(jlv ajlv[])
    {
        this(4, ajlv);
    }

    static jlu[] a(jqa jqa1)
    {
        return jqa1.a;
    }

    jmi c()
    {
        return new jqb(this);
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = jky.a(obj.hashCode());
            int j = c;
            jlu jlu1 = b[i & j];
            while (jlu1 != null) 
            {
                if (obj.equals(jlu1.getKey()))
                {
                    return jlu1.getValue();
                }
                jlu1 = jlu1.a();
            }
        }
        return null;
    }

    public int size()
    {
        return a.length;
    }
}
