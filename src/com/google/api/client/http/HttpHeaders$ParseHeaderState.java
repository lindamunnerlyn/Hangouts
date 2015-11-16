// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import hrq;
import hry;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.api.client.http:
//            HttpHeaders

final class arrayValueMap
{

    final hrq arrayValueMap;
    final hry classInfo;
    final List context;
    final StringBuilder logger;

    void finish()
    {
        arrayValueMap.a();
    }

    public (HttpHeaders httpheaders, StringBuilder stringbuilder)
    {
        Class class1 = httpheaders.getClass();
        context = Arrays.asList(new Type[] {
            class1
        });
        classInfo = hry.a(class1, true);
        logger = stringbuilder;
        arrayValueMap = new hrq(httpheaders);
    }
}
