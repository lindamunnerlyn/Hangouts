// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Set;

final class jkg extends jkc
    implements Set
{

    final jjt a;

    jkg(jjt jjt1, Object obj, Set set)
    {
        a = jjt1;
        super(jjt1, obj, set, null);
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = h.a((Set)c, collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                jjt.a(a, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }
}
