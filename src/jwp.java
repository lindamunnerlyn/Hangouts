// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;

final class jwp
    implements Serializable, joj
{

    private final int a;

    jwp(int i)
    {
        a = g.c(i, "expectedValuesPerKey");
    }

    public Object a()
    {
        return new ArrayList(a);
    }
}
