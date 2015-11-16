// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jxf extends jsa
{

    final jxe b;

    jxf(jxe jxe1)
    {
        b = jxe1;
        super();
    }

    public jsa a()
    {
        return b;
    }

    jth e()
    {
        return new jxg(this);
    }

    public Object get(Object obj)
    {
        if (obj != null && jxe.a(b) != null)
        {
            int i = jrx.a(obj.hashCode());
            int j = jxe.b(b);
            jss jss1 = jxe.a(b)[i & j];
            while (jss1 != null) 
            {
                if (obj.equals(jss1.getValue()))
                {
                    return jss1.getKey();
                }
                jss1 = jss1.b();
            }
        }
        return null;
    }

    public int size()
    {
        return a().size();
    }

    Object writeReplace()
    {
        return new jxi(b);
    }
}
