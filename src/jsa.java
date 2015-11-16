// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Map;

public abstract class jsa extends jso
    implements Map
{

    jsa()
    {
    }

    public static jsa a(Object obj, Object obj1)
    {
        return new jxr(obj, obj1);
    }

    public abstract jsa a();

    public jth b()
    {
        return a().f();
    }

    public jsd c()
    {
        return b();
    }

    public Collection values()
    {
        return b();
    }

    Object writeReplace()
    {
        return new jsc(this);
    }
}
