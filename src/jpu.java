// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jpu extends jlb
{

    final jps a;

    jpu(jps jps1)
    {
        a = jps1;
        super();
    }

    public jlb a()
    {
        return a;
    }

    jmi c()
    {
        return new jpv(this);
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = jky.a(obj.hashCode());
            int j = a.b;
            jlu jlu1 = a.a[i & j];
            while (jlu1 != null) 
            {
                if (obj.equals(jlu1.getValue()))
                {
                    return jlu1.getKey();
                }
                jlu1 = jlu1.b();
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
        return new jpx(a);
    }
}
