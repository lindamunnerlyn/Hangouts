// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

public final class lgu
    implements lgt
{

    public lgu()
    {
    }

    public Set a()
    {
        return Collections.singleton("UTC");
    }

    public ldd a(String s)
    {
        if ("UTC".equalsIgnoreCase(s))
        {
            return ldd.a;
        } else
        {
            return null;
        }
    }
}
