// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gqc
{

    final gpy a = new gpy(100);

    public gqc()
    {
    }

    public boolean a(String s, gpu gpu1)
    {
        return a.a(gpu1.b()).matcher(s).matches();
    }

    public boolean a(String s, gpu gpu1, boolean flag)
    {
        s = a.a(gpu1.a()).matcher(s);
        return s.matches() || flag && s.lookingAt();
    }
}
