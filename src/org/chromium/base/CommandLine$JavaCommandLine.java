// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.HashMap;

// Referenced classes of package org.chromium.base:
//            CommandLine

class  extends CommandLine
{

    private HashMap a;

    public boolean a(String s)
    {
        return a.containsKey(s);
    }

    public String b(String s)
    {
label0:
        {
            String s1 = (String)a.get(s);
            if (s1 != null)
            {
                s = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            s = null;
        }
        return s;
    }
}
