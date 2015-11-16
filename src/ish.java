// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class ish
    implements joj
{

    private final joj a;
    private final joj b;

    public ish(joj joj1, joj joj2)
    {
        a = joj1;
        b = joj2;
    }

    public Object a()
    {
        boolean flag = true;
        Object obj = a;
        Set set = (Set)b.a();
        if (set.isEmpty())
        {
            obj = (hof)((joj) (obj)).a();
        } else
        {
            if (set.size() != 1)
            {
                flag = false;
            }
            g.d(flag, "More than one fragment lifecycle provider found");
            obj = (hof)((joj)set.iterator().next()).a();
        }
        if (obj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return obj;
        }
    }
}
