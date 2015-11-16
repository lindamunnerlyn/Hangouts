// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hch
{

    private final List a = new ArrayList();

    public hch(String as[], int ai[])
    {
        int i = 0;
        while (i < as.length) 
        {
            boolean flag;
            if (ai[i] == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.add(new hcg(as[i], flag));
            i++;
        }
    }

    public List a()
    {
        return Collections.unmodifiableList(a);
    }
}
