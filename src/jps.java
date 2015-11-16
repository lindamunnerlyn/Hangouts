// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jps extends jlb
{

    final transient jlu a[];
    final transient int b;
    private final transient jlu c[];
    private final transient jlu d[];
    private final transient int e;
    private transient jlb f;

    jps(int i, jlv ajlv[])
    {
        int j = jky.b(i);
        b = j - 1;
        jlu ajlu[] = new jlu[j];
        jlu ajlu1[] = new jlu[j];
        jlu ajlu2[] = new jlu[i];
        int k = 0;
        j = 0;
        while (k < i) 
        {
            jlv jlv1 = ajlv[k];
            Object obj1 = jlv1.getKey();
            Object obj2 = jlv1.getValue();
            int l = obj1.hashCode();
            int i1 = obj2.hashCode();
            int j1 = jky.a(l) & b;
            int k1 = jky.a(i1) & b;
            jlu jlu1 = ajlu[j1];
            Object obj = jlu1;
            while (obj != null) 
            {
                boolean flag;
                if (!obj1.equals(((jlu) (obj)).getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag, "key", jlv1, ((java.util.Map.Entry) (obj)));
                obj = ((jlu) (obj)).a();
            }
            obj1 = ajlu1[k1];
            obj = obj1;
            while (obj != null) 
            {
                boolean flag1;
                if (!obj2.equals(((jlu) (obj)).getValue()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(flag1, "value", jlv1, ((java.util.Map.Entry) (obj)));
                obj = ((jlu) (obj)).b();
            }
            if (jlu1 == null && obj1 == null)
            {
                obj = jlv1;
            } else
            {
                obj = new jpy(jlv1, jlu1, ((jlu) (obj1)));
            }
            ajlu[j1] = ((jlu) (obj));
            ajlu1[k1] = ((jlu) (obj));
            ajlu2[k] = ((jlu) (obj));
            k++;
            j += l ^ i1;
        }
        c = ajlu;
        a = ajlu1;
        d = ajlu2;
        e = j;
    }

    static jlu[] a(jps jps1)
    {
        return jps1.d;
    }

    static int b(jps jps1)
    {
        return jps1.e;
    }

    public jlb a()
    {
        jlb jlb1 = f;
        Object obj = jlb1;
        if (jlb1 == null)
        {
            obj = new jpu(this);
            f = ((jlb) (obj));
        }
        return ((jlb) (obj));
    }

    jmi c()
    {
        return new jpt(this);
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = jky.a(obj.hashCode());
            int j = b;
            jlu jlu1 = c[i & j];
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
        return d.length;
    }
}
