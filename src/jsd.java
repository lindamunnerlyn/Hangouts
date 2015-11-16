// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

final class jsd
    implements jgt
{

    jsd()
    {
    }

    public Object a(Object obj)
    {
        return Boolean.valueOf(Arrays.asList(((Constructor)obj).getParameterTypes()).contains(java/lang/String));
    }
}
